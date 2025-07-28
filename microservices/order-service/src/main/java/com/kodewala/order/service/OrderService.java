package com.kodewala.order.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kodewala.order.cleint.ProductClient;
import com.kodewala.order.entity.Order;
import com.kodewala.order.kafka.service.KafkaProducerService;
import com.kodewala.order.model.Product;
import com.kodewala.order.repository.OrderRepository;

@Service
public class OrderService {

	private final OrderRepository orderRepository;
	private final ProductClient productClient; // Feign client or REST client to get product details
	private final KafkaProducerService kafkaProducerService;

	public OrderService(OrderRepository orderRepository, ProductClient productClient,
			KafkaProducerService kafkaProducerService) {
		this.orderRepository = orderRepository;
		this.productClient = productClient;
		this.kafkaProducerService = kafkaProducerService;
	}

	public Order placeOrder(Long productId, int quantity, String orderStatus) {
		// 1. Get product details from product service
		Product product = productClient.getProductById(productId);

		// 2. Create new order entity
		Order order = new Order();
		order.setProductId(productId);
		order.setQuantity(quantity);
		order.setOrderStatus(orderStatus);
		order.setTotalPrice(product.getPrice() * quantity); // calculate total price

		// 3. Save order to DB
		order = orderRepository.save(order);
		
		try {
			String orderJson = new ObjectMapper().writeValueAsString(order);
			kafkaProducerService.sendMessage(orderJson); // uses KafkaTemplate internally
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return order;
	}

	public Order getOrder(Long id) {
		return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
	}

}

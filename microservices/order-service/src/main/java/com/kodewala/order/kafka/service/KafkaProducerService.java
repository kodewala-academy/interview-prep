package com.kodewala.order.kafka.service;

import java.util.concurrent.ExecutionException;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.kodewala.order.config.TracingFeignConfig;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@Service
public class KafkaProducerService {

	private final TracingFeignConfig tracingFeignConfig;

	private static final String TOPIC = "order-placed";

	private final KafkaTemplate<String, String> kafkaTemplate;

	public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate, TracingFeignConfig tracingFeignConfig) {
		this.kafkaTemplate = kafkaTemplate;
		this.tracingFeignConfig = tracingFeignConfig;
	}

	@Retry(name = "kafkaRetry", fallbackMethod = "kafkaFallback")
	@CircuitBreaker(name = "kafkaPublisher", fallbackMethod = "kafkaFallback")
	public void sendMessage(String message) {
		System.out.println("KafkaProducerService.sendMessage() sending message to kafka...");
		try {
			kafkaTemplate.send(TOPIC, message).get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sent message to Kafka: " + message);
	}

	public void kafkaFallback(String message, Throwable ex) {
		System.out.println("Kafka failed after retries. CircuitBreaker triggered.");
		System.out.println("Reason: " + ex.getMessage());
	}
}

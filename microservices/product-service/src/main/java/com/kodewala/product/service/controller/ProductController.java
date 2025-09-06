package com.kodewala.product.service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.product.service.entity.Product;
import com.kodewala.product.service.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(ProductController.class);

	private final ProductRepository productRepository;

	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@PostMapping
	public Product addProduct(@RequestBody Product p) {
		return productRepository.save(p);
	}

	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Long id) {
		log.info("Get product : {}", id);
		return productRepository.findById(id).orElseThrow();
	}

	@GetMapping
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
}

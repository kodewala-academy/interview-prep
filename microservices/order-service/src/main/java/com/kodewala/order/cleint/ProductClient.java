package com.kodewala.order.cleint;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kodewala.order.config.TracingFeignConfig;
import com.kodewala.order.model.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@FeignClient(name = "product-service" , configuration = TracingFeignConfig.class)
public interface ProductClient {
	
	@CircuitBreaker(name = "productServiceCB", fallbackMethod = "fallbackProduct")
	@Retry(name = "productServiceRetry")
	@GetMapping("/products/{id}")
	Product getProductById(@PathVariable("id") Long id);

	default Product fallbackProduct(Long id, Throwable ex) {
		// this will get triggred / executed if CB executes.
		//
	    throw new RuntimeException("Product service is unavailable");
	}

}

package com.kodewala.order.cleint;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kodewala.order.config.TracingFeignConfig;
import com.kodewala.order.model.Product;

@FeignClient(name = "product-service" , configuration = TracingFeignConfig.class)
public interface ProductClient {
	@GetMapping("/products/{id}")
	Product getProductById(@PathVariable("id") Long id);
}

package com.kodewala.product.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewala.product.service.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

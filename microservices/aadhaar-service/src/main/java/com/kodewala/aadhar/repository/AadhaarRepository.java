package com.kodewala.aadhar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewala.aadhar.entity.AadhaarRegistration;

public interface AadhaarRepository extends JpaRepository<AadhaarRegistration, Long> {
}

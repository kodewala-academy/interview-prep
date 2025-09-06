package com.kodewala.aadhar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.aadhar.entity.AadhaarRegistration;
import com.kodewala.aadhar.repository.AadhaarRepository;

@RestController
public class AadhaarController {

	@Autowired
	private AadhaarRepository repository;

	@PostMapping("/register")
	public AadhaarRegistration register(@RequestBody AadhaarRegistration registration) {
		registration.setStatus("PENDING");
		return repository.save(registration);
	}

	@GetMapping("/track/{id}")
	public String track(@PathVariable Long id) {
		return repository.findById(id).map(AadhaarRegistration::getStatus).orElse("ID not found");
	}
}

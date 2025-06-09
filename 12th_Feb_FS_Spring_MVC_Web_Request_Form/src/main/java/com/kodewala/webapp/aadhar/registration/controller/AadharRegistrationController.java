package com.kodewala.webapp.aadhar.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AadharRegistrationController
{

	@PostMapping("/register")
	@ResponseBody
	public String registerForAadhar(@RequestParam("firstName") String firstName, @RequestParam("mobile") String mobile)
	{
		System.out.println("registerForAadhar:::::::::");
		System.out.println("First Name: " + firstName);
		System.out.println("Mobile: " + mobile);
		
		// Call Service and DAO.. Insert Data into database....
		
		return "You have registered for an aadhar. You will receive an update on your registered mobile number: "
				+ mobile;
	}
}

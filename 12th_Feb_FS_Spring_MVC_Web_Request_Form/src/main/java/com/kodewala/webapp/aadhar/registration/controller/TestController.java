package com.kodewala.webapp.aadhar.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController
{

	

	@GetMapping("/showRegisterForm")
	public String showRegisterForm()
	{

		System.out.println("TestController.showRegisterForm()");

		return "showRegisterForm";
	}

}

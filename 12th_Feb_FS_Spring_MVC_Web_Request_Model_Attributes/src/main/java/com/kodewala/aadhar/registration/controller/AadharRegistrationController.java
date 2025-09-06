package com.kodewala.aadhar.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodewala.aadhar.registration.controller.bean.UserInfo;

@Controller
public class AadharRegistrationController
{
	@GetMapping("/displayRegistrationForm")
	public String showRegistrationForm()
	{
		return "showRegisterForm";
	}

	@PostMapping("/register")
	@ResponseBody
	public String doRegistration(@ModelAttribute UserInfo userInfo)
	{
		System.out.println(" First Name ::" + userInfo.getFirstName());
		System.out.println(" Last Name ::" + userInfo.getLastName());
		System.out.println(" Mobile ::" + userInfo.getMobile());
		System.out.println(" Email ::" + userInfo.getEmail());

		return " aadhar registration details received for user " + userInfo.getMobile();
     
	}

}

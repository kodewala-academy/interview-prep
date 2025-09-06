package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodewala.beans.UserInfo;

@Controller
public class AadharRegController
{

	@GetMapping("/showRegisterForm")
	public String showRegisterForm()
	{

		System.out.println("TestController.showRegisterForm()");

		return "showRegisterForm";
	}

	@PostMapping("/register")
	public String registerForAadhar(@ModelAttribute UserInfo info, Model model)
	{

		System.out.println("First Name: " + info.getFirstName());
		System.out.println("Mobile: " + info.getMobile());

		int confirmationNumber = 100000 + (int) (Math.random() * 900000);

		info.setConfirmationNumber(confirmationNumber + "");
		
		model.addAttribute("user", info);

		return "displayConfirmation";
	}

}

package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodewala.entities.Users;

@Controller
public class MyController
{
	@GetMapping("/regPage")
	public String openRegPage(org.springframework.ui.Model model)
	{
		model.addAttribute("user", new Users());
		return "register";
	}
	
	
	@PostMapping("/regForm")
	public String regForm(@ModelAttribute("user") Users users)
	{
		  String name = users.getName();
		  System.out.println(name+" ::::::::::::::::::::::::::::::::::");
		return "register";
	}
}

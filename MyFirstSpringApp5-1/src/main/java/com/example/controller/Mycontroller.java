package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller
{

	@GetMapping
	@ResponseBody
	public String saySomething()
	{
		return "Welcome to kodewala!!!!";
	}
}

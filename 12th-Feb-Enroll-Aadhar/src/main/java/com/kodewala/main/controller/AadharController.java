package com.kodewala.main.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodewala.main.beans.AadharInfo;
import com.kodewala.main.services.AadharRegistrationImpl;

@Controller
public class AadharController
{
	@Autowired
	AadharRegistrationImpl aadharRegistrationImpl;

	@GetMapping("/")
	public String showRegistrationPage(Model model)
	{
		long startTime = System.currentTimeMillis();
		
		AadharInfo aadharInfo = new AadharInfo();
		model.addAttribute("aadharInfo", aadharInfo);
		
		long endTime = System.currentTimeMillis();
		
		long totalTime = endTime - startTime;
		return "registration";
	}

	@PostMapping("/submitAadhar")
	public String enrollment(Model model, @ModelAttribute AadharInfo aadharInfo)
	{
		// Calling Service layer...

		boolean status = aadharRegistrationImpl.doAadharRegistration(aadharInfo);

		System.out.println("AadharController.enrollment() and status is " + status);
		if (status)
		{
			return "success";
		} else
		{
			return "error";
		}
	}

}

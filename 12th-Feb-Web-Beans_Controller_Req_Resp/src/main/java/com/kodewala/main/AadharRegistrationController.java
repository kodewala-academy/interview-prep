package com.kodewala.main;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodewala.main.bean.AadharInfo;

@Controller
public class AadharRegistrationController
{

	@GetMapping("/")
	public String showRegistrationPage(Model model)
	{
		AadharInfo aadharInfo = new AadharInfo();
		model.addAttribute("aadharInfo", aadharInfo);
		return "registration";
	}

	@PostMapping("/submitAadhar")
	public String enrollment(Model model, @ModelAttribute AadharInfo aadharInfo)
	{
		String firstName = aadharInfo.getFirstName();
		String lastNmae = aadharInfo.getLastName();
		String mobile = aadharInfo.getMobile();

		System.out.println(" first Name : " + firstName);
		System.out.println(" last Name : " + lastNmae);
		System.out.println(" mobile : " + mobile);

		String referenceNumber = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
		System.out.println(" referenceNumber "+referenceNumber);
		
		return "success";
	}

}

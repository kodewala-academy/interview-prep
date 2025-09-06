package com.kodewala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.kodewala.SpringBootUserRegistrationApplication;
import com.kodewala.entities.Users;
import com.kodewala.services.UserService;

@Controller
public class UserController
{
	@Autowired
	private UserService userService;

    private final SpringBootUserRegistrationApplication springBootUserRegistrationApplication;

    UserController(SpringBootUserRegistrationApplication springBootUserRegistrationApplication) {
        this.springBootUserRegistrationApplication = springBootUserRegistrationApplication;
    }

	@GetMapping("/regPage")
	public String showRegistrationPage(Model model)
	{
		model.addAttribute("user", new Users());
		return "register";
	}

	@PostMapping("/regForm")
	public String submitUserInfo(@ModelAttribute("user") Users user, Model Model)
	{
		System.out.println(user.getEmail()+" ::::::: ");
		boolean status = userService.addUsers(user);
		
		if(status)
		{
			Model.addAttribute("successMsg", "User registered Successfully");
		}
		else
		{
			Model.addAttribute("errorMsg", "User registered Successfully");
		}
		return "register";
	}
}

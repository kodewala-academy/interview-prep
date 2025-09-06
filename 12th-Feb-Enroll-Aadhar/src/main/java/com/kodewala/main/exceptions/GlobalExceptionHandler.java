package com.kodewala.main.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler
{

	@ExceptionHandler(UserRegistrationException.class)
	public String handleUserRegistrationException(UserRegistrationException ex, Model model)
	{
		model.addAttribute("errorMessage", ex.getMessage());
		return "error"; // returns error.html view
	}

	@ExceptionHandler(UserAlreadyAppliedForAadhar.class)
	public String handleUserAlreadyAppliedForAadhar(UserAlreadyAppliedForAadhar ex, Model model)
	{
		model.addAttribute("errorMessage", ex.getMessage());
		return "error";
	}

	@ExceptionHandler(Exception.class)
	public String handleGenericException(Exception ex, Model model)
	{
		model.addAttribute("errorMessage", "Something went wrong: " + ex.getMessage());
		return "error";
	}
}

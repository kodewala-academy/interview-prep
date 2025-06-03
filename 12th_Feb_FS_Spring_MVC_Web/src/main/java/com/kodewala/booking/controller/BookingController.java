package com.kodewala.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookingController
{
	@RequestMapping("/bookingService")
	public ModelAndView bookCab()
	{

		System.out.println("BookingController.bookCab()");
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("bookingConfirmation"); // \WEB-INF\views\bookingConfirmation.jsp
		return modelAndView;
	}

}

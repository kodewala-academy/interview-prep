package com.kodewala.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CancelBookingController
{
	@RequestMapping("/cancelBooking")
	public ModelAndView cancelCab()
	{

		System.out.println("CancelBookingController.cancelCab()");
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("cancelConfirmation"); // \WEB-INF\views\bookingConfirmation.jsp
		return modelAndView;
	}

}

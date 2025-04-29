package com.kodewala;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{
	@RequestMapping("/myPage")
	public ModelAndView viewPage()
	{
		System.out.println("MyController.viewPage()");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("result");
		return modelAndView;
	}
	
	@RequestMapping("/myPage1")
	public ModelAndView viewPage1()
	{
		System.out.println("MyController.viewPage1()");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("result1");
		return modelAndView;
	}
	
	@RequestMapping("/myForm")
	public String openMyPage()
	{
		return "my-form";
	}

}

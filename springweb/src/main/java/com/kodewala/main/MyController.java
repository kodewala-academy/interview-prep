package com.kodewala.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{

	@RequestMapping("/myPage")
	public ModelAndView viewMyPage()
	{
		System.out.println("MyController.viewMyPage()");
		ModelAndView andView = new ModelAndView();
		andView.setViewName("hello");
		return andView;
	}
}

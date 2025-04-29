package com.kodewala.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{
	@RequestMapping("/myPage")
	public ModelAndView myPage()
	{
		System.out.println("MyController.myPage()");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("result"); // \WEB-INF\views\result.jsp
		return modelAndView;

	}
}

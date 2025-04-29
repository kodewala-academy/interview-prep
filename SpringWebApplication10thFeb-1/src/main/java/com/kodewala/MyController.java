package com.kodewala;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kodewala.beans.User;

import jakarta.servlet.http.HttpServletRequest;

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
	public String displayMyForm()
	{
		return "my-form";
	}

	// 1st Method

	/*
	 * @PostMapping("/submitForm") public String handleMyFormData(HttpServletRequest
	 * request)
	 * 
	 * { String name = request.getParameter("name1"); String email =
	 * request.getParameter("email1"); String phone =
	 * request.getParameter("phoneno1");
	 * 
	 * System.out.println(" name " + name); System.out.println(" email " + email);
	 * System.out.println(" phone " + phone);
	 * 
	 * return "display-data"; }
	 */

	// 2nd Method

	/*
	 * @PostMapping("/submitForm") public String
	 * handleMyFormData(@RequestParam("email1") String
	 * name, @RequestParam("phoneno1") String phone,
	 * 
	 * @RequestParam("email1") String email, Model model)
	 * 
	 * {
	 * 
	 * System.out.println(" name :::: " + name); System.out.println(" email ::: " +
	 * email); System.out.println(" phone ::: " + phone);
	 * 
	 * model.addAttribute("model_name", name); model.addAttribute("model_email",
	 * email); model.addAttribute("model_phone", phone);
	 * 
	 * return "display-data"; }
	 */

	/*
	 * // 3rd method
	 * 
	 * @PostMapping("/submitForm") public String
	 * handleMyFormData(@RequestParam("email1") String
	 * name, @RequestParam("phoneno1") String phone,
	 * 
	 * @RequestParam("email1") String email, Model model)
	 * 
	 * {
	 * 
	 * System.out.println(" name ::::> " + name); System.out.println(" email :::> "
	 * + email); System.out.println(" phone :::> " + phone);
	 * 
	 * User user = new User();
	 * 
	 * user.setName(name); user.setEmail(email); user.setPhoneNo(phone);
	 * 
	 * model.addAttribute("model_user", user);
	 * 
	 * return "display-data"; }
	 */

	// 3rd method

	@PostMapping("/submitForm")
	public String handleMyFormData(@ModelAttribute User user)

	{

		System.out.println(" name ::::>>>>> " + user.getName());
		System.out.println(" email :::>>>>> " + user.getEmail());
		System.out.println(" phone :::>>>>> " + user.getPhoneNo());

		return "display-data";
	}

}

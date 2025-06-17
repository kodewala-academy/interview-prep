package com.kodewala.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.main.beans.UserInfo;

@RestController // (@controller + @responsebody)
public class TestController
{
	@Autowired
	UserInfo userInfo;
	
	@GetMapping("/")
	public String viewUserInfo()
	{
		return "This is from controller and "+userInfo.showUserInfo();
	}

	@GetMapping("/register")
	public String register()
	{
		return "Display Registration form";
	}

}

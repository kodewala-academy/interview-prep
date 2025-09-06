package com.kodewala.main.beans;

import org.springframework.stereotype.Component;

@Component
public class UserInfo
{
	public String showUserInfo()
	{
		return "This bean is created from user info object";
	}
}

package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Account
{
	public void showInfo(String _name)
	{
		System.out.println(" Welcome to Kodewala, " + _name);
	}
}

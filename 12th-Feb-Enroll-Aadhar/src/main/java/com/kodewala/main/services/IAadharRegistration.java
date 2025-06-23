package com.kodewala.main.services;

import org.springframework.stereotype.Service;

import com.kodewala.main.beans.AadharInfo;

@Service
public interface IAadharRegistration
{
	public boolean doAadharRegistration(AadharInfo aadharInfo);
}

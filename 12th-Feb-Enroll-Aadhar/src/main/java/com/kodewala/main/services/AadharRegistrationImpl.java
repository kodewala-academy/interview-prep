package com.kodewala.main.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.main.beans.AadharInfo;
import com.kodewala.main.entity.UserInfo;
import com.kodewala.main.repository.AadharRepo;

@Service
public class AadharRegistrationImpl implements IAadharRegistration
{
	@Autowired
	AadharRepo aadharRepo;

	@Override
	public boolean doAadharRegistration(AadharInfo aadharInfo)
	{
		boolean isEnrolled = false;
		
		String firstName = aadharInfo.getFirstName();
		String lastName = aadharInfo.getLastName();
		String mobile = aadharInfo.getMobile();

		System.out.println(" first Name : " + firstName);
		System.out.println(" last Name : " + lastName);
		System.out.println(" mobile : " + mobile);

		String referenceNumber = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
		
		System.out.println(" referenceNumber " + referenceNumber);

		// create entity object and set required values.

		UserInfo userInfo = new UserInfo();

		userInfo.setFirstName(firstName);
		userInfo.setLastName(lastName);
		userInfo.setMobile(mobile);
		userInfo.setRefNo(referenceNumber);

		UserInfo userInfoReturn = aadharRepo.save(userInfo);

		if (userInfoReturn != null)
		{
			isEnrolled = true;
		}
		return isEnrolled;

	}

}

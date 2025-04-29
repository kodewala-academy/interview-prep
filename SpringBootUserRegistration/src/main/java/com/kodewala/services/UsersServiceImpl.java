package com.kodewala.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.entities.Users;
import com.kodewala.repository.UserRepository;

@Service
public class UsersServiceImpl implements UserService
{
	@Autowired
	private UserRepository repository;

	@Override
	public boolean addUsers(Users user)
	{
		boolean status = false;
		try
		{
			repository.save(user);
			status = true;
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		return status;
	}

}

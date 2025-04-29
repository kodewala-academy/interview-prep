package com.kodewala.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kodewala.main.entity.User;

@SpringBootApplication
public class SpringBootJdbc1Application implements CommandLineRunner
{
	@Autowired
	private com.kodewala.main.dao.UserDao userDao;

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootJdbc1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		User user = new User("Kodewala1", "info@kodewala1.com", "F", "India");
		// Call the DAO layer
		boolean status = userDao.insertUser(user);

		if (status)
		{
			System.out.println(" Data Inserted successfully!");
		} else
		{
			System.out.println(" Unable to insert data!");
		}

		User user1 = userDao.getUserByemail("info@kodewala.com");
		System.out.println(user1.getName() + " and " + user1.getGender());
	}

}

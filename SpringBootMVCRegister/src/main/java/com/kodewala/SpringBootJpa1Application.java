package com.kodewala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kodewala.entities.Users;
import com.kodewala.repository.UserRepository;
import com.kodewala.services.UserService;
import com.kodewala.services.UsersServiceImpl;

@SpringBootApplication
public class SpringBootJpa1Application
{


	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringBootJpa1Application.class, args);

		UsersServiceImpl usersServiceImpl = context.getBean(UsersServiceImpl.class);

		Users users = new Users();

		users.setEmail("info@kodewala.com-JPA");
		users.setName("Kodewala JPA");

		boolean status = usersServiceImpl.addUsers(users);
		if (status)
		{
			System.out.println(" Record inserted successfully!!!");
		} else
		{
			System.out.println(" Unable to insert the records!!!!!!!!!");
		}
	}

}

package com.kodewala.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kodewala.main.entity.Users;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		Users user = new Users();

		// user.setId(1);
		user.setEmail("info@kw.com");
		user.setName("kodewala");

		org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();

		config.configure("/com/kodewala/main/config/hibernate.cfg.xml");

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();
		// Transaction txn = null;
		try
		{
			// txn = session.beginTransaction();
			// session.save(user);
			Users selectUser = session.get(Users.class, 4L);
			System.out.println(":::::::::::"+ selectUser.getEmail());
			// txn.commit();
		} catch (Exception e)
		{
			// txn.rollback();
		}

	}
}

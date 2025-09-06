package com.kodewala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.kodewala.entity.Users;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		Users user = new Users();

		user.setId(1);
		user.setEmail("HR@kw.com");
		user.setName("kodewala HR");
        
	    // Loading the hibernate.cfg.xml file.
		org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();

		config.configure("/com/kodewala/resources/hibernate.cfg.xml");
        // Creating the session factory object
		SessionFactory sessionFactory = config.buildSessionFactory();
        // Getting session object from session factory 
		Session session = sessionFactory.openSession();
		Transaction txn = null;
		try
		{  
			// starting the transactions 
			txn = session.beginTransaction();
			
			// saving / inserting the record/object to table
			session.save(user);
            // commit it
			txn.commit();
		} catch (Exception e)
		{  // rollback if fails.
			txn.rollback();
		}

	}
}

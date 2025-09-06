package com.kodewala.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.kodewala.main.bean.payment.Payment;

public class App
{
	public static void main(String[] args)
	{

		Payment payment = new Payment();

		payment.setAmount(23534);
		payment.setPaymentStatus("Pending");

		org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();

		config.configure("/com/kodewala/main/config/hibernate.cfg.xml");

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		org.hibernate.Transaction txn = session.beginTransaction();

		session.save(payment);// saving this object to the table.

		txn.commit();

	}
}

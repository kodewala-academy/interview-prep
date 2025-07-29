package com.kodewala.notications.service;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.kodewala.notications.dto.NotificationRequest;

@Service
public class NotificationService {

	private final JavaMailSender mailSender;

	public NotificationService(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendEmail(NotificationRequest request) {

		System.out.println(" Sending email to " + request.getEmail());
		/*
		 * SimpleMailMessage email = new SimpleMailMessage();
		 * email.setTo(request.getEmail()); email.setSubject(request.getSubject());
		 * email.setText(request.getMessage());
		 * email.setFrom("kodewala.academy@gmail.com"); // must match SMTP username
		 * mailSender.send(email);
		 */
	}
}

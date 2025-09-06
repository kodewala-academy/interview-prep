package com.kodewala.notications.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationRequest {

	private String email;
	private String subject;
	private String message;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubject() {
		return subject;
	}

	public String getMessage() {
		return message;
	}
}

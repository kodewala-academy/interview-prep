package com.kodewala.notications.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kodewala.notications.dto.NotificationRequest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaNotificationConsumer {

	private static final Logger log = LoggerFactory.getLogger(KafkaNotificationConsumer.class);
	private final NotificationService notificationService;
	private final ObjectMapper objectMapper = new ObjectMapper();

	public KafkaNotificationConsumer(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@KafkaListener(topics = "order-placed", groupId = "notification-group")
	public void consume(String message) {
		try {
			log.info("Received message: {}", message);
			NotificationRequest request = objectMapper.readValue(message, NotificationRequest.class);
			notificationService.sendEmail(request);
			log.info("Email sent to: {}", request.getEmail());
		} catch (Exception e) {
			log.error("Failed to send email", e);
		}
	}
}

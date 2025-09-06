package com.kodewala.order.kafka.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

	private static final String TOPIC = "order-placed";

	private final KafkaTemplate<String, String> kafkaTemplate;

	public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMessage(String message) {
		kafkaTemplate.send(TOPIC, message);
		System.out.println("Sent message to Kafka: " + message);
	}
}

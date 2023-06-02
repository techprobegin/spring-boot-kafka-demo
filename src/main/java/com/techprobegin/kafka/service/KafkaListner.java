package com.techprobegin.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {
	@KafkaListener(topics = "TechProBeginTopic", groupId = "techprobegin-group")
	public void listenToTechProBeginKafkaTopic(String messageReceived) {
		System.out.println("Message received is " + messageReceived);
	}
}

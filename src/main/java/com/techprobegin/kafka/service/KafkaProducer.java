package com.techprobegin.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate; // it's responsible to publish message to topic

    public void sendMessageToTopic(String message) {
        kafkaTemplate.send("TechProBeginTopic", message); // send method having two parameters, one is topic name and another is message
    }

}

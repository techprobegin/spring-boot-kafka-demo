package com.techprobegin.kafka.Controller;

import com.techprobegin.kafka.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class ClientController {
    @Autowired
    KafkaProducer kafkaProducer;
    @GetMapping(value = "/producer")
    public String sendMessage(@RequestParam("message") String message)
    {
        kafkaProducer.sendMessageToTopic(message);
        return "Message sent Successfully to the your tech-pr-begin topic ";
    }
	
}

package com.cognixia.jump.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Orders;

@Service
public class ProducerService {
	
	@Autowired
	private KafkaTemplate<String, Orders> template;
	
	public void produce(Orders order) {
		
		System.out.println("Producing order: " + order);
		
		template.send("Orders", order);
		
	}

}

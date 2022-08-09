package com.cognixia.jump.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Orders;
import com.cognixia.jump.repository.OrdersRepository;

@Service
public class ConsumerService {
	
	@Autowired
	OrdersRepository repo;
	
	@KafkaListener(topics = "Orders", groupId = "backup_group_id")
	public void consume(Orders order) {
		
		System.out.println("Consuming order: " + order);
		
		repo.save(order);
	}

}

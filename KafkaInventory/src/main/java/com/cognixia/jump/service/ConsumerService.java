package com.cognixia.jump.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Inventory;
import com.cognixia.jump.model.Orders;
import com.cognixia.jump.repository.InventoryRepository;

@Service
public class ConsumerService {
	
	@Autowired
	InventoryRepository repo;
	
	@KafkaListener(topics = "Orders", groupId = "orders_group_id")
	public void consume(Orders order) {
		
		System.out.println("Consuming order: " + order);
		
		Inventory inv = repo.findByItem(order.getItem());
		
		inv.setQuantity(inv.getQuantity()- order.getQuantity());
		
		repo.save(inv);
		
		
	}

}

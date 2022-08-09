package com.cognixia.jump.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Orders;
import com.cognixia.jump.repository.OrdersRepository;
import com.cognixia.jump.service.ProducerService;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
	
	@Autowired
	OrdersRepository repo;
	
	@Autowired
	ProducerService service;
	
	@PostMapping("/create")
	public ResponseEntity<Orders> createOrders(@RequestBody Orders order) {
		
		Orders newOrder = repo.save(order);
		
		service.produce(newOrder);
		
		return ResponseEntity.status(200).body(order);
		
	}

}

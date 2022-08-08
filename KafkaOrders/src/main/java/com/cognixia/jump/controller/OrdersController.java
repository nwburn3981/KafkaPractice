package com.cognixia.jump.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Orders;
import com.cognixia.jump.repository.OrdersRepository;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
	
	@Autowired
	OrdersRepository repo;
	
	@PostMapping("/create")
	public ResponseEntity<Orders> createOrders(@RequestBody Orders order) {
		
		repo.save(order);
		
		return ResponseEntity.status(200).body(order);
		
	}

}

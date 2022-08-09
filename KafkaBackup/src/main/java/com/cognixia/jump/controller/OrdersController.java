package com.cognixia.jump.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.repository.OrdersRepository;

@RestController
public class OrdersController {
	
	@Autowired
	OrdersRepository repo;

}

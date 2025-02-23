package com.ahmetarabaci.additionservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ahmetarabaci.additionservice.service.AdditionService;

@RestController
public class AdditionController {

	private AdditionService service;
	
	@Autowired
	public AdditionController(AdditionService service) {
		this.service = service;
	}
	
	@GetMapping("/add/{x}/{y}")
	public String add(@PathVariable("x") int x, @PathVariable("y") int y) {
		return "Addition Result: " + x + " + " + y + " => " + service.sum(x, y);
	}
}

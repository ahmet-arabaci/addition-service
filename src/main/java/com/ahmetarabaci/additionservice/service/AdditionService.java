package com.ahmetarabaci.additionservice.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {
	
	public int sum(int x, int y) {
		return x + y;
	}
	
}

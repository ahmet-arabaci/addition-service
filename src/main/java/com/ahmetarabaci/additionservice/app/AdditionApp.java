package com.ahmetarabaci.additionservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ahmetarabaci.*"})
public class AdditionApp {

	public static void main(String[] args) {
		SpringApplication.run(AdditionApp.class, args);
	}
	
}

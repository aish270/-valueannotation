package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2 {
	
	@Value("${value}")
	private String name;
	@GetMapping("/")
	public String disp() {
	return "I AM NOT  " + name;
	}

}

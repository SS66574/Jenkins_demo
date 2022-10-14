package com.zensar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "<h2> Welcome to Docker !!! </h2>";
	}
		@GetMapping("/bye")
		public String saybye() {
			return "<h2> Welcome to Docker !!! </h2>";
		}
			@GetMapping("/greet")
			public String greet() {
				return "<h2> Welcome to Docker !!! </h2>";

			}
	}



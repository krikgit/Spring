package com.krish.app.Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
	@RestController
	@RequestMapping("/api")
	class Main{
		@GetMapping("/main")
		public String welcome() {
			return "Welcome to Main Class";
		}
	}
}

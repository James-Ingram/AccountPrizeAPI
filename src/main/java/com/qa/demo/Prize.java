package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@RestController
public class Prize {

		public static void main(String[] args) {
			SpringApplication.run(Prize.class, args);
		}
		@GetMapping("/hello")
		public String hello()
		{
			return "Hello World";
		}
}

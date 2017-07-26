package com.github.bhrother

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class BookstoreApplication {

	@GetMapping("/recommended")
	String readingList(){
		return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)"
	}

	static void main(String[] args) {
		SpringApplication.run BookstoreApplication.class, args
	}
}

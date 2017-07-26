package com.github.bhrother

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
@SpringBootApplication
@EnableHystrix
class ReadingApplication {

	@Autowired
	BookService bookService

	@Bean
	static RestTemplate restTemplate() {
		new RestTemplate()
	}

	@GetMapping("/to-read")
	String readingList() {
		bookService.readingList()
	}

	static void main(String[] args) {
		SpringApplication.run ReadingApplication.class, args
	}
}

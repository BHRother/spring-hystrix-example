package com.github.bhrother

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard

@EnableHystrixDashboard
@SpringBootApplication
class HystrixDashboardApplication {

	static void main(String[] args) {
		SpringApplication.run HystrixDashboardApplication, args
	}
}

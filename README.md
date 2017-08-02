# Circuit Breakers using Spring Hystrix + Spring Boot + Hystrix Dashboard

This project shows an example of how configure your project to have the CircuitBreaker from Netflix Hystrix using Spring Boot.

### What are Circuit Breakers?

* Keep your system working even if some error happens in other services.
* It's not just a try/catch.
* Avoid overloading a service that is having problem to process the requests (or Connection timeouts that takes time to return and block the thread).

**How to use the Circuit Breaker with Spring Retry?**

* To enable, you need no annotate the Application / Configuration class with @EnableHystrix.
* The annotation for CircuitBreaker is: @CircuitBreaker.

## About the Example
This project is using:

* Spring Boot 1.5.3.RELEASE 
* Spring 4.3.8.RELEASE
* Spring Cloud Hystrix

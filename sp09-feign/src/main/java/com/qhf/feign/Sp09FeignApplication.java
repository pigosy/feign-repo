package com.qhf.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker//熔断器，fiegn 没有集成hystrix
@EnableFeignClients//feign，集成ribbon
@EnableDiscoveryClient//eureka
@SpringBootApplication
public class Sp09FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp09FeignApplication.class, args);
	}

}
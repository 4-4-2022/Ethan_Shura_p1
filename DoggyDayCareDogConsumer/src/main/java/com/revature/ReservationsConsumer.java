package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ReservationsConsumer {

	public static void main(String[] args) {
		SpringApplication.run(ReservationsConsumer.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder build) {
		return build.build();
	}
}
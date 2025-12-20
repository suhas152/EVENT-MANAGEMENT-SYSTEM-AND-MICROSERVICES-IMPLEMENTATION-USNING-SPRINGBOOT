package com.klef.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootDtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDtoApplication.class, args);
		System.out.println("Project is running successfully....");
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate()
;	}

}

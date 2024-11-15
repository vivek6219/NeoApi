package com.neo_api.NeoApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.neo_api")
public class NeoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeoApiApplication.class, args);
	}

}

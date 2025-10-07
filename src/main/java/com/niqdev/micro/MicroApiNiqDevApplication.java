package com.niqdev.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroApiNiqDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroApiNiqDevApplication.class, args);
	}

}

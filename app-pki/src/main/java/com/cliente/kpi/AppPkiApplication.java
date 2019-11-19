package com.cliente.kpi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AppPkiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppPkiApplication.class, args);
	}

}

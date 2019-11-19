package com.cliente.list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AppListApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppListApplication.class, args);
	}

}

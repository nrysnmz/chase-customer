package com.example.chasecustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ChaseCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChaseCustomerApplication.class, args);
	}

}

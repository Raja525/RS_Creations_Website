package com.business.Business_site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com")
@EntityScan("com.business.model")
public class BusinessSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessSiteApplication.class, args);
		System.out.println("Server_Started!.....................................");
	}

}

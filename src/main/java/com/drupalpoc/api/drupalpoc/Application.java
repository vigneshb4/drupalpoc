package com.drupalpoc.api.drupalpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = { "com.drupalpoc.api" })
public class Application extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		System.setProperty("javax.net.ssl.trustStore", "/path/to/jssecacerts");
		SpringApplication.run(Application.class, args);
	}
	
	
}

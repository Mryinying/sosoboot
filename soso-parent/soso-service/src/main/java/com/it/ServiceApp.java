package com.it;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class ServiceApp {

	public static void main( String[] args )
    {
		SpringApplication.run(ServiceApp.class, args);
    }
}
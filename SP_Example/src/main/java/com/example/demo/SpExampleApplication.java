package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpExampleApplication implements ApplicationRunner{
	
	private static final Logger LOG = LoggerFactory.getLogger(SpExampleApplication.class);
	
	
	private ApplicationContext applicationContext;
	

	public static void main(String[] args) {
		SpringApplication.run(SpExampleApplication.class, args);
	}
	@Autowired
	public SpExampleApplication(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ApplicationAvailability availability = applicationContext.getBean(ApplicationAvailability.class);
		LOG.info("Ready: {}, Live: {}", availability.getReadinessState(), availability.getLivenessState());
		}
		
	}



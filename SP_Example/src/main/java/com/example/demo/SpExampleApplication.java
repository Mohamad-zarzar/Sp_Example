package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpExampleApplication implements ApplicationRunner{
	
	private static final Logger LOG = LoggerFactory.getLogger(SpExampleApplication.class);
	
	@Autowired
	private ApplicationContext applicationContext;
	

	public static void main(String[] args) {
		SpringApplication.run(SpExampleApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		for(String beanName : applicationContext.getBeanDefinitionNames()){
			System.out.println(beanName);
		}
		
	}

}

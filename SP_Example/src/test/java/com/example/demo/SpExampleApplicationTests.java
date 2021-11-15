package com.example.demo;

import org.junit.jupiter.api.Assertions;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpExampleApplicationTests {

	@Autowired
	private SpExampleApplication app;
	@Test
	void shoudBeNotNull() {
		Assertions.assertNotNull(app);
		
	}

}

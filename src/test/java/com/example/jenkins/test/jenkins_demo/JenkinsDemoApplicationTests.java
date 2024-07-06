package com.example.jenkins.test.jenkins_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class JenkinsDemoApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);
	@Test
	public void contextLoads() {
		logger.info("app test case executing");
		assertEquals(true, true);
	}

}

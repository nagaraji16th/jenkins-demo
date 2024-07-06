package com.example.jenkins.test.jenkins_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {
	
	
public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
@PostConstruct
public void init() {
	logger.info("app started");
}
	public static void main(String[] args) {
		logger.info("app executed");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}

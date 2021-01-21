package com.javanibble.springevents;

import com.javanibble.springevents.annotation.SpringEventPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEventsAnnotationApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SpringEventsAnnotationApplication.class);

	@Autowired
	private SpringEventPublisher springEventPublisher;

	public static void main(String[] args) {
		SpringApplication.run(SpringEventsAnnotationApplication.class, args);
	}

	@Override
	public void run(String ...args) throws Exception {
		logger.info("*** Spring Event: Annotation-Driven ***");
		springEventPublisher.publishBasicEvent("Hello World");
	}

}

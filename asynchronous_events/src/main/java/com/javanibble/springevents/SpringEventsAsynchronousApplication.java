package com.javanibble.springevents;

import com.javanibble.springevents.asynchronous.SpringEventPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEventsAsynchronousApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SpringEventsAsynchronousApplication.class);

	@Autowired
	private SpringEventPublisher springEventPublisher;

	public static void main(String[] args) {
		SpringApplication.run(SpringEventsAsynchronousApplication.class, args);
	}

	@Override
	public void run(String ...args) throws Exception {
		logger.info("*** Spring Event: Asynchronous ***");
		springEventPublisher.publishBasicEvent("Hello World");
	}

}

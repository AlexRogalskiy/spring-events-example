package com.javanibble.springevents;

import com.javanibble.springevents.synchronous.BasicSpringEventPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEventsSynchronousApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SpringEventsSynchronousApplication.class);

	@Autowired
	private BasicSpringEventPublisher basicSpringEventPublisher;

	public static void main(String[] args) {
		SpringApplication.run(SpringEventsSynchronousApplication.class, args);
	}

	@Override
	public void run(String ...args) throws Exception {
		logger.info("*** Spring Event: Synchronous ***");
		basicSpringEventPublisher.publishBasicEvent("Hello World");
	}

}

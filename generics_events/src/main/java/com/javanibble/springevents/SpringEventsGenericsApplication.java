package com.javanibble.springevents;

import com.javanibble.springevents.generics.SpringEventPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEventsGenericsApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SpringEventsGenericsApplication.class);

	@Autowired
	private SpringEventPublisher basicSpringEventPublisher;

	public static void main(String[] args) {
		SpringApplication.run(SpringEventsGenericsApplication.class, args);
	}

	@Override
	public void run(String ...args) throws Exception {
		logger.info("*** Spring Event: Generics ***");
		basicSpringEventPublisher.publishGenericEvent("Hello World");
	}

}

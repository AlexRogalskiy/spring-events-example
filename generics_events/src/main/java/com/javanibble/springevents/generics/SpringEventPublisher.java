package com.javanibble.springevents.generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


@Component
public class SpringEventPublisher {

    private static final Logger logger = LoggerFactory.getLogger(SpringEventPublisher.class);

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishGenericEvent(final String message) {
        logger.info("SpringEventPublisher: Publish Event Started.");

        GenericStringSpringEvent genericSpringEvent = new GenericStringSpringEvent(this, "Hello World");
        applicationEventPublisher.publishEvent(genericSpringEvent);

        logger.info("SpringEventPublisher: Publish Event Complete.");
    }
}

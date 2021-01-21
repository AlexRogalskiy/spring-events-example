package com.javanibble.springevents.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class AnnotatedAsyncEventListener {

    private static final Logger logger = LoggerFactory.getLogger(AnnotatedAsyncEventListener.class);

    @Async
    @EventListener
    public void handleEvent(BasicSpringEvent basicEvent) {
        logger.info("AnnotatedAsyncEventListener: Receive Event: "+ basicEvent.getMessage());
    }

}
package com.javanibble.springevents.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class AnnotatedSyncEventListener {

    private static final Logger logger = LoggerFactory.getLogger(AnnotatedSyncEventListener.class);

    @EventListener
    public void handleAnnotatedEvent(BasicSpringEvent basicEvent) {
        logger.info("AnnotatedSyncEventListener: Receive Event: "+ basicEvent.getMessage());
    }

}
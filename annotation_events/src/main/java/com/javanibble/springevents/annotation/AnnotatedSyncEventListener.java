package com.javanibble.springevents.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * The AnnotatedSyncEventListener class illustrates the use of the @EventListener annotation to mark a method as a
 * listener for application events.
 */
@Component
public class AnnotatedSyncEventListener {

    private static final Logger logger = LoggerFactory.getLogger(AnnotatedSyncEventListener.class);

    @EventListener
    public void handleAnnotatedEvent(MessageEvent basicEvent) {
        logger.info("AnnotatedSyncEventListener: Receive Event: "+ basicEvent.getMessage());
    }

}
package com.javanibble.springevents.synchronous;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * The SynchronousEventListener is an ApplicationListener that listens to a Message. The ApplicationListener is
 * based on the standard java.util.EventListener interface for the Observer design pattern.
 *
 * The onApplicationEvent handles the application event, which in this case is the MessageEvent. The Listener has
 * access to the event data via the accessor method of the message property.
 */
@Component
public class SynchronousEventListener implements ApplicationListener<MessageEvent> {

    private static final Logger logger = LoggerFactory.getLogger(SynchronousEventListener.class);

    @Override
    public void onApplicationEvent(MessageEvent basicEvent) {
        logger.info("SynchronousEventListener: Receive Event: "+ basicEvent.getMessage());
    }

}

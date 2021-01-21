package com.javanibble.springevents.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * The BasicSpringEventListener is an ApplicationListener that listens to a BasicSpringEvent. The ApplicationListener is
 * based on the standard java.util.EventListener interface for the Observer design pattern.
 *
 * The onApplicationEvent handles the application event, which in this case is the BasicSpringEvent. The Listener has
 * access to the event data via the accessor method of the message property.
 */
@Component
public class BasicSpringEventListener implements ApplicationListener<BasicSpringEvent> {

    private static final Logger logger = LoggerFactory.getLogger(BasicSpringEventListener.class);

    @Override
    public void onApplicationEvent(BasicSpringEvent basicEvent) {
        logger.info("BasicSpringEventListener: Receive Event: "+ basicEvent.getMessage());
    }

}

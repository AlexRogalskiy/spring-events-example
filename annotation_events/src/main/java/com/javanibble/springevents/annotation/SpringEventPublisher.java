package com.javanibble.springevents.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * The SpringEventPublisher class uses the creates a MessageEvent which is an ApplicationEvent. The MessageEvent
 * is initialised with the message that is the event data for the event listeners. The MessageEvent is also
 * initialised with a reference to the current instance of the SpringEventPublisher class.
 *
 * The SpringEventPublisher publish the MessageEvent which notifies all matching listeners registered with this
 * application of an application event.
 *
 * The publication of the event is effectively a hand-off to the multicaster and does not imply synchronous/asynchronous
 * execution or even immediate execution at all.
 */
@Component
public class SpringEventPublisher {

    private static final Logger logger = LoggerFactory.getLogger(SpringEventPublisher.class);

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishBasicEvent(final String message) {
        logger.info("SpringEventPublisher: Publish Event Started.");

        MessageEvent basicSpringEvent = new MessageEvent(this, message);
        applicationEventPublisher.publishEvent(basicSpringEvent);

        logger.info("SpringEventPublisher: Publish Event Complete.");
    }
}

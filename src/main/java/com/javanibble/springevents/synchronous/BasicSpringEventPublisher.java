package com.javanibble.springevents.synchronous;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * The BasicSpringEventPublisher class uses the creates a BasicSpringEvent which is an ApplicationEvent. The BasicSpringEvent
 * is initialised with the message that is the event data for the event listeners. The BasicSpringEvent is also
 * initialised with a reference to the current instance of the BasicSpringEventPublisher class.
 *
 * The BasicSpringEventPublisher publish the BasicSpringEvent which notifies all matching listeners registered with this
 * application of an application event.
 *
 * The publication of the event is effectively a hand-off to the multicaster and does not imply synchronous/asynchronous
 * execution or even immediate execution at all.
 */
@Component
public class BasicSpringEventPublisher {

    private static final Logger logger = LoggerFactory.getLogger(BasicSpringEventPublisher.class);

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishBasicEvent(final String message) {
        logger.info("BasicSpringEventPublisher: Publish event.");
        BasicSpringEvent basicSpringEvent = new BasicSpringEvent(this, message);
        applicationEventPublisher.publishEvent(basicSpringEvent);
    }
}

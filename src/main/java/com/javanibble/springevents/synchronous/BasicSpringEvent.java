package com.javanibble.springevents.synchronous;

import org.springframework.context.ApplicationEvent;

/**
 * The BasicSpringEvent is an application event and extends the the ApplicationEvent abstract class. The BasicSpringEvent
 * class contains a String property called message that stores the event data.
 *
 * The ApplicationEvent class is abstract since it doesn't make sense for generic events to be published directly.
 */
public class BasicSpringEvent extends ApplicationEvent {

    private String message;

    public BasicSpringEvent(final Object source, final String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

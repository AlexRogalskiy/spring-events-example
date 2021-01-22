package com.javanibble.springevents.generics;

import org.springframework.context.ApplicationEvent;

public class GenericSpringEvent<T> extends ApplicationEvent {

    private final T object;

    public GenericSpringEvent(final Object source, final T object) {
        super(source);
        this.object = object;
    }

    public T getObject() {
        return object;
    }

}

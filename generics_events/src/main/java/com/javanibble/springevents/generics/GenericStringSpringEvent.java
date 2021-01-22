package com.javanibble.springevents.generics;


class GenericStringSpringEvent extends GenericSpringEvent<String> {

    public GenericStringSpringEvent(final Object source, final String what) {
        super(source, what);
    }

}

package com.javanibble.springevents.generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class GenericSpringEventListener implements ApplicationListener<GenericSpringEvent<String>> {

    private static final Logger logger = LoggerFactory.getLogger(GenericSpringEventListener.class);

    @Override
    public void onApplicationEvent(@NonNull GenericSpringEvent<String> event) {
        logger.info("GenericSpringEventListener: Receive Event: "+ event.getObject());
    }

}

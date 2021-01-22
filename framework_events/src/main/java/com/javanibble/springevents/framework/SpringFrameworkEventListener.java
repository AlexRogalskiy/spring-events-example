package com.javanibble.springevents.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

@Component
public class SpringFrameworkEventListener {

    private static final Logger logger = LoggerFactory.getLogger(SpringFrameworkEventListener.class);

    @EventListener
    public void handleContextStartedEvent(ContextStartedEvent contextStartedEvent) {
        logger.info("ContextStartedEvent occurred and handled.");
    }

    @EventListener
    public void handleContextRefreshedEvent(ContextRefreshedEvent contextRefreshedEvent) {
        logger.info("ContextRefreshedEvent occurred and handled.");
    }

    @EventListener
    public void handleContextStoppedEvent(ContextStoppedEvent contextStoppedEvent) {
        logger.info("ContextStoppedEvent occurred and handled.");
    }

    @EventListener
    public void handleContextClosedEvent(ContextClosedEvent contextClosedEvent) {
        logger.info("ContextClosedEvent occurred and handled.");
    }

}

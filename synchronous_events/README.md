# Spring Application Events - Synchronous Example

The spring framework has an event mechanism that forms part of the `ApplicationContext`. The event publisher (subject) 
publishes an event, while the event listener (observer) only receives the specific event if the event listener listens 
for that specific type of event. 

The application event capability of the Spring framework is **synchronous** by default. This implies the publisher 
method blocks until all registered listeners have processed the event.  

### Application Event - MessageEvent
The `MessageEvent` is an application event and extends the `ApplicationEvent` abstract class. The `MessageEvent` class 
contains a String property called `message` that stores the event data.

The `ApplicationEvent` class is abstract since it doesn't make sense for generic events to be published directly.

```java
public class MessageEvent extends ApplicationEvent {

    private String message;

    public MessageEvent(final Object source, final String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
```

**Javadoc**
* [ApplicationEvent](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationEvent.html)

### Event Publisher - SpringEventPublisher 
The `SpringEventPublisher` class creates an instance of a `MessageEvent` class. The `MessageEvent` is initialised with
the message that is the event data for the event listeners. The `MessageEvent` is also initialised with a reference to 
the current instance of the `SpringEventPublisher` class.

The `SpringEventPublisher` publish the `MessageEvent` which notifies all matching listeners registered with this 
application of an application event.

The publication of the event is effectively a hand-off to the multicaster and does not imply synchronous/asynchronous
execution or even immediate execution at all.
```java
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
```

**Javadoc**
* [ApplicationEventPublisher](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationEventPublisher.html)

### Event Listener - SynchronousEventListener
The `SynchronousEventListener` is an `ApplicationListener` that listens to for an event. The `ApplicationListener` is 
based on the standard `java.util.EventListener` interface for the Observer design pattern.

The `onApplicationEvent` handles the application event, which in this case is the `MessageEvent`. The Listener has 
access to the event data via the accessor method of the `message` property.
 
```java
@Component
public class SynchronousEventListener implements ApplicationListener<MessageEvent> {

    private static final Logger logger = LoggerFactory.getLogger(SynchronousEventListener.class);

    @Override
    public void onApplicationEvent(MessageEvent basicEvent) {
        logger.info("SynchronousEventListener: Receive Event: "+ basicEvent.getMessage());
    }
}
```

## Compile and Run the Application
Use the following command to compile the Spring Boot application making use of maven.

**Build Application**
```bash
$ mvn clean install
```

After you have successfully built the Spring Boot application, the compiled artifact can be found in the target directory. There are several ways to run the Spring Boot application. You can use either of the two commands below to start the Spring Boot Application.

**Run Application: Java Command**
```bash
$ java -jar target//spring_events_synchronous-0.0.1-SNAPSHOT.jar
```

**Run Application: Maven Command**
```bash
$ mvn spring-boot:run
```

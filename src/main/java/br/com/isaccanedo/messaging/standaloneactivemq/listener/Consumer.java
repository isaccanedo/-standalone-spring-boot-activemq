package br.com.isaccanedo.messaging.standaloneactivemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Isac Canedo
 */

@Component
public class Consumer {

    @JmsListener(destination = "standalone.queue")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }
}

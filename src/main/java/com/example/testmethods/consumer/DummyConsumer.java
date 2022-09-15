package com.example.testmethods.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;

@Component
@Slf4j
public class DummyConsumer {

    @JmsListener(containerFactory = "myJmsListenerContainerFactory", destination = "${b2c.amq-callback-queue-name}")
    public void messageReceiver(final Message message) {
        String request = null;
        try {
            log.info("AMQ : message instanceof TextMessage : {}", message);
//            if (message instanceof MapMessage) {
//                if (message instanceof TextMessage) {
//                    TextMessage textMessage = (TextMessage) message;
////                    request = textMessage.getText();
            request = ((MapMessage) message).getString("message");
            log.info("AMQ Request Payload : {}", request);
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }
        }




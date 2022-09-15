package com.example.testmethods.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.MapMessage;

@Component
@Slf4j
public class CallbackQueue {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${spring.activemq.broker-url}")
    private String BROKER_URL;

    @Value("${b2c.amq-receive-timeout}")
    private int AMQ_RECEIVE_TIMEOUT;

    @Value("${b2c.amq-callback-queue-name}")
    private String KCB_CALLBACK_QUEUE;

    public String sendResponseToQueue(String result) {

        String queName = KCB_CALLBACK_QUEUE;
        log.info("ActiveMq CALLBACK QueueName : {}", queName);
        log.info("ActiveMq CALLBACK Request Payload : {}",result );
        log.info("//****************************************");

        //TODO @Send to ActiveMQ
        jmsTemplate.setMessageIdEnabled(true);
        jmsTemplate.setDeliveryPersistent(true);
        jmsTemplate.send(queName, session -> {
            MapMessage message = session.createMapMessage();
            message.setString("message", result);
            message.setJMSCorrelationID("001R");
            message.setJMSMessageID("263839393u3");
            message.setJMSType("text");
            return message;
        });

        return result;
    }

}

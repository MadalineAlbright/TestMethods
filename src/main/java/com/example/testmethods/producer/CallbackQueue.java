package com.example.testmethods.producer;

public class CallbackQueue {

    public String sendResponseToQueue() {

//        Gson gson = new Gson();
//        String jsonResponse = voomaB2CTransactions.getResponseBody();
//        String jsonSms = gson.toJson(processSmsMessage(voomaB2CTransactions,template));
//        String queName = QUEUE_B2B_SAFARICOM_MPESATILL_SMS;
//        logger.info("ActiveMq SMS QueueName : {}", queName);
//        logger.info("ActiveMq SMS Request Payload : {}", jsonSms);
//        logger.info("//****************************************");
//
//        //TODO @Send to ActiveMQ
//        jmsTemplate.setMessageIdEnabled(true);
//        jmsTemplate.setDeliveryPersistent(true);
//        jmsTemplate.send(queName, session -> {
//            MapMessage message = session.createMapMessage();
//            message.setString("message", jsonSms);
//            message.setJMSCorrelationID(voomaB2CTransactions.getConversationId());
//            message.setJMSMessageID(voomaB2CTransactions.getCommandId());
//            message.setJMSType("json");
//            return message;
//        });
//
//        return jsonResponse;
//    }

        return null;
    }
}
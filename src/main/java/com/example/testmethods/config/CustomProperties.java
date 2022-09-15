package com.example.testmethods.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/*
 * Jeremiah Basil Aura
 * KCB Group - BSS
 * VOOMA C2B
 * Date: 25th August 2022
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "b2c")
public class CustomProperties {

    private int amqReceiveTimeout;
    private int httpConnectionRequestTimeout;
    private int httpConnectionTimeout;
    private int httpConnectionReadTimeout;
    private String commandId;
    private String amqFundsTransferQueueName;
    private String amqThirdPartyQueueName;

    //THIRD PARTY CONFIGS **
    private String thirdPartySafaricomApiHost;
    private String thirdPartySafaricomApiResource;
    private String thirdPartySafaricomB2cCommandId;
    private String thirdPartyCallerType;
    private String thirdPartyCallerPartyId;
    private String thirdPartyCallerPassword;
    private String thirdPartyCallerChecksum;
    private String thirdPartyCallerResultUrl;
    private String thirdPartyInitiatorIdentifier;
    private String thirdPartyInitiatorSecurityCredential;
    private String thirdPartyInitiatorShortCode;
    private String thirdPartyAccessDeviceIdentifier;
    private String smsTemplate;
    private String smsTemplateFailure;

}

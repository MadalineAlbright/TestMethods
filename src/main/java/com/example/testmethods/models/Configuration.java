package com.example.testmethods.models;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@org.springframework.context.annotation.Configuration
@ConfigurationProperties(prefix = "sms")
@Data
public class Configuration {
    private String message;
}

package com.example.testmethods.tests;

import com.example.testmethods.models.Configuration;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

import java.util.HashMap;
import java.util.Map;

public class PlaceHolder {
//    @Autowired
//    private Configuration config;
    @Value("$(sms.message)")
    private String message;

    @Autowired
    Environment env;
    public void replaceValues(){
        Map<String, String> valuesMap = new HashMap<String, String>();
         String message = "[firstName] [lastName] has sent";
//        message= message.replace("[firstName]", "quick brown fox");
//        message= message.replace("[lastName]", "quick brown fox");
        message= valuesMap.replace("[firstName]", "quick brown fox");
        message= valuesMap.replace("[lastName]", "lazy dog");
////        String templateString = "The ${animal} jumped over the ${target}.";
//        String templateString = config.getMessage();
        StrSubstitutor sub = new StrSubstitutor(valuesMap);//strSub is deprecated
        String resolvedString = sub.replace(message);
        System.out.println(resolvedString);
//        System.out.println(resolvedString);


    }
}

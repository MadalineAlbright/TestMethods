package com.example.testmethods.tests;

import com.example.testmethods.models.LoanRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Gsonn {

    public static void main(String[] args) {
        String response = """
                {\040\040
                  "department": {
                    "id": 2,
                    "name": "IT",
                    "active": true
                  }
                }""";

        String response2 = """
                {\040\040
                    "id": 2,
                    "amount": 1000.0
                }""";

        System.out.println(setJsonString(response));

//        setJsonStringToObject(response2, LoanRequest.class);

        System.out.println(setJsonStringToObject(response2, LoanRequest.class));

    }


    public static String setJsonString(Object content) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(content);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return e.getMessage();
        }
    }


    public static Object setJsonStringToObject(String content, Class<?> object) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(content,object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}

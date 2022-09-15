package com.example.testmethods.controller;

import com.example.testmethods.models.Header;
import com.example.testmethods.models.TestUser;
import com.example.testmethods.models.Users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

import static org.springframework.http.MediaType.TEXT_XML_VALUE;

@RestController
@RequestMapping("api/")
@Slf4j
public class UserCallBackReceiver {

    @PostMapping(value = "users")
    public ResponseEntity<?> getCallBackResponse(@RequestBody Users user){
        log.info("===========CALLBACK PAYLOAD==========={}",user);
        TestUser testUser=new TestUser();
        Header header = new Header();
        header.setStatusCode("0");
        header.setStatusDescription("SUCCESS");

        testUser.setHeader(header);
        testUser.setBlog(user.getBlog());
        testUser.setName(user.getName());
        log.info("===========CALLBACK LOGGED RESPONSE ==========={}",testUser);
        return ResponseEntity.ok(testUser);
    }
}

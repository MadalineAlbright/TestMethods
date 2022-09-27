package com.example.testmethods.controller;

import com.example.testmethods.models.Header;
import com.example.testmethods.models.TestUser;
import com.example.testmethods.models.Users;
import com.example.testmethods.producer.CallbackQueue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/")
@Slf4j
public class UserCallBackReceiver {
    @Autowired
    private CallbackQueue queue;

    @PostMapping(value = "users")
    public ResponseEntity<?> getCallBackResponse(@RequestBody Users user){
        log.info("===========CALLBACK PAYLOAD==========={}",user);
        TestUser testUser=new TestUser();
        Header header = new Header();
        header.setStatusCode("0");
        header.setStatusDescription("SUCCESS");

        testUser.setHeader(header);
//        testUser.setBlog(user.getBlog());
//        testUser.setName(user.getName());
        log.info("===========CALLBACK LOGGED RESPONSE ==========={}",testUser);
        queue.sendResponseToQueue(String.valueOf(testUser));
        return ResponseEntity.ok(testUser);

    }
}

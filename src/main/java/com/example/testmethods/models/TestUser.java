package com.example.testmethods.models;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TestUser {
    private Header header;
    private String name;
    private String blog;
}

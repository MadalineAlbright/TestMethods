package com.example.testmethods.models;

import lombok.Data;
import lombok.ToString;

@Data
public class Users {
    private String name;
    private String blog;
    private Department department;

    public Users(String fghh, String lokesh) {
    }
}

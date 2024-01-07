package com.example.demo.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Getter
public class User {
    @Id
    private String id;
    private String username;
    private String age;

    public User(String id, String username, String age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }
}

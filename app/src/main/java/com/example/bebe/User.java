package com.example.bebe;

import java.util.HashMap;
import java.util.Map;

public class User {

    Map<String, String> user = new HashMap<>();
    public String username;
    public String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        user.put(email,username);

    }
}

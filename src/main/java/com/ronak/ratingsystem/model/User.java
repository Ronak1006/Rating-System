package com.ronak.ratingsystem.model;

public class User { //class for user (name and future data)
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User: " + username;
    }
}
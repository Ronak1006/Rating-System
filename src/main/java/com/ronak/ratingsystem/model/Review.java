package com.ronak.ratingsystem.model;

import java.time.LocalDateTime; // to keep track of when review was written

public class Review { //class for leaving a written review
    private User user;
    private Rateable target;
    private String comment;
    private LocalDateTime createdAt; 

    public Review(User user, Rateable target, String comment) {
        this.user = user;
        this.target = target;
        this.comment = comment;
        this.createdAt = LocalDateTime.now();
    }

    public User getUser() {
        return user;
    }

    public Rateable getTarget() {
        return target;
    }

    public String getComment() {
        return comment;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return user.getUsername() + " reviewed " + target.getTitle() + ": " + comment;
    }
}
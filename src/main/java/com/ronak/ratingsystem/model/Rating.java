package com.ronak.ratingsystem.model;

public class Rating { //class for leaving a rating
    private User user;
    private Rateable target;
    private int score;

    public Rating(User user, Rateable target, int score) { //score must be between 1 and 10
        if (score < 1 || score > 10) {
            throw new IllegalArgumentException("Rating must be between 1 and 10.");
        }

        this.user = user;
        this.target = target;
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public Rateable getTarget() {
        return target;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return user.getUsername() + " rated " + target.getTitle() + " " + score + "/10";
    }
}
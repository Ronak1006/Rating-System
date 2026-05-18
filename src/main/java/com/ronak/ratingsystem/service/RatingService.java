package com.ronak.ratingsystem.service;

import java.util.ArrayList;
import java.util.List;

import com.ronak.ratingsystem.model.Rateable;
import com.ronak.ratingsystem.model.Rating;
import com.ronak.ratingsystem.model.User;

public class RatingService {
    private List<Rating> ratings;

    public RatingService() {
        this.ratings = new ArrayList<>();
    }

    public void addRating(User user, Rateable target, int score) {
        Rating rating = new Rating(user, target, score);
        ratings.add(rating);
    }

    public List<Rating> getRatingsForTarget(Rateable target) {
        List<Rating> result = new ArrayList<>();

        for (Rating rating : ratings) {
            if (rating.getTarget() == target) {
                result.add(rating);
            }
        }

        return result;
    }

    public double getAverageRating(Rateable target) {
        List<Rating> targetRatings = getRatingsForTarget(target);

        if (targetRatings.isEmpty()) {
            return 0.0;
        }

        int total = 0;

        for (Rating rating : targetRatings) {
            total += rating.getScore();
        }

        return (double) total / targetRatings.size();
    }
}
package com.ronak.ratingsystem.service;

import java.util.ArrayList;
import java.util.List;

import com.ronak.ratingsystem.model.Rateable;
import com.ronak.ratingsystem.model.Review;
import com.ronak.ratingsystem.model.User;

public class ReviewService {
    private List<Review> reviews;

    public ReviewService() {
        this.reviews = new ArrayList<>();
    }

    public void addReview(User user, Rateable target, String comment) {
        Review review = new Review(user, target, comment);
        reviews.add(review);
    }

    public List<Review> getReviewsForTarget(Rateable target) {
        List<Review> result = new ArrayList<>();

        for (Review review : reviews) {
            if (review.getTarget() == target) {
                result.add(review);
            }
        }

        return result;
    }
}
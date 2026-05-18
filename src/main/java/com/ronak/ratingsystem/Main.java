package com.ronak.ratingsystem;

import com.ronak.ratingsystem.model.Episode;
import com.ronak.ratingsystem.model.Movie;
import com.ronak.ratingsystem.model.Review;
import com.ronak.ratingsystem.model.Season;
import com.ronak.ratingsystem.model.TVShow;
import com.ronak.ratingsystem.model.User;
import com.ronak.ratingsystem.service.RatingService;
import com.ronak.ratingsystem.service.ReviewService;

public class Main {
    public static void main(String[] args) {

        // Create user
        User user = new User("ronak");

        // Create movie
        Movie inception = new Movie("Inception", 2010, "Sci-Fi");

        // Create TV show hierarchy
        TVShow breakingBad = new TVShow("Breaking Bad", "Crime");

        Season season1 = new Season(1);

        Episode pilot = new Episode("Pilot", 1);
        Episode catsInTheBag = new Episode("Cat's in the Bag", 2);

        season1.addEpisode(pilot);
        season1.addEpisode(catsInTheBag);

        breakingBad.addSeason(season1);

        // Create services
        RatingService ratingService = new RatingService();
        ReviewService reviewService = new ReviewService();

        // Add ratings
        ratingService.addRating(user, inception, 9);
        ratingService.addRating(user, pilot, 10);

        // Add reviews
        reviewService.addReview(
                user,
                inception,
                "Amazing concept, visuals, and soundtrack."
        );

        reviewService.addReview(
                user,
                pilot,
                "One of the greatest pilot episodes ever made."
        );

        // Print user
        System.out.println("=== USER ===");
        System.out.println(user);

        // Print movie info
        System.out.println("\n=== MOVIE ===");
        System.out.println(inception);

        System.out.println("\nAverage Rating:");
        System.out.println(ratingService.getAverageRating(inception));

        System.out.println("\nReviews:");
        for (Review review : reviewService.getReviewsForTarget(inception)) {
            System.out.println("- " + review);
        }

        // Print TV show info
        System.out.println("\n=== TV SHOW ===");
        System.out.println(breakingBad);

        // Print pilot episode info
        System.out.println("\n=== PILOT EPISODE ===");
        System.out.println(pilot);

        System.out.println("\nAverage Rating:");
        System.out.println(ratingService.getAverageRating(pilot));

        System.out.println("\nReviews:");
        for (Review review : reviewService.getReviewsForTarget(pilot)) {
            System.out.println("- " + review);
        }
    }
}
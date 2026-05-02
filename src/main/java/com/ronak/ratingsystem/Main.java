package com.ronak.ratingsystem;

import com.ronak.ratingsystem.model.Episode;
import com.ronak.ratingsystem.model.Movie;
import com.ronak.ratingsystem.model.Season;
import com.ronak.ratingsystem.model.TVShow;
import com.ronak.ratingsystem.model.User;

public class Main { //main class containing test data for now
    public static void main(String[] args) {
        User user = new User("ronak");

        Movie movie = new Movie("Inception", 2010, "Sci-Fi"); //test movie object with metadata

        TVShow show = new TVShow("Breaking Bad", "Crime"); //tvshow with data
        Season season1 = new Season(1); //season with data

        //2 episodes added
        season1.addEpisode(new Episode("Pilot", 1)); 
        season1.addEpisode(new Episode("Cat's in the Bag", 2));

        //adding season1 with its two episodes
        show.addSeason(season1);

        System.out.println(user);
        System.out.println(movie);
        System.out.println();
        System.out.println(show);
    }
}
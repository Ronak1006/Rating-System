package com.ronak.ratingsystem.model;

public class Movie implements Rateable {
    private String title;
    private int releaseYear;
    private String genre;

    public Movie(String title, int releaseYear, String genre) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "Movie: " + title + " (" + releaseYear + ") - " + genre;
    }
}


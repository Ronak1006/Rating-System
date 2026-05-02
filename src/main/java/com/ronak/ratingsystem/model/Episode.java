package com.ronak.ratingsystem.model;

public class Episode implements Rateable { //class for episodes of a tv show
    private String title;
    private int episodeNumber;

    public Episode(String title, int episodeNumber) {
        this.title = title;
        this.episodeNumber = episodeNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    @Override
    public String toString() {
        return "Episode " + episodeNumber + ": " + title;
    }
}

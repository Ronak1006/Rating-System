package com.ronak.ratingsystem.model;

import java.util.ArrayList;
import java.util.List;

public class Season implements Rateable { //class for seasons of a tv show
    private int seasonNumber;
    private int releaseYear;
    private List<Episode> episodes; //episode instances inside season as a list interface (episodes in a season)

    public Season (int seasonNumber) {
        this.seasonNumber = seasonNumber;
        this.episodes = new ArrayList<>(); //episodes is a list object pointing to arraylist object
    }

    public String getTitle() {
        return "Season " + seasonNumber;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void addEpisode (Episode episode) { //adding another episode to the arraylist
        episodes.add(episode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //using stringbuilder as seasons and episodes append
        sb.append("Season").append(seasonNumber).append("\n");

        for (Episode episode : episodes) { //loops through all the episodes in arraylist
            sb.append(" ").append(episode).append("\n");
        }

        return sb.toString();
    }
}

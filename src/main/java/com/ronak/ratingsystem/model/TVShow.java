package com.ronak.ratingsystem.model;

import java.util.ArrayList;
import java.util.List;

public class TVShow implements Rateable { //class for tv shows that are rateable
    private String title;
    private String genre;
    private List<Season> seasons; //season instances inside class (seasons in a show)

    public TVShow(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.seasons = new ArrayList<>(); //seasons in a show stored in an arraylist
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void addSeason(Season season) { //add additional seasons to list
        seasons.add(season);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TV Show: ").append(title).append(" - ").append(genre).append("\n");

        for (Season season : seasons) {
            sb.append(season);
        }

        return sb.toString();
    }
}
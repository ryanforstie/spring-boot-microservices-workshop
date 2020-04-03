package io.javabrains.moviecatalogservice.models;

public class Movie {

    private String movieId;
    private String name;

    public Movie() {}

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public String getMoveId() {
        return movieId;
    }

    public void setMoveId(String moveId) {
        this.movieId = moveId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

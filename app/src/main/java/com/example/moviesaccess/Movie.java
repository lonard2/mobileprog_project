package com.example.moviesaccess;

import java.util.List;

public class Movie {
    private String title;
    private List<MovieGenre> genres = null;
    private Integer runtime;
    private String overview;
    private String status;
    private String releaseDate;
    private String backdropPath;
    private String posterPath;
    private List<MovieCountry> productionCountries = null;
    private List<MovieLanguage> spokenLanguages = null;
    private String providers;
    private Double voteAverage;

    public Movie(String title, List<MovieGenre> genres, Integer runtime,
                 String overview, String status, String releaseDate,
                 String backdropPath, String posterPath, List<MovieCountry> productionCountries,
                 List<MovieLanguage> spokenLanguages, String providers, Double voteAverage) {
        this.title = title;
        this.genres = genres;
        this.runtime = runtime;
        this.overview = overview;
        this.status = status;
        this.releaseDate = releaseDate;
        this.backdropPath = backdropPath;
        this.posterPath = posterPath;
        this.productionCountries = productionCountries;
        this.spokenLanguages = spokenLanguages;
        this.providers = providers;
        this.voteAverage = voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<MovieGenre> getGenres() {
        return genres;
    }

    public void setGenres(List<MovieGenre> genres) {
        this.genres = genres;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public List<MovieCountry> getProductionCountries() {
        return productionCountries;
    }

    public void setProductionCountries(List<MovieCountry> productionCountries) {
        this.productionCountries = productionCountries;
    }

    public List<MovieLanguage> getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(List<MovieLanguage> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public String getProviders() {
        return providers;
    }

    public void setProviders(String providers) {
        this.providers = providers;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }
}

package com.example.moviesaccess;

import java.util.Date;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class UpcomingMovie {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<UpcomingResult> results;
    @SerializedName("dates")
    private Date dates;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("total_results")
    private int totalResults;

    public UpcomingMovie(int page, List<UpcomingResult> results,
                         Date dates, int totalPages, int totalResults) {
        this.page = page;
        this.results = results;
        this.dates = dates;
        this.totalPages = totalPages;
        this.totalResults = totalResults;
    }

    public UpcomingMovie(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<UpcomingResult> getResults() {
        return results;
    }

    public void setResults(List<UpcomingResult> results) {
        this.results = results;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public class UpcomingResult {
        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("adult")
        private boolean adult;
        @SerializedName("overview")
        private String overview;
        @SerializedName("release_date")
        private String releaseDate;
        @SerializedName("genre_ids")
        private List<Integer> genreIds;
        @SerializedName("id")
        private int id;
        @SerializedName("original_title")
        private String originalTitle;
        @SerializedName("original_language")
        private String originalLanguage;
        @SerializedName("title")
        private String title;
        @SerializedName("backdrop_path")
        private String backdropPath;
        @SerializedName("popularity")
        private float popularity;
        @SerializedName("vote_count")
        private int voteCount;
        @SerializedName("video")
        private boolean video;
        @SerializedName("vote_average")
        private int voteAverage;

        public UpcomingResult(String posterPath, boolean adult, String overview, String releaseDate,
                              List<Integer> genreIds, int id, String originalTitle,
                              String originalLanguage, String title, String backdropPath,
                              float popularity, int voteCount, boolean video, int voteAverage) {
            this.posterPath = posterPath;
            this.adult = adult;
            this.overview = overview;
            this.releaseDate = releaseDate;
            this.genreIds = genreIds;
            this.id = id;
            this.originalTitle = originalTitle;
            this.originalLanguage = originalLanguage;
            this.title = title;
            this.backdropPath = backdropPath;
            this.popularity = popularity;
            this.voteCount = voteCount;
            this.video = video;
            this.voteAverage = voteAverage;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public List<Integer> getGenreIds() {
            return genreIds;
        }

        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getOriginalTitle() {
            return originalTitle;
        }

        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        public String getOriginalLanguage() {
            return originalLanguage;
        }

        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        public float getPopularity() {
            return popularity;
        }

        public void setPopularity(float popularity) {
            this.popularity = popularity;
        }

        public int getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(int voteCount) {
            this.voteCount = voteCount;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public int getVoteAverage() {
            return voteAverage;
        }

        public void setVoteAverage(int voteAverage) {
            this.voteAverage = voteAverage;
        }

    }

}

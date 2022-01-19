package com.example.moviesaccess;

import java.util.Date;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class UpcomingMovie {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<UpcomingResult> results = null;
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

}

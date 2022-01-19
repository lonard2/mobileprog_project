package com.example.moviesaccess;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PopularMovie {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<PopularResult> results = null;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public PopularMovie(int page, List<PopularResult> results, int totalResults, int totalPages) {
        this.page = page;
        this.results = results;
        this.totalResults = totalResults;
        this.totalPages = totalPages;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<PopularResult> getResults() {
        return results;
    }

    public void setResults(List<PopularResult> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}

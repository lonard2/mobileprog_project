package com.example.moviesaccess;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/movie/{movie_id}")
    Call<Movie> gatherMovieInfo(@Path("movie_id") String id, @Query("apiKey") String apiKey);
}

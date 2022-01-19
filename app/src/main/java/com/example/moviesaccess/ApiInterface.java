package com.example.moviesaccess;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    //endpoints: Individual movie information (1), popular movies (2), upcoming movies (3), movie
    //cast (4)

    @GET("movie/{movie_id}")
    Call<Movie> gatherMovieInfo(@Path("movie_id") Integer movie_id, @Query("api_key") String api_key);

    @GET("movie/popular/")
    Call<PopularResult> gatherPopularData(@Query("api_key") String api_key);

    @GET("movie/upcoming/")
    Call<UpcomingResult> gatherUpcomingData(@Query("api_key") String api_key);

    @GET("movie/{movie_id}/credits/")
    Call<Cast> gatherMovieCast(@Path("movie_id") Integer id, @Query("api_key") String api_key);
}

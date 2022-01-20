package com.example.moviesaccess;

import java.util.List;

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
    Call<PopularMovie> gatherPopularData(@Query("api_key") String api_key);

    @GET("movie/now_playing/")
    Call<NowPlaying> gatherPlayingData(@Query("api_key") String api_key);

    @GET("movie/top_rated/")
    Call<TopRated> gatherHighlyRatedData(@Query("api_key") String api_key);

    @GET("movie/upcoming/")
    Call<UpcomingMovie> gatherUpcomingData(@Query("api_key") String api_key);

    @GET("movie/{movie_id}/credits/")
    Call<Cast> gatherMovieCast(@Path("movie_id") Integer id, @Query("api_key") String api_key);
}

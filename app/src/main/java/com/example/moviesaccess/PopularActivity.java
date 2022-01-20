package com.example.moviesaccess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PopularActivity extends AppCompatActivity {

    public static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static String API_KEY = "087c966e89e66df0fe40529ad3787030";

    RecyclerView mRecyclerView;
    PopularAdapter mAdapter;

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);

        mRecyclerView = findViewById(R.id.posterView);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        ApiInterface movieInterface = retrofit.create(ApiInterface.class);

        Call<PopularMovie> request = movieInterface.gatherPopularData(API_KEY);

        request.enqueue(new Callback<PopularMovie>() {
            @Override
            public void onResponse(Call<PopularMovie> call, Response<PopularMovie> response) {
                PopularMovie popularMovieList = response.body();
                List<PopularMovie.PopularResult> popularResponse = popularMovieList.getResults();

                mAdapter = new PopularAdapter(popularResponse);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<PopularMovie> call, Throwable t) {
                t.printStackTrace();
            }
        });

        findViewById(R.id.home_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PopularActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.update_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PopularActivity.this, UpcomingActivity.class);
                startActivity(intent);
            }
        });

    }
}
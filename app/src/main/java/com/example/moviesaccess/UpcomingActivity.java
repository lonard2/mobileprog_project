package com.example.moviesaccess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UpcomingActivity extends AppCompatActivity {

    public static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static String API_KEY = "087c966e89e66df0fe40529ad3787030";

    RecyclerView mRecyclerView;
    UpcomingAdapter mAdapter;

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming);

        mRecyclerView = findViewById(R.id.posterView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface movieInterface = retrofit.create(ApiInterface.class);

        Call<UpcomingMovie> request = movieInterface.gatherUpcomingData(API_KEY);

        request.enqueue(new Callback<UpcomingMovie>() {
            @Override
            public void onResponse(Call<UpcomingMovie> call, Response<UpcomingMovie> response) {
                UpcomingMovie upcomingMovieList = response.body();
                List<UpcomingMovie.UpcomingResult> upcomingResponse = upcomingMovieList.getResults();

                mAdapter = new UpcomingAdapter(upcomingResponse);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<UpcomingMovie> call, Throwable t) {
                t.printStackTrace();
            }
        });

        findViewById(R.id.home_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpcomingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.popular_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpcomingActivity.this, PopularActivity.class);
                startActivity(intent);
            }
        });

    }
}
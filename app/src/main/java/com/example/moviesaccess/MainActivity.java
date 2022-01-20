package com.example.moviesaccess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static String API_KEY = "087c966e89e66df0fe40529ad3787030";

    CarouselView carousel;
    RecyclerView mRecyclerView;
    MainAdapter mAdapter;

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    int[] carouselImages = {R.drawable.tenet, R.drawable.fastfurious,
                            R.drawable.tomjerry, R.drawable.worldwarz, R.drawable.war};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carousel = (CarouselView) findViewById(R.id.carousel);
        carousel.setPageCount(carouselImages.length);
        carousel.setImageListener(imageListener);

        mRecyclerView = findViewById(R.id.posterView);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        ApiInterface movieInterface = retrofit.create(ApiInterface.class);

        Call<NowPlaying> request = movieInterface.gatherPlayingData(API_KEY);

        request.enqueue(new Callback<NowPlaying>() {
            @Override
            public void onResponse(Call<NowPlaying> call, Response<NowPlaying> response) {
                NowPlaying nowPlayingList = response.body();
                List<NowPlaying.NowPlayingResult> nowPlayingResponse = nowPlayingList.getResults();

                mAdapter = new MainAdapter(nowPlayingResponse);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<NowPlaying> call, Throwable t) {
                t.printStackTrace();
            }
        });

        findViewById(R.id.popular_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PopularActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.update_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UpcomingActivity.class);
                startActivity(intent);
            }
        });

    }

    ImageListener imageListener = new ImageListener() {

        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(carouselImages[position]);
        }
    };

}
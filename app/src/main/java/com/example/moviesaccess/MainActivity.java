package com.example.moviesaccess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

    Random random = new Random();

    public static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static String API_KEY = "087c966e89e66df0fe40529ad3787030";
    public Integer ID = random.nextInt(99999);

    CarouselView carousel;
    TextView text;

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

        text = (TextView) findViewById(R.id.title);

        carousel = (CarouselView) findViewById(R.id.carousel);
        carousel.setPageCount(carouselImages.length);

        carousel.setImageListener(imageListener);

        ApiInterface movieInterface = retrofit.create(ApiInterface.class);

        Call<Movie> request = movieInterface.gatherMovieInfo(ID, API_KEY);

        request.enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {

                Movie movieResponse = response.body();
                String title = movieResponse.getTitle();

                text.setText(title);
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {

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
//
//        findViewById(R.id.settings_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
//                startActivity(intent);
//            }
//        });
    }

    ImageListener imageListener = new ImageListener() {

        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(carouselImages[position]);
        }
    };

}
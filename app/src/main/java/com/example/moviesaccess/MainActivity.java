package com.example.moviesaccess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    CarouselView carousel;

    int[] carouselImages = {R.drawable.tenet, R.drawable.fastfurious,
                            R.drawable.tomjerry, R.drawable.worldwarz, R.drawable.war};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carousel = (CarouselView) findViewById(R.id.carousel);
        carousel.setPageCount(carouselImages.length);

        carousel.setImageListener(imageListener);

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
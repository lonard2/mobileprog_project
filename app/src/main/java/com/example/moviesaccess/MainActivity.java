package com.example.moviesaccess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    CarouselView carousel;

//    int[] carouselImages = {R.drawable.tenet, R.drawable.fastfurious,
//                            R.drawable.tomjerry, R.drawable.worldwarz, R.drawable.war};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        carousel = (CarouselView) findViewById(R.id.carousel);
//        carousel.setPageCount(carouselImages.length);
//
//        carousel.setImageListener(imageListener);
    }

//    ImageListener imageListener = new ImageListener() {
//
//        @Override
//        public void setImageForPosition(int position, ImageView imageView) {
//            imageView.setImageResource(carouselImages[position]);
//        }
//    };

}
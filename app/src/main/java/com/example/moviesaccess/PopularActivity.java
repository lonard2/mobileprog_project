package com.example.moviesaccess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PopularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);
        RecyclerView upcomingviewRV= findViewById(R.id.upcomingviewRV);
        upcomingviewRV.setLayoutManager(new GridLayoutManager(this, 3 ));
        PopularAdapter popularAdapter= new PopularAdapter();
        upcomingviewRV.setAdapter(popularAdapter);
    }
}
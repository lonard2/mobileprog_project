package com.example.moviesaccess;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class UpcomingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming);

        ListView listView = findViewById(R.id.listView);
        UpcomingAdapter upcomingAdapter = new UpcomingAdapter();
        listView.setAdapter(upcomingAdapter);
    }
}
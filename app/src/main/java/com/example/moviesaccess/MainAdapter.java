package com.example.moviesaccess;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private List<NowPlaying.NowPlayingResult> mPosterList;

    public MainAdapter(List<NowPlaying.NowPlayingResult> posterList) {
        mPosterList = posterList;
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new MainAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NowPlaying.NowPlayingResult playing = mPosterList.get(position);

        Picasso.get().load("https://image.tmdb.org/t/p/w500" + playing.getPosterPath()).into(holder.posterImage);
    }

    @Override
    public int getItemCount() {
        return mPosterList.size();
        }


    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView posterImage;

        public ViewHolder(View view) {
            super(view);

            posterImage = view.findViewById(R.id.posterImage);
        }
    }
}

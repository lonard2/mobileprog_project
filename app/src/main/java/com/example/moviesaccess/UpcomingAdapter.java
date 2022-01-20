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

public class UpcomingAdapter extends RecyclerView.Adapter<UpcomingAdapter.ViewHolder> {

    private List<UpcomingMovie.UpcomingResult> mPosterList;

    public UpcomingAdapter(List<UpcomingMovie.UpcomingResult> posterList) {
        mPosterList = posterList;
    }

    @NonNull
    @Override
    public UpcomingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new UpcomingAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UpcomingMovie.UpcomingResult upcoming = mPosterList.get(position);

        Picasso.get().load("https://image.tmdb.org/t/p/w1280" + upcoming.getBackdropPath()).into(holder.backdropImage);
        holder.upcomingTitle.setText(upcoming.getTitle());
        holder.upcomingDate.setText("Coming " + upcoming.getReleaseDate());
        holder.upcomingLanguage.setText(upcoming.getOriginalLanguage());
        holder.upcomingDesc.setText(upcoming.getOverview());

    }

    @Override
    public int getItemCount() {
        return mPosterList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView backdropImage;
        final TextView upcomingTitle;
        final TextView upcomingDate;
        final TextView upcomingLanguage;
        final TextView upcomingDesc;

        public ViewHolder(View view) {
            super(view);

            backdropImage = view.findViewById(R.id.backdropImage);
            upcomingTitle = view.findViewById(R.id.upcomingTitle);
            upcomingDate = view.findViewById(R.id.upcomingDate);
            upcomingLanguage = view.findViewById(R.id.upcomingLanguage);
            upcomingDesc = view.findViewById(R.id.upcomingDesc);
        }
    }
}
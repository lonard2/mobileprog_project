package com.example.moviesaccess;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UpcomingAdapter extends BaseAdapter {
    Context context;
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.list_film, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        
        return convertView;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, detail, description;
        ImageView poster, platform;

        public ViewHolder(View view){
            super(view);
            title = view.findViewById(R.id.title);
            detail = view.findViewById(R.id.detail);
            description = view.findViewById(R.id.description);
            poster = view.findViewById(R.id.poster);
            platform = view.findViewById(R.id.platform);
        }
    }
}

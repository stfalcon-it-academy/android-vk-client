package com.stfalcon.vkclient.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.stfalcon.vkclient.R;
import com.stfalcon.vkclient.utils.AppUtils;

import java.util.List;

/**
 * Created by troy379 on 07.10.16.
 */

public class UserPhotosRecyclerAdapter
        extends RecyclerView.Adapter<UserPhotosRecyclerAdapter.PhotosViewHolder> {

    private List<String> urls;

    public UserPhotosRecyclerAdapter(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public PhotosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_photo, parent, false);

        return new PhotosViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PhotosViewHolder holder, int position) {
        AppUtils.loadImage(holder.imageView, urls.get(position));
    }

    @Override
    public int getItemCount() {
        return urls.size();
    }

    public void add(String url) {
        urls.add(0, url);
        notifyItemInserted(0);
    }

    class PhotosViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public PhotosViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }

    }
}

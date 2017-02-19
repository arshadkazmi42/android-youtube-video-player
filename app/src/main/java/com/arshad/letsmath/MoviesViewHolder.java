package com.arshad.letsmath;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MoviesViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.card_view)
    public CardView cvCard;

    @Bind(R.id.ivImage)
    public ImageView ivImage;

    @Bind(R.id.tvText)
    public TextView tvText;

    public MoviesViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}

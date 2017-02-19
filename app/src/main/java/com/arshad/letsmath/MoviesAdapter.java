package com.arshad.letsmath;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesViewHolder> {

    private static final String TAG = MoviesAdapter.class.getSimpleName();

    private Activity activity;
    private Context mContext;
    private List<Movies> movies;

    public MoviesAdapter(Activity activity, Context mContext, List<Movies> movies) {
        this.mContext = mContext;
        this.movies = movies;
        this.activity = activity;
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    @Override
    public void onBindViewHolder(final MoviesViewHolder holder, final int position) {
        final Movies movie = movies.get(position);

        holder.tvText.setText(movie.getName());
        Picasso.with(mContext).load(movie.getImage()).into(holder.ivImage);

        holder.cvCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mContext, MainActivity.class);

                i.putExtra("name", movie.getName());
                i.putExtra("cast", movie.getCast());
                i.putExtra("description", movie.getDescription());
                i.putExtra("image", movie.getImage());
                i.putExtra("trailer", movie.getTrailer());

                Pair<View, String> p1 = Pair.create((View) holder.ivImage, mContext.getResources().getString(R.string.photoTransition));
                Pair<View, String> p2 = Pair.create((View) holder.tvText, mContext.getResources().getString(R.string.nameTransition));
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(activity, p1, p2);
                if(Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
                    mContext.startActivity(i, options.toBundle());
                } else {
                    mContext.startActivity(i);
                }
            }
        });
    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from (mContext).inflate(R.layout.single_row_movies, viewGroup, false);
        return new MoviesViewHolder(v);
    }
}

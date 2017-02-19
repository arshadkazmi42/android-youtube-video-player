package com.arshad.letsmath;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by root on 19/2/17.
 */
public class MoviesListActivity extends AppCompatActivity {

    @Bind(R.id.rvMovies)
    RecyclerView rvMovies;

    private Context mContext;
    private RecyclerView.LayoutManager rvLayoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        ButterKnife.bind(this);
        mContext = this;

        rvLayoutManager = new GridLayoutManager(mContext, 2);
        rvMovies.setLayoutManager(rvLayoutManager);

        List<Movies> movies = GlobalFunctions.getMovies();
        MoviesAdapter adapter = new MoviesAdapter(this, this, movies);
        rvMovies.setAdapter(adapter);
        rvMovies.setItemAnimator(new DefaultItemAnimator());

    }
}

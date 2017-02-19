package com.arshad.letsmath;

import android.content.Context;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.pierfrancescosoffritti.youtubeplayer.AbstractYouTubeListener;
import com.pierfrancescosoffritti.youtubeplayer.YouTubePlayerView;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.youtube_player_view)
    YouTubePlayerView youTubePlayerView;

    @Bind(R.id.ivImage)
    ImageView ivImage;

    @Bind(R.id.tvTitle)
    TextView tvTitle;

    @Bind(R.id.tvCast)
    TextView tvCast;

    @Bind(R.id.tvDesc)
    TextView tvDesc;

    private String name, image, cast, description, trailer;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mContext = this;

        if(getIntent().hasExtra("name")) {
            name = getIntent().getStringExtra("name");
            image = getIntent().getStringExtra("image");
            cast = getIntent().getStringExtra("cast");
            description = getIntent().getStringExtra("description");
            trailer = getIntent().getStringExtra("trailer");

            populateViews();
        } else {
            finish();
        }
    }

    private void populateViews() {

        tvTitle.setText(name);
        tvCast.setText(cast);
        tvDesc.setText(description);
        Picasso.with(mContext).load(image).into(ivImage);

        Handler handlerTimer = new Handler();
        youTubePlayerView.initialize(new AbstractYouTubeListener() {
            @Override
            public void onReady() {
                youTubePlayerView.loadVideo(trailer, 0);
            }
        }, true);
        handlerTimer.postDelayed(new Runnable(){
            public void run() {
                // do something
            }}, 5000);
    }
}

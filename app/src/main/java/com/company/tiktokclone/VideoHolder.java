package com.company.tiktokclone;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;

public class VideoHolder extends RecyclerView.ViewHolder {

    //VideoView videoView;
    PlayerView videoView;
    TextView user, description, song, comment, like, share;
    ProgressBar progressBar;



    public VideoHolder(@NonNull View itemView) {
        super(itemView);
        videoView = itemView.findViewById(R.id.videoview);
        user = itemView.findViewById(R.id.tvUser);
        description = itemView.findViewById(R.id.tvContent);
        song = itemView.findViewById(R.id.tvSong);
        comment = itemView.findViewById(R.id.tvComments);
        like = itemView.findViewById(R.id.tvLikes);
        share = itemView.findViewById(R.id.tvShares);
        progressBar = itemView.findViewById(R.id.pb);
    }

    void setVideoData(VideoItem item) {
        user.setText(item.user);
        description.setText(item.description);
        song.setText(item.song);
        comment.setText(item.comment);
        like.setText(item.like);
        share.setText(item.shares);

/*
        videoView.setVideoPath(item.url);
        videoView.setOnPreparedListener(mp -> {
            progressBar.setVisibility(View.GONE);
            mp.start();
            float videoRatio = mp.getVideoWidth() / (float)mp.getVideoHeight();
            float screenRatio = videoView.getWidth() / (float)videoView.getHeight();
            float scale = videoRatio / screenRatio;

            if (scale >= 1f) {
                videoView.setScaleX(scale);
            } else {
                videoView.setScaleY(1f / scale);
            }
        });
        videoView.setOnCompletionListener(MediaPlayer::start);
*/


    }


}

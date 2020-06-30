package com.company.tiktokclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager2 viewPager2 = findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem item3 = new VideoItem();
        item3.url = "http://owdwbdj3mx.mncdn.com/testvideo/footboycompressed.mp4";
        item3.user = "@atarazona";
        item3.description = "Futbol test #hola #uwu\n#foryou #xyzcba";
        item3.song = "Musica Test 3 - mellaoficial";
        item3.like = "55K";
        item3.comment = "12";
        item3.shares = "111";
        videoItems.add(item3);

        VideoItem item1 = new VideoItem();
        item1.url = "http://owdwbdj3mx.mncdn.com/testvideo/parkcompressed.mp4";
        item1.user = "@atarazona";
        item1.description = "Testeando ando #hola #uwu\n#foryou #xyzcba";
        item1.song = "Musica Test 1 - mellaoficial";
        item1.like = "55K";
        item1.comment = "12";
        item1.shares = "111";
        videoItems.add(item1);

        viewPager2.setAdapter(new VideoAdapter(videoItems, this));

    }
}
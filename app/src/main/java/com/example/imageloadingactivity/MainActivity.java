package com.example.imageloadingactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);

        Glide.with(MainActivity.this).load("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg").centerCrop().placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_foreground).into(img);


    }
}
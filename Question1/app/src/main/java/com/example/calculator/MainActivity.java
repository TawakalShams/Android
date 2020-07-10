package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity<circleImageView> extends AppCompatActivity {
    private circleImageView profile_image;
    private static final int PICK_IMAGE = 1;
    private Object circleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //profile_image = (circleImageView) findViewById(R.id.profile_image);
    }
}
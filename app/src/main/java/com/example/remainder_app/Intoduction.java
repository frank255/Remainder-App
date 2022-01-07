package com.example.remainder_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class Intoduction extends AppCompatActivity {

    ImageView img,app_name;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intoduction);

        img = findViewById(R.id.img);
        app_name= findViewById(R.id.app_name);
        lottieAnimationView=findViewById(R.id.lottie);

        img.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        app_name.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);


    }
}
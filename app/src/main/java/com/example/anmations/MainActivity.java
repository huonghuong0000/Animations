package com.example.anmations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button btnSDown;
    private Button btnSUp;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSDown = (Button)findViewById(R.id.btnslideDown);
        btnSUp = (Button)findViewById(R.id.btnSlideUp);
        img = (ImageView)findViewById(R.id.imageView);

        btnSDown.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Animation animSDow = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
                img.startAnimation(animSDow);
            }
        });

        btnSUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Animation animSUp = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
                img.startAnimation(animSUp);
            }
        });
    }
}

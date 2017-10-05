package com.gpsirsa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class Contact extends AppCompatActivity {
    ImageView a;
TextView b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView button = (TextView) findViewById(R.id.textView7);
        Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        button.startAnimation(startAnimation);

        TextView button1 = (TextView) findViewById(R.id.textView10);
        button1.startAnimation(startAnimation);

       /* a =(ImageView)findViewById(R.id.imageView);
        b =(ImageView)findViewById(R.id.imageView4);


        Animation result = new TranslateAnimation(450, -1000, 0, 0);
        result.setDuration(6000);
        result.setRepeatMode(Animation.REVERSE);
        result.setRepeatCount(Animation.INFINITE);
        // TextView textViewMarqToLeft = (TextView) findViewById(R.id.textView12);

        a.setAnimation(result);

        Animation ani = new TranslateAnimation(350, -1000, 0, 0);
        ani.setDuration(6000);
        ani.setRepeatMode(Animation.REVERSE);
        ani.setRepeatCount(Animation.INFINITE);
        // TextView textViewMarqToLeft = (TextView) findViewById(R.id.textView12);

        b.setAnimation(ani);*/
    }
}

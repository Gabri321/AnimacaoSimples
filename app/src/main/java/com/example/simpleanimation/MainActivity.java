package com.example.simpleanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isBartHere = true;
    public void Swap(View view) {
        ImageView Bart = (ImageView) findViewById(R.id.bart);
        ImageView Homer = (ImageView) findViewById(R.id.homer);

        if (isBartHere) {
            isBartHere = false;
           Bart.animate().alpha(0).setDuration(2000);
           Homer.animate().alpha(1).setDuration(2000);
        } else {
            isBartHere = true;
            Homer.animate().alpha(0).setDuration(2000);
            Bart.animate().alpha(1).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
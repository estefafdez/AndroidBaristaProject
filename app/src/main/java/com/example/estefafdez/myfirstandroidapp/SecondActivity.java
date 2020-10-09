package com.example.estefafdez.myfirstandroidapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView baristaText;
    TextView androidText;
    ImageView barista_img;
    ImageView android_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        baristaText = (TextView) findViewById(R.id.baristaText);
        androidText = (TextView) findViewById(R.id.androidText);
        barista_img = (ImageView) findViewById(R.id.barista_img);
        android_img = (ImageView) findViewById(R.id.android_img);

    }

}

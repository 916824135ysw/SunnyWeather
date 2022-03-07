package com.sunnyweather.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("tag","1");
        super.onCreate(savedInstanceState);
//        Intent intent = new Intent(this, WeatherActivity.class);
//        intent.putExtra("weather_id", "CN101200101");
//        startActivity(intent);
       Log.d("tag","1");
        setContentView(R.layout.activity_main);
    }
}
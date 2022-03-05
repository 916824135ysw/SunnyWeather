package com.sunnyweather.android;

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

=======
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

>>>>>>> 6eeb3ab (text)
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
=======
//        Intent intent = new Intent(this, WeatherActivity.class);
//        intent.putExtra("weather_id", "CN101200101");
//        startActivity(intent);
>>>>>>> 6eeb3ab (text)
        setContentView(R.layout.activity_main);
    }
}
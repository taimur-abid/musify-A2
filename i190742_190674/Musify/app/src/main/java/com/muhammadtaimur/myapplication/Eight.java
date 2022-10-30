package com.muhammadtaimur.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class Eight extends AppCompatActivity {

    SharedPreferences mPref;
    SharedPreferences.Editor editmPref;
    ImageView left;
    DrawerLayout drwr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);


    }

}
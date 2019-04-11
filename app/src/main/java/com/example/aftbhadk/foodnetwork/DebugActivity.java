package com.example.aftbhadk.foodnetwork;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);

        SharedPreferences sh = getApplicationContext().getSharedPreferences("PREF", Context.MODE_PRIVATE);
    }
}

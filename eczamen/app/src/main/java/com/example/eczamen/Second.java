package com.example.eczamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void second1(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void second2(View v) {
        Intent intent = new Intent(this, SecondActivity2.class);
        startActivity(intent);
    }
    public void second5(View v) {
        Intent intent = new Intent(this, SecondActivity4.class);
        startActivity(intent);
    }
}
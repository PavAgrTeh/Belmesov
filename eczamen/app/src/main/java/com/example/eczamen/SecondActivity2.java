package com.example.eczamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
    }

    public void second3(View v) {
        Intent intent = new Intent(this, Second.class);
        startActivity(intent);
    }

    public void second4(View v) {
        Intent intent = new Intent(this, SecondActivity3.class);
        startActivity(intent);
    }
}
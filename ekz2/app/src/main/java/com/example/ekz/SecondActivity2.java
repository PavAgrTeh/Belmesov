package com.example.ekz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ekz.databinding.ActivitySecond2Binding;

public class SecondActivity2 extends Activity {


    private ActivitySecond2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySecond2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
    public void second2(View v){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}
package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signUp(View v){
        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
//        setContentView(R.Layout);
    }

    public void next(View v)
    {
        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(i);
        setContentView(R.layout.activity_main2);
    }
}
package com.example.selfbuildandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        Button  btn1 = findViewById(R.id.button4);
        Button  btn2 = findViewById(R.id.button5);
        btn2.setVisibility(View.INVISIBLE);

    }

    public void btn11(View view) {
        Button  btn2 = findViewById(R.id.button5);
        Button  btn1 = findViewById(R.id.button4);
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.VISIBLE);

        Intent intent = new Intent(this,ListViewBasicActivity.class);

        startActivity(intent);


    }

    public void btn22(View view) {
    }
}
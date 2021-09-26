package com.example.selfbuildandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        outMessage();
    }

    public void outMessage ()
    {
        /*
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        */
        Intent intent = getIntent();
        String hold = "";
        String message = intent.getStringExtra("holdnumber");

        for(int i =0  ; i < 10 ;i ++){
            hold += intent.getStringExtra("Xuantutk"+i);
            hold += intent.getStringExtra("Xuantumk"+i);

        }
        

        Toast.makeText(getApplicationContext(),"Hello Javatpoint2"+message,Toast. LENGTH_SHORT).show();


        TextView textView = findViewById(R.id.textView2);
        textView.setText(hold);


    }
}
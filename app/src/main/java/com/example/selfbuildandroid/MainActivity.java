package com.example.selfbuildandroid;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    Connection conn ;
    String connectionResult = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void SubmitMain(View view) {

        Intent intent = new Intent(this,SubActivity.class);

        int i =0;

        try {

            ConnectionHelper connectionHelper =  new ConnectionHelper();
            conn = connectionHelper.connectclass();
            if(conn != null){

                Toast.makeText(getApplicationContext(),"Succeed connect DB",Toast. LENGTH_SHORT).show();

                String query = "Select * from User";
                Statement ts = conn.createStatement();
                ResultSet rs = ts.executeQuery(query);

                while (rs.next()){
                    intent.putExtra("Xuantutk" + i,rs.getString(1) + "; ");
                    intent.putExtra("Xuantumk" + i,rs.getString(1) + "; ");

                    i ++;
                }
            }else
            {
                Toast.makeText(getApplicationContext(),"Cannot connect DB",Toast. LENGTH_SHORT).show();

            }

        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"Cannot connect DB",Toast. LENGTH_SHORT).show();

        }


        Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast. LENGTH_SHORT).show();




        /*
        TextView textView = findViewById(R.id.textView2);
        String message = textView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);

        Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast. LENGTH_SHORT).show();
*/

        startActivity(intent);



    }
}
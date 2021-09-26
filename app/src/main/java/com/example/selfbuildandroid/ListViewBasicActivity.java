package com.example.selfbuildandroid;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListViewBasicActivity extends AppCompatActivity {
    ListView lvStudentBasic1;
    List<String> studentList = new ArrayList<String>();
    ArrayAdapter<String> studentArrayAdapterBasic1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_basic);
        lvStudentBasic1 = findViewById(R.id.lvStudentBasic1);

        fakeData();

        studentArrayAdapterBasic1
                = new ArrayAdapter<String>(ListViewBasicActivity.this, android.R.layout.simple_list_item_single_choice,studentList);
        lvStudentBasic1.setAdapter(studentArrayAdapterBasic1);
    }

    private void fakeData() {
        for(int i = 0 ; i < 10 ; i ++){
            studentList.add("student" + i);
        }
    }
}
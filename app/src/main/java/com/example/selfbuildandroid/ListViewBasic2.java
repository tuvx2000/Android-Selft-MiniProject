package com.example.selfbuildandroid;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.libs.Model.StudentModel;

import java.util.ArrayList;
import java.util.List;

public class ListViewBasic2 extends AppCompatActivity {
    ListView listViewStudentBasic2;
    List<StudentModel> studentModelList = new ArrayList<StudentModel>();

    ArrayAdapter<StudentModel> studentArrayAdapterBasic2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_basic2);

        listViewStudentBasic2 = findViewById(R.id.listViewStudentBasic2);


        fakeData();

        studentArrayAdapterBasic2
                = new ArrayAdapter<StudentModel>(ListViewBasic2.this, android.R.layout.simple_list_item_1,studentModelList);
        listViewStudentBasic2.setAdapter(studentArrayAdapterBasic2);

    }


    private void fakeData() {
        for(int i = 0 ; i < 10 ; i ++){
            studentModelList.add(new StudentModel("00" +i,"Tu" +i, "132465"));
        }
    }
}
package com.example.selfbuildandroid;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.libs.Model.ProductModel;
import com.example.selfbuildandroid.Adapter.ProductAdapter;

public class ListViewAdvance extends AppCompatActivity {
    ListView lvProductAdvance;
    ProductAdapter productAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_advance);

        lvProductAdvance = findViewById(R.id.lvProductAdvance);

        productAdapter = new ProductAdapter(ListViewAdvance.this,R.layout.productitem);

        productAdapter.add(new ProductModel(R.drawable.s,"xuan tu dep trai",10000000.0));
        productAdapter.add(new ProductModel(R.drawable.mssv,"xsadsadsaai",10000000.0));
        lvProductAdvance.setAdapter(productAdapter);

        // bat su kien tren lít item

        lvProductAdvance.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ProductModel spModel =(ProductModel) adapterView.getAdapter().getItem(i);
                Log.v("Log:",spModel.getName();
            }
        });


    }
}
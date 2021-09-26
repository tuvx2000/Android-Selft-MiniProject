package com.example.selfbuildandroid.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.libs.Model.ProductModel;
import com.example.selfbuildandroid.R;

public class ProductAdapter extends ArrayAdapter<ProductModel> {
    Activity context;
    int resource;

    public ProductAdapter(@NonNull Context context, int resource) {
        super(context, resource);

        this.context = (Activity) context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View productView = layoutInflater.inflate(this.resource,null);

        ImageView imgProduct = productView.findViewById(R.id.imageView1111);
        TextView txtProductName = productView.findViewById(R.id.productName);

        TextView txtProductPrice = productView.findViewById(R.id.productPrice);

        ProductModel spModel = getItem(position);

        imgProduct.setImageResource(spModel.getPic());
        txtProductName.setText(spModel.getName());
        txtProductPrice.setText(spModel.getPrice() + "");


        return productView;
    }
}

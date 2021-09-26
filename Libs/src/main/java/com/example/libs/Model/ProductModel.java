package com.example.libs.Model;

public class ProductModel {
    int Pic;
    String Name;
    Double Price;

    public ProductModel() {

    }

    public ProductModel(int pic, String name, double price) {
        Pic = pic;
        Name = name;
        Price = price;

    }


    public int getPic() {
        return Pic;
    }

    public void setPic(int pic) {
        Pic = pic;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }
}

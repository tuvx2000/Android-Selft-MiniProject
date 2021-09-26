package com.example.libs.Model;

import java.io.Serializable;

public class StudentModel implements Serializable {
    String Indentify;
    String Name;
    String Phone;

    public StudentModel(String indentify, String name, String phone) {
        Indentify = indentify;
        Name = name;
        Phone = phone;
    }

    public String getIndentify() {
        return Indentify;
    }

    public void setIndentify(String indentify) {
        Indentify = indentify;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return
                Indentify + '-' +
               Name + '\n' +
                Phone
                ;
    }
}

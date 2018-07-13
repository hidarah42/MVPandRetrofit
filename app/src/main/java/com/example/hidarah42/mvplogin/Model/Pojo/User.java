package com.example.hidarah42.mvplogin.Model.Pojo;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class User{

    private String id,password;

    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }
}

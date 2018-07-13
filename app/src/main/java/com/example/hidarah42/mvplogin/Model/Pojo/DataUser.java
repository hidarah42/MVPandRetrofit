package com.example.hidarah42.mvplogin.Model.Pojo;

import com.google.gson.annotations.SerializedName;

public class DataUser {

//    sebagai parameternya
    @SerializedName("login")
    private String login;
    @SerializedName("name")
    private String name;
    @SerializedName("bio")
    private String bio;


    public DataUser(String login, String name, String bio) {
        this.login = login;
        this.name = name;
        this.bio = bio;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}

package com.example.hidarah42.mvplogin.Presenter.Interface;

import android.support.v7.app.AppCompatActivity;

import com.example.hidarah42.mvplogin.Config.API;
import com.example.hidarah42.mvplogin.Model.Pojo.DataUser;
import com.example.hidarah42.mvplogin.Model.Pojo.User;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

//    //Method
    @GET(API.endpointUser+"hidarah42")
    Call<DataUser> getDataUser();
}

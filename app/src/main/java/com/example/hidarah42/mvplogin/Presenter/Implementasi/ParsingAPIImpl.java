package com.example.hidarah42.mvplogin.Presenter.Implementasi;

import android.util.Log;

import com.example.hidarah42.mvplogin.Config.API;
import com.example.hidarah42.mvplogin.Model.Pojo.DataUser;
import com.example.hidarah42.mvplogin.Presenter.Interface.ApiInterface;
import com.example.hidarah42.mvplogin.Presenter.Interface.ParsingAPI;
import com.example.hidarah42.mvplogin.View.UI.MainActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ParsingAPIImpl implements ParsingAPI {
    public ParsingAPIImpl(MainActivity mainActivity) {
    }


    @Override
    public void onParsing() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.urlGithub)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiInterface apiInterface= retrofit.create(ApiInterface.class);
        Call<DataUser> call = apiInterface.getDataUser();
        call.enqueue(new Callback<DataUser>() {
            @Override
            public void onResponse(Call<DataUser> call, Response<DataUser> response) {
                DataUser dataUser = response.body();

                Log.d("Hasil","Login: "+dataUser.getLogin());
            }

            @Override
            public void onFailure(Call<DataUser> call, Throwable t) {

            }
        });
    }
}

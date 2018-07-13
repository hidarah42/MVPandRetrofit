package com.example.hidarah42.mvplogin.Presenter.Implementasi;

import android.util.Log;

import com.example.hidarah42.mvplogin.Presenter.Interface.LoginPresenter;
import com.example.hidarah42.mvplogin.View.UI.MainActivity;
import com.example.hidarah42.mvplogin.Model.Pojo.User;

public class LoginPresenterImpl implements LoginPresenter {

    public LoginPresenterImpl(MainActivity mainActivity) {
    }

    @Override
    public void onLogin(String id, String password) {
       User user = new User(id, password);

       String idnya = user.getId();
       String passwordnya = user.getPassword();

       if (!idnya.isEmpty()&&!passwordnya.isEmpty()){
            Log.d("status","berhasil");

        } else{
           Log.d("status","gagal");
       }
    }
}

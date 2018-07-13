package com.example.hidarah42.mvplogin.View.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hidarah42.mvplogin.Presenter.Implementasi.LoginPresenterImpl;
import com.example.hidarah42.mvplogin.Presenter.Implementasi.ParsingAPIImpl;
import com.example.hidarah42.mvplogin.R;

public class MainActivity extends AppCompatActivity {

    //Komponen
    private EditText etID,etPassword;
    private Button btnLogin;
    LoginPresenterImpl loginPresenter;
    ParsingAPIImpl parsingAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inisialisasi
        etID = (EditText)findViewById(R.id.et_id);
        etPassword = (EditText)findViewById(R.id.et_pass);
        btnLogin = (Button)findViewById(R.id.btn_login);
        loginPresenter = new LoginPresenterImpl(MainActivity.this);
        parsingAPI = new ParsingAPIImpl((MainActivity.this));

        //btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.onLogin(etID.getText().toString(),etPassword.getText().toString());
                parsingAPI.onParsing();
            }
        });

    }
}

package com.example.sam.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

    }


    public void loginClick(View view) {
        String userName = etUsername.getText().toString();
        String password = etPassword.getText().toString();

        if (userName.equals("sam") && password.equals("123")) {
            Toast.makeText(getApplicationContext(), "登陆成功", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "登陆失败", Toast.LENGTH_LONG).show();

        }

    }
}

package com.example.sam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etNum1;
    private EditText etNum2;
    private Button btnAdd;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        tvResult = (TextView) findViewById(R.id.tvResult);

    }

    /**
     * 点击=
     *
     * @param view
     */
    public void addClick(View view) {
        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());

        tvResult.setText(num1+num2+"");
    }
}

package com.ultralegends.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textview;
    Button incbtn, decbtn,resetbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textview);
        incbtn = findViewById(R.id.increment);
        decbtn = findViewById(R.id.decrement);
        resetbtn = findViewById(R.id.resetbtn);

        incbtn.setOnClickListener(this);
        decbtn.setOnClickListener(this);
        resetbtn.setOnClickListener(this);
        textview.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        int data=0;
        switch (view.getId())
        {
            case R.id.increment:
                data = Integer.parseInt(textview.getText().toString());
                data++;
                textview.setText(data + "");
                break;
            case R.id.decrement:
                data = Integer.parseInt(textview.getText().toString());
                data--;
                textview.setText(data + "");
                break;
            case R.id.resetbtn:
                textview.setText("0");
                break;
            default:
                break;
        }
    }
}
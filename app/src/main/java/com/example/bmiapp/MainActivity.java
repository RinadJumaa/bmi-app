package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText weight, height;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight = findViewById(R.id.edttxt_weight);
        height = findViewById(R.id.edttxt_height);
    }

    public void btn_onClick(View view) {

        String weightValue = weight.getText().toString();
        String heightValue = height.getText().toString();

        float floatweight = Float.parseFloat(weightValue);
        float floatheight = Float.parseFloat(heightValue)/100;
        float bmi = floatweight/(floatheight*floatheight) ;
        Toast.makeText(this, "BMI = " + bmi, Toast.LENGTH_SHORT).show();

    }
}
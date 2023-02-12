package com.example.salary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextInputEditText mySalary;
    int mySalaryString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySalary = (TextInputEditText) findViewById(R.id.mySalary);
        Button next = (Button) findViewById(R.id.buttonNext);
        next.setOnClickListener(this);
        mySalaryString = mySalary.getBottom();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonNext:
                Intent i = new Intent(this, SecondActivity.class);
                i.putExtra("MYSALARY", mySalaryString);
                startActivity(i);
        }
    }
}
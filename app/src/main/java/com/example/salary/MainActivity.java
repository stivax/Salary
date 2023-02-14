package com.example.salary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText mySalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySalary = (EditText) findViewById(R.id.mySalary);
        Button next = (Button) findViewById(R.id.buttonNext);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonNext:
                Intent i = new Intent(this, SecondActivity.class);
                i.putExtra("MYSALARY", mySalary.getText().toString());
                startActivity(i);
        }
    }
}
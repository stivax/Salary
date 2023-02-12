package com.example.salary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.lang.invoke.VarHandle;

public class SecondActivity extends AppCompatActivity {
    TextView text2;
    int mySalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text2 = findViewById(R.id.textView2);
        Bundle bungle = getIntent().getExtras();
        mySalary = bungle.getInt("MYSALARY");
        text2.setText("" + mySalary);


    }
}
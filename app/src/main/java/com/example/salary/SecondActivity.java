package com.example.salary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.lang.invoke.VarHandle;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text2;
    String mySalary;
    FragmentManager fm;
    Button yes;
    Button no;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text2 = findViewById(R.id.textView2);
        Bundle bungle = getIntent().getExtras();
        mySalary = bungle.getString("MYSALARY");
        text2.setText(""+mySalary+"$");
        yes = (Button) findViewById(R.id.buttonYes);
        no = (Button) findViewById(R.id.buttonNo);
        back = (Button) findViewById(R.id.buttonBack);
        FrameLayout frame = findViewById(R.id.frame);
        fm = getSupportFragmentManager();
        yes.setOnClickListener(this);
        no.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonYes:
                fm.beginTransaction().replace(R.id.frame, new FirstFragment()).commit();
                break;
            case R.id.buttonNo:
                if (no.getText().equals("YES")){
                    fm.beginTransaction().replace(R.id.frame, new FirstFragment()).commit();
                }
                no.setText("YES");
                break;
            case R.id.buttonBack:
                finish();
        }
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    public String supplement = "ooo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);

        textView.setText(new Friend(){
            public String io = "2233";

            @Override
            public String greet() {
                return super.greet()+io+supplement;
            }
        }.greet());
    }
}
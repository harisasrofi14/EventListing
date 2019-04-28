package com.example.haris.eventlisting.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.haris.eventlisting.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Bundle extras = getIntent().getExtras();
        String textAbout =  extras.getString("aboutText");
        initView(textAbout);
    }

    public void initView(String text){
        TextView tv_about = findViewById(R.id.tv_about);
        tv_about.setText(text);

    }
}

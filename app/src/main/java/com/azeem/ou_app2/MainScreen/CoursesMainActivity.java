package com.azeem.ou_app2.MainScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.azeem.ou_app2.R;

public class CoursesMainActivity extends AppCompatActivity {

    String myUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_main);

        myUrl = getIntent().getStringExtra("myUrl");



    }
}
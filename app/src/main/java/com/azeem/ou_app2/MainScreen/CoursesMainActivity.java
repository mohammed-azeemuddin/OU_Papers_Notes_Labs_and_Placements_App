package com.azeem.ou_app2.MainScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.azeem.ou_app2.R;

public class CoursesMainActivity extends AppCompatActivity {

    String info;
    TextView infoTextView;
    Button clickHereBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_main);

        info = getIntent().getStringExtra("info");
        infoTextView = findViewById(R.id.infoTextView);
        clickHereBtn = findViewById(R.id.click_here_btn);

        infoTextView.setText(info);

        clickHereBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent();
                intent2.setAction(Intent.ACTION_VIEW);
                intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                intent2.setData(Uri.parse("https://www.facebook.com"));
            }
        });

    }
}

package com.azeem.ou_app2.MainScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.azeem.ou_app2.R;

public class JobsAndInternshipsMainActivity extends AppCompatActivity {

    String info;
    TextView infoTextView2;
    Button clickHereBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_and_internships_main);

        info = getIntent().getStringExtra("info");
        infoTextView2 = findViewById(R.id.infoTextView2);
        clickHereBtn = findViewById(R.id.click_here_btn);

        infoTextView2.setText(info);

        clickHereBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent();
                intent2.setAction(Intent.ACTION_VIEW);
                intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                intent2.setData(Uri.parse("https://www.facebook.com"));
                startActivity(intent2);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(JobsAndInternshipsMainActivity.this,PlacementAndInterviews.class);
        startActivity(intent);
    }
}

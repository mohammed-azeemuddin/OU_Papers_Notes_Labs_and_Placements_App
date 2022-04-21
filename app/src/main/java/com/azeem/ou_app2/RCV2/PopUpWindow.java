package com.azeem.ou_app2.RCV2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.azeem.ou_app2.R;


public class PopUpWindow extends AppCompatActivity  {

    private  ImageView downloadDoc;
    private  String link2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_up_window);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.5),(int)(height*0.3));


        downloadDoc=findViewById(R.id.downloadDoc);

        //Intent intent = getIntent();
        //link1=intent.getStringExtra("url1");
        //link2=intent.getStringExtra("url2");

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                link2 = null;
            } else {
                link2 = extras.getString("url2");
            }
        } else {
            link2= (String) savedInstanceState.getSerializable("url2");
        }

        downloadDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent();
                intent2.setAction(Intent.ACTION_VIEW);
                intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                intent2.setData(Uri.parse(link2));
                startActivity(intent2);
            }
        });


    }
}

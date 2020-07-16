package com.azeem.ou_app2.MainScreen;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.azeem.ou_app2.R;

import java.util.ArrayList;

public class PlacementAndInterviews extends AppCompatActivity {

    // private AdView mAdView;

    ArrayList<DashModel> dashModelArrayList;
    private RecyclerView recyclerView;
    DashAdapter dashAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement_and_interviews);

        if(!isOnline())
            Toast.makeText(this, "No Internet connection!", Toast.LENGTH_LONG).show();

        /*
        // for initializing ad and requesting ad
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mAdView = findViewById(R.id.adView32);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

         */

        recyclerView = findViewById(R.id.rv1);

        dashModelArrayList = new ArrayList<>();

        String heads[] = {
                "Aptitude and Reasoning",
                "Technical MCQs (C,C++,Java,Python)",
                "Interview Questions and Preparation",
                "Company Specific Courses",
                "Free/Paid courses",
                "Jobs and Internships"
                };

        String subs[] = {
                "Tests and Video Tutorials",
                "Tests and Video Tutorials",
                "Important questions asked in interviews and efficient ways of cracking interviews",
                "Courses tailored for company specific questions in tests and aptitude",
                "Best online courses for improving your skills",
                "Updates on Jobs and internships"
                };

        int images[] = {
                R.drawable.find_jobs,
                R.drawable.tech_mcqs,
                R.drawable.interview_ques,
                R.drawable.comp_courses,
                R.drawable.free_paid_courses,
                R.drawable.jobs_and_internships
                };

        for(int count = 0 ; count < heads.length ; count++)
        {
            DashModel dashModel = new DashModel();
            dashModel.setHead(heads[count]);
            dashModel.setSub(subs[count]);
            dashModel.setImage(images[count]);
            dashModelArrayList.add(dashModel);
            //this should be retrieved in our adapter
        }
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        dashAdapter = new DashAdapter(dashModelArrayList,PlacementAndInterviews.this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(dashAdapter);
    }

    private boolean isOnline() {
        ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        if(netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()){
            return false;
        }
        return true;
    }


}


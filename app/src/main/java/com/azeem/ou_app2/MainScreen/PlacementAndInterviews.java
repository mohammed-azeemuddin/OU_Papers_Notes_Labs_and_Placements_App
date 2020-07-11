package com.azeem.ou_app2.MainScreen;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.azeem.ou_app2.R;
import com.azeem.ou_app2.RCV2.SingleItemDetails;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.Collections;

public class PlacementAndInterviews extends AppCompatActivity {

    ArrayList<DashModel> dashModelArrayList;
    private RecyclerView recyclerView;
    DashAdapter dashAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement_and_interviews);
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
                R.drawable.my_notification,
                R.drawable.my_notification2
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
}

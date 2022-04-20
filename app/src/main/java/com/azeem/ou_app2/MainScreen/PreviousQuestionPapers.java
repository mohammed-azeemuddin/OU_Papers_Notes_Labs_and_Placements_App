package com.azeem.ou_app2.MainScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.azeem.ou_app2.R;
import com.azeem.ou_app2.RCV2.SingleItemDetails;

import org.parceler.Parcels;

import java.util.List;

public class PreviousQuestionPapers extends AppCompatActivity {

    LinearLayout engg_btn,pharm_btn,bba_btn,law_btn,other_btn;
    String enggCollection,pharmCollection,bbaCollection,lawCollection,otherCollection;
    Parcelable parcelable;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prev_question_first_dashboard);

        engg_btn = findViewById(R.id.engg_btn);
        pharm_btn = findViewById(R.id.pharm_btn);
        bba_btn = findViewById(R.id.bba_btn);
        law_btn = findViewById(R.id.law_btn);
        other_btn = findViewById(R.id.other_btn);

        enggCollection = "engineering_qp";
        pharmCollection = "pharmacy_qp";
        bbaCollection = "bba_qp";
        lawCollection = "law_qp";
        otherCollection = "other_qp";

        engg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parcelable = Parcels.wrap(enggCollection);
                Intent intent = new Intent(PreviousQuestionPapers.this,TestFirebase.class);
                intent.putExtra("collectionName", parcelable);
                startActivity(intent);
            }
        });

        pharm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parcelable = Parcels.wrap(pharmCollection);
                Intent intent = new Intent(PreviousQuestionPapers.this,TestFirebase.class);
                intent.putExtra("collectionName", parcelable);
                startActivity(intent);

            }
        });

        bba_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parcelable = Parcels.wrap(bbaCollection);
                Intent intent = new Intent(PreviousQuestionPapers.this,TestFirebase.class);
                intent.putExtra("collectionName", parcelable);
                startActivity(intent);
            }
        });

        law_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parcelable = Parcels.wrap(lawCollection);
                Intent intent = new Intent(PreviousQuestionPapers.this,TestFirebase.class);
                intent.putExtra("collectionName", parcelable);
                startActivity(intent);
            }
        });

        other_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parcelable = Parcels.wrap(otherCollection);
                Intent intent = new Intent(PreviousQuestionPapers.this,TestFirebase.class);
                intent.putExtra("collectionName", parcelable);
                startActivity(intent);
            }
        });
    }

    /*public void populateFirstYearList()
    {
        String JSON_URL = "http://www.json-generator.com/api/json/get/bOvHrmlArS?indent=2";
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, JSON_URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        //JSONObject songObject = response.getJSONObject(i);
                        JSONObject movieObject = response.getJSONObject(i);

                        SingleItemDetails mov = new SingleItemDetails();
                        mov.setTitle(movieObject.getString("title"));
                        mov.setUrlForDownload(movieObject.getString("urlForDownload"));
                        first_year_list.add(mov);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("tag", "onErrorResponse: " + error.getMessage());
            }
        });

        queue.add(jsonArrayRequest);

    }

     */

    /*
    public void moveToNextActivity(String branch)
    {
        Intent intent = new Intent(PreviousQuestionPapers.this,PreviousQuestionPapers2.class);
        intent.putExtra("branch",branch);
        this.startActivity(intent);
    }
    */


}



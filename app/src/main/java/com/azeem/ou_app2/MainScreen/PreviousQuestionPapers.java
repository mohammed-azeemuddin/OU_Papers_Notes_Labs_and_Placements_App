package com.azeem.ou_app2.MainScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.azeem.ou_app2.R;
import com.azeem.ou_app2.RCV2.RecyclerMainActivity;
import com.azeem.ou_app2.RCV2.SingleItemDetails;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PreviousQuestionPapers extends AppCompatActivity {

    TextView firstYear;
    TextView branch_it;
    TextView branch_cse;
    TextView branch_ece;
    TextView branch_mech;
    TextView branch_civil;
    TextView branch_prod;
    TextView branch_eee;
    TextView branch_eie;

    public static List<SingleItemDetails> first_year_list;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prev_question_first_dashboard);

        first_year_list = new ArrayList<>();
        firstYear = findViewById(R.id.first_year);
        branch_it = findViewById(R.id.branch_it);
        branch_cse = findViewById(R.id.branch_cse);
        branch_ece = findViewById(R.id.branch_ece);
        branch_mech = findViewById(R.id.branch_mech);
        branch_civil = findViewById(R.id.branch_civil);
        branch_prod = findViewById(R.id.branch_prod);
        branch_eee = findViewById(R.id.branch_eee);
        branch_eie = findViewById(R.id.branch_eie);

        populateFirstYearList();
        final Parcelable parcelable = Parcels.wrap(first_year_list);

        firstYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviousQuestionPapers.this, RecyclerMainActivity.class);
                intent.putExtra("firstYearList", parcelable);
                intent.putExtra("isOnlyFirstYearClicked",1);
                startActivity(intent);
            }
        });

        branch_it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToNextActivity("it");
            }
        });

        branch_cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToNextActivity("cse");
            }
        });

        branch_ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToNextActivity("ece");
            }
        });

        branch_mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToNextActivity("mech");
            }
        });

        branch_civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToNextActivity("civil");
            }
        });

        branch_prod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToNextActivity("prod");
            }
        });

        branch_eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToNextActivity("eee");
            }
        });

        branch_eie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToNextActivity("eie");
            }
        });


    }

    public void populateFirstYearList()
    {
        first_year_list.add(new SingleItemDetails("CPPS",
                "https://drive.google.com/file/d/1gl1fS-7y9t0uOLgvQLgfq7BkBv0rJY-K/view?usp=sharing"));
        first_year_list.add(new SingleItemDetails("Engineering Chemistry",
                "https://drive.google.com/file/d/1OuWRB-_uF6bBumxXO_jRZCOelIUUn2n_/view?usp=sharing"));
        first_year_list.add(new SingleItemDetails("Engineering English",
                "https://drive.google.com/file/d/1I_dgtpNBuRcgFXqOUNM9bHMdv0JAVf4p/view?usp=sharing"));
        first_year_list.add(new SingleItemDetails("Engineering Physics",
                "https://drive.google.com/file/d/1KKtU8wwBptHwacda8A8z_rL0m9KrtepD/view?usp=sharing"));
        first_year_list.add(new SingleItemDetails("Engineering Mathematics-I",
                "https://drive.google.com/file/d/1VGf8TM1WdIrk2b22ve5F9M9MUuPRXQes/view?usp=sharing"));
        first_year_list.add(new SingleItemDetails("Mechanics",
                "https://drive.google.com/file/d/19c4sHVk5BuqBAxp2U63dOU58JQnEmres/view?usp=sharing"));
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

    public void moveToNextActivity(String branch)
    {
        Intent intent = new Intent(PreviousQuestionPapers.this,PreviousQuestionPapers2.class);
        intent.putExtra("branch",branch);
        this.startActivity(intent);
    }


}



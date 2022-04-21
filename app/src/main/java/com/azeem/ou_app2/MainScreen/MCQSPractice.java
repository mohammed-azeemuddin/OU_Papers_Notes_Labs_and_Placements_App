package com.azeem.ou_app2.MainScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.azeem.ou_app2.R;
import com.azeem.ou_app2.RCV2.RecyclerMainActivity;
import com.azeem.ou_app2.RCV2.SingleItemDetails;
import com.azeem.ou_app2.RCV3.MainActivity;
import com.azeem.ou_app2.RCV3.UserModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MCQSPractice extends AppCompatActivity {

    ListView listView;
    private ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;
    ArrayList<UserModel> mcq_list , mcq_videos_list;
    private ProgressBar progressBar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_c_q_s_practice);

        progressBar4 = findViewById(R.id.progressbar4);
        listView = findViewById(R.id.listview3);
        arrayList = new ArrayList<>();
        mcq_list = new ArrayList<>();
        mcq_videos_list = new ArrayList<>();

        String MCQ_URL = "https://firebasestorage.googleapis.com/v0/b/ou-all-in-one-83b53.appspot.com/o/ccppjavamcqs.json?alt=media&token=41ebe254-7707-4e8f-b5f6-d334efd71e11";
        String MCQ_VIDEOS_URL= "https://firebasestorage.googleapis.com/v0/b/ou-all-in-one-83b53.appspot.com/o/ccppjavamcqs.json?alt=media&token=41ebe254-7707-4e8f-b5f6-d334efd71e11";

        populate_mcqs_list(MCQ_URL);
        populate_mcqs_videos_list(MCQ_VIDEOS_URL);


        final Parcelable parcelable = Parcels.wrap(mcq_list);
        final Parcelable parcelable2 = Parcels.wrap(mcq_videos_list);

        arrayList.add("Technical MCQ Tests");
        arrayList.add("Technical MCQ Tutorial Videos");

        arrayAdapter = new ArrayAdapter(
                this,
                R.layout.row,
                R.id.tv1,
                arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    Intent intent = new Intent(MCQSPractice.this, MainActivity.class);
                    intent.putExtra("listToDisplay", parcelable);
                    intent.putExtra("isVideo",100);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent(MCQSPractice.this, MainActivity.class);
                    intent.putExtra("listToDisplay", parcelable2);
                    intent.putExtra("isVideo",1);
                    startActivity(intent);
                }
            }
        });



    }

    private void populate_mcqs_videos_list(String JSON_URL) {
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, JSON_URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject movieObject = response.getJSONObject(i);
                        UserModel userModel = new UserModel();
                        userModel.setName(movieObject.getString("title"));
                        userModel.setUrl(movieObject.getString("urlForDownload"));
                        mcq_videos_list.add(userModel);
                        progressBar4.setVisibility(View.VISIBLE);

                        if (i == response.length() - 1)
                            Collections.sort(mcq_videos_list, new Comparator<UserModel>() {
                                @Override
                                public int compare(UserModel userModel1, UserModel userModel2) {
                                    return userModel1.getName().compareTo(userModel2.getName());
                                }
                            });

                    } catch (JSONException e) {
                        e.printStackTrace();
                    } finally {
                        progressBar4.setVisibility(View.INVISIBLE);
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

    private void populate_mcqs_list(String JSON_URL) {
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, JSON_URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject movieObject = response.getJSONObject(i);
                        UserModel userModel = new UserModel();
                        userModel.setName(movieObject.getString("title"));
                        userModel.setUrl(movieObject.getString("urlForDownload"));
                        mcq_list.add(userModel);
                        progressBar4.setVisibility(View.VISIBLE);

                        if (i == response.length() - 1)
                            Collections.sort(mcq_list, new Comparator<UserModel>() {
                                @Override
                                public int compare(UserModel userModel1, UserModel userModel2) {
                                    return userModel1.getName().compareTo(userModel2.getName());
                                }
                            });

                    } catch (JSONException e) {
                        e.printStackTrace();
                    } finally {
                        progressBar4.setVisibility(View.INVISIBLE);
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
}

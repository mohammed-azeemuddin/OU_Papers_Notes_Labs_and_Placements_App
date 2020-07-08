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

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.azeem.ou_app2.R;
import com.azeem.ou_app2.RCV2.RecyclerMainActivity;
import com.azeem.ou_app2.RCV2.SingleItemDetails;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.Collections;

public class VideoTutorials extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;
    ArrayList<SingleItemDetails> my_phy_videos_list;
    ArrayList<SingleItemDetails> my_chem_videos_list;
    private ProgressBar progressBar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_tutorials);

        progressBar2 = findViewById(R.id.progressbar2);

        String PHY_URL = "http://www.json-generator.com/api/json/get/cgsptuiVBu?indent=2";
        String CHEM_URL = "http://www.json-generator.com/api/json/get/cgskMxIONu?indent=2";

        my_phy_videos_list = new ArrayList<>();
        my_chem_videos_list = new ArrayList<>();

        populate_phy_videos_list(PHY_URL);
        populate_chem_videos_list(CHEM_URL);

        Collections.sort(my_phy_videos_list);
        Collections.sort(my_chem_videos_list);

        final Parcelable parcelable = Parcels.wrap(my_phy_videos_list);
        final Parcelable parcelable2 = Parcels.wrap(my_chem_videos_list);


        listView = findViewById(R.id.listview);
        arrayList = new ArrayList<>();

        arrayList.add("Physics Lab");
        arrayList.add("Chemistry Lab");

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0) {
                        Intent intent = new Intent(VideoTutorials.this, RecyclerMainActivity.class);
                        intent.putExtra("videoToDisplay", parcelable);
                        intent.putExtra("isVideo",1);
                        startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent2 = new Intent(VideoTutorials.this, RecyclerMainActivity.class);
                    intent2.putExtra("videoToDisplay", parcelable2);
                    intent2.putExtra("isVideo",1);
                    startActivity(intent2);
                }
            }
        });


    }

    public void populate_phy_videos_list(String JSON_URL) {
            RequestQueue queue = Volley.newRequestQueue(this);
            JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, JSON_URL, null, new Response.Listener<JSONArray>() {
                @Override
                public void onResponse(JSONArray response) {
                    for (int i = 0; i < response.length(); i++) {
                        try {
                            JSONObject movieObject = response.getJSONObject(i);
                            SingleItemDetails mov = new SingleItemDetails();
                            mov.setTitle(movieObject.getString("title"));
                            mov.setUrlForDownload(movieObject.getString("urlForDownload"));
                            my_phy_videos_list.add(mov);
                            progressBar2.setVisibility(View.VISIBLE);

                            if (i == response.length() - 1)
                                Collections.sort(my_phy_videos_list);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        } finally {
                            progressBar2.setVisibility(View.INVISIBLE);
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

    public void populate_chem_videos_list(String JSON_URL) {
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, JSON_URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject movieObject = response.getJSONObject(i);
                        SingleItemDetails mov = new SingleItemDetails();
                        mov.setTitle(movieObject.getString("title"));
                        mov.setUrlForDownload(movieObject.getString("urlForDownload"));
                        my_chem_videos_list.add(mov);
                        progressBar2.setVisibility(View.VISIBLE);

                        if (i == response.length() - 1)
                            Collections.sort(my_chem_videos_list);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    } finally {
                        progressBar2.setVisibility(View.INVISIBLE);
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



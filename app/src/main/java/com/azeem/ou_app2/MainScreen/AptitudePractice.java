package com.azeem.ou_app2.MainScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

public class AptitudePractice extends AppCompatActivity {

    ListView listView;
    private ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;
    ArrayList<UserModel> aptitude_practice_list , aptitude_eng_videos_list , aptitude_hindi_videos_list ;
    private ProgressBar progressBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude_practice);

        progressBar3 = findViewById(R.id.progressbar3);
        listView = findViewById(R.id.listview2);
        arrayList = new ArrayList<>();
        aptitude_practice_list = new ArrayList<>();
        aptitude_eng_videos_list = new ArrayList<>();
        aptitude_hindi_videos_list = new ArrayList<>();

        String APTI_URL = "http://www.json-generator.com/api/json/get/bPvsNchRIO?indent=2";
        String APTI_VIDEO_ENG_URL = "https://firebasestorage.googleapis.com/v0/b/ou-all-in-one-83b53.appspot.com/o/apti_english.json?alt=media&token=6329b6c9-d78a-419b-a699-217d39ce7dd7";
        String APTI_VIDEO_HINDI_URL = "https://firebasestorage.googleapis.com/v0/b/ou-all-in-one-83b53.appspot.com/o/apti_english.json?alt=media&token=6329b6c9-d78a-419b-a699-217d39ce7dd7";

        populate_apti_list(APTI_URL);
        populate_apti_video_eng_list(APTI_VIDEO_ENG_URL);
        populate_apti_video_hindi_list(APTI_VIDEO_HINDI_URL);


        final Parcelable parcelable = Parcels.wrap(aptitude_practice_list);
        final Parcelable parcelable2 = Parcels.wrap(aptitude_eng_videos_list);
        final Parcelable parcelable3 = Parcels.wrap(aptitude_hindi_videos_list);

        arrayList.add("Tips for aptitude preparation (VERY IMPORTANT)(Must watch)");
        arrayList.add("Tests");
        arrayList.add("Tutorial Videos in English");
        arrayList.add("Tutorial Videos in Hindi");

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
                    Intent intent2=new Intent();
                    intent2.setAction(Intent.ACTION_VIEW);
                    intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent2.setData(Uri.parse("https://www.youtube.com/watch?v=W0Snv8SdlLw"));
                    startActivity(intent2);
                }
                if(position==1) {
                    Intent intent = new Intent(AptitudePractice.this, MainActivity.class);
                    intent.putExtra("listToDisplay", parcelable);
                    intent.putExtra("isVideo",100);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent(AptitudePractice.this, MainActivity.class);
                    intent.putExtra("listToDisplay", parcelable2);
                    intent.putExtra("isVideo",1);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent(AptitudePractice.this, MainActivity.class);
                    intent.putExtra("listToDisplay", parcelable3);
                    intent.putExtra("isVideo",1);
                    startActivity(intent);
                }
            }
        });



    }

    private void populate_apti_video_hindi_list(String JSON_URL) {RequestQueue queue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, JSON_URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject movieObject = response.getJSONObject(i);
                        UserModel userModel = new UserModel();
                        userModel.setName(movieObject.getString("title"));
                        userModel.setUrl(movieObject.getString("urlForDownload"));

                        aptitude_hindi_videos_list.add(userModel);
                        progressBar3.setVisibility(View.VISIBLE);

                        if (i == response.length() - 1)
                            Collections.sort(aptitude_hindi_videos_list, new Comparator<UserModel>() {
                                @Override
                                public int compare(UserModel userModel1, UserModel userModel2) {
                                    return userModel1.getName().compareTo(userModel2.getName());
                                }
                            });

                    } catch (JSONException e) {
                        e.printStackTrace();
                    } finally {
                        progressBar3.setVisibility(View.INVISIBLE);
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

    private void populate_apti_video_eng_list(String JSON_URL) {
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

                        aptitude_eng_videos_list.add(userModel);
                        progressBar3.setVisibility(View.VISIBLE);

                        if (i == response.length() - 1)
                            Collections.sort(aptitude_eng_videos_list, new Comparator<UserModel>() {
                                @Override
                                public int compare(UserModel userModel1, UserModel userModel2) {
                                    return userModel1.getName().compareTo(userModel2.getName());
                                }
                            });

                    } catch (JSONException e) {
                        e.printStackTrace();
                    } finally {
                        progressBar3.setVisibility(View.INVISIBLE);
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



    private void populate_apti_list(String JSON_URL) {
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
                        aptitude_practice_list.add(userModel);
                        progressBar3.setVisibility(View.VISIBLE);

                        if (i == response.length() - 1)
                            Collections.sort(aptitude_practice_list, new Comparator<UserModel>() {
                                @Override
                                public int compare(UserModel userModel1, UserModel userModel2) {
                                    return userModel1.getName().compareTo(userModel2.getName());
                                }
                            });

                    } catch (JSONException e) {
                        e.printStackTrace();
                    } finally {
                        progressBar3.setVisibility(View.INVISIBLE);
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

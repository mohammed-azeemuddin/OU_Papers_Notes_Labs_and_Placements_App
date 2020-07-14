package com.azeem.ou_app2.MainScreen;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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

// public class NotesAndReferences extends AppCompatActivity implements RewardedVideoAdListener {

public class NotesAndReferences extends AppCompatActivity{

    LinearLayout notesBtn, prepBtn;
    private ArrayList<SingleItemDetails> my_notes_list;
    ProgressBar progressBar;
    // private RewardedVideoAd mRewardedVideoad;
    Parcelable parcelable;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes_and_references_dashboard);

        /*
        mRewardedVideoad = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoad.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
         */

        progressBar = findViewById(R.id.progressbar);
        notesBtn = findViewById(R.id.notesBtn);
        prepBtn = findViewById(R.id.prepBtn);
        my_notes_list = new ArrayList<>();

        if (!isOnline())
            Toast.makeText(this, "No Internet connection!", Toast.LENGTH_LONG).show();

        populate_notes_list();

        Collections.sort(my_notes_list);
        parcelable = Parcels.wrap(my_notes_list);


        notesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                if(mRewardedVideoad.isLoaded()){
                    mRewardedVideoad.show();
                }
                 */

                Intent intent = new Intent(NotesAndReferences.this, RecyclerMainActivity.class);
                intent.putExtra("listToDisplay", parcelable);
                startActivity(intent);

            }
        });

        prepBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotesAndReferences.this, myTempActivity2.class);
                startActivity(intent);
            }
        });

    }

    public void populate_notes_list() {

        //String JSON_URL = "http://www.json-generator.com/api/json/get/cpAjEilrnm?indent=2";

        String JSON_URL = "http://www.json-generator.com/api/json/get/ceQynCuimq?indent=2";
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
                        my_notes_list.add(mov);
                        progressBar.setVisibility(View.VISIBLE);

                        if (i == response.length() - 1)
                            Collections.sort(my_notes_list);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    } finally {
                        progressBar.setVisibility(View.INVISIBLE);
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

    public boolean isOnline() {

        ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        if (netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()) {
            return false;
        }
        return true;

    }

    /*
    private void loadRewardedVideoAd(){
        mRewardedVideoad.loadAd("ca-app-pub-9640740685338831/5365212098",
                new AdRequest.Builder().build());
    }

    @Override
    public void onRewardedVideoAdLoaded() {
        // rewarded video avavilable
    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

        Toast.makeText(this,"You couldn't unlock the Notes Section",
                Toast.LENGTH_LONG)
                .show();
        loadRewardedVideoAd();

    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {
        Intent intent = new Intent(NotesAndReferences.this, RecyclerMainActivity.class);
        intent.putExtra("listToDisplay", parcelable);
        intent.putExtra("isAdShown",1);
        startActivity(intent);
        loadRewardedVideoAd();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

     */

}


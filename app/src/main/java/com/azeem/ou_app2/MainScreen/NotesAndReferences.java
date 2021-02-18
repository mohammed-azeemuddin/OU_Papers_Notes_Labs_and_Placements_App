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

import androidx.annotation.NonNull;
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
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.Collections;

//public class NotesAndReferences extends AppCompatActivity implements RewardedVideoAdListener {

public class NotesAndReferences extends AppCompatActivity{

    private String GameId = "4017549";
    private boolean testMode = true;
    private String interstitialAdPlacement = "Interstitial_Android";

    LinearLayout notesBtn, prepBtn;
    private ArrayList<SingleItemDetails> my_notes_list;

    ProgressBar progressBar;
    // private RewardedVideoAd mRewardedVideoad;
    // private RewardedAd rewardedAd;
    Parcelable parcelable;

//    boolean hasClosed =false;
//    boolean adShown = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes_and_references_dashboard);

        /*
        mRewardedVideoad = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoad.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
         */

//        MobileAds.initialize(this, new OnInitializationCompleteListener()
//        {
//            @Override
//            public void onInitializationComplete(InitializationStatus initializationStatus)
//            {
//
//            }
//        });
//        onRequestAd();

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

//                onShowRewardAd();
//                Intent intent = new Intent(NotesAndReferences.this, RecyclerMainActivity.class);
//                intent.putExtra("listToDisplay", parcelable);
//                startActivity(intent);
//                return;

                /*
                if(mRewardedVideoad.isLoaded()) {
                    mRewardedVideoad.show();
                    adShown=true;
                }
                else {
                    showToast("Ad is loading please wait..");
                }

                if(adShown && !hasClosed){
                Intent intent = new Intent(NotesAndReferences.this, RecyclerMainActivity.class);
                intent.putExtra("listToDisplay", parcelable);
                startActivity(intent);
                }
                 */

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

//    private void onShowRewardAd() {
//        if(!rewardedAd.isLoaded()) return;
//        //can check show dialog...
//        //rewardedAd.getRewardItem().getAmount()
//        RewardedAdCallback adCallback =new RewardedAdCallback()
//        {
//
//            @Override
//            public void onRewardedAdOpened()
//            {
//                super.onRewardedAdOpened();
//            }
//
//            @Override
//            public void onRewardedAdClosed()
//            {
//                super.onRewardedAdClosed();
//                onRequestAd();
//            }
//
//            @Override
//            public void onUserEarnedReward(@NonNull com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
//
//            }
//
//            @Override
//            public void onRewardedAdFailedToShow(AdError adError)
//            {
//                super.onRewardedAdFailedToShow(adError);
//            }
//        };
//        rewardedAd.show(NotesAndReferences.this, adCallback);
//    }
//
//    private void onRequestAd() {
//        rewardedAd = new RewardedAd(this,"ca-app-pub-3940256099942544/5224354917");
//        RewardedAdLoadCallback adLoadCallback =new RewardedAdLoadCallback(){
//            @Override
//            public void onRewardedAdLoaded()
//            {
//                super.onRewardedAdLoaded();
//                Toast.makeText(NotesAndReferences.this, "onRewardedAdLoaded", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onRewardedAdFailedToLoad(LoadAdError loadAdError)
//            {
//                super.onRewardedAdFailedToLoad(loadAdError);
//                //onRequestAd();
//            }
//        };
//        rewardedAd.loadAd(new AdRequest.Builder().build(), adLoadCallback);
//    }

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
        // test ad - ca-app-pub-3940256099942544/5224354917
        // real ad - ca-app-pub-3530664673183420/9675366811
        mRewardedVideoad.loadAd("ca-app-pub-3940256099942544/5224354917",
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

        hasClosed=true;
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

     */

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


}


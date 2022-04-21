package com.azeem.ou_app2.MainScreen;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.azeem.ou_app2.R;
import com.azeem.ou_app2.RCV2.RecyclerMainActivity;
import com.azeem.ou_app2.RCV2.SingleItemDetails;

import org.parceler.Parcels;

import java.util.ArrayList;

//public class NotesAndReferences extends AppCompatActivity implements RewardedVideoAdListener {

public class NotesAndReferences extends AppCompatActivity{

//    private String GameId = "4017549";
//    private boolean testMode = true;
//    private String interstitialAdPlacement = "Interstitial_Android";

    LinearLayout engg_btn,pharm_btn,bba_btn,law_btn,other_btn;

    ProgressBar progressBar;
    // private RewardedVideoAd mRewardedVideoad;
    // private RewardedAd rewardedAd;
    Parcelable parcelable;

//    boolean hasClosed =false;
//    boolean adShown = false;

    String enggCollection,pharmCollection,bbaCollection,lawCollection,otherCollection;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes_and_references_dashboard);

        engg_btn = findViewById(R.id.engg_btn);
        pharm_btn = findViewById(R.id.pharm_btn);
        bba_btn = findViewById(R.id.bba_btn);
        law_btn = findViewById(R.id.law_btn);
        other_btn = findViewById(R.id.other_btn);

        enggCollection = "engineering_notes";
        pharmCollection = "pharmacy_notes";
        bbaCollection = "bba_notes";
        lawCollection = "law_notes";
        otherCollection = "other_notes";


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

        if (!isOnline())
            Toast.makeText(this, "No Internet connection!", Toast.LENGTH_LONG).show();


        engg_btn.setOnClickListener(new View.OnClickListener() {
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

                parcelable = Parcels.wrap(enggCollection);
                Intent intent = new Intent(NotesAndReferences.this,TestFirebase.class);
                intent.putExtra("collectionName", parcelable);
                startActivity(intent);

            }
        });

        pharm_btn.setOnClickListener(new View.OnClickListener() {
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

                parcelable = Parcels.wrap(pharmCollection);
                Intent intent = new Intent(NotesAndReferences.this,TestFirebase.class);
                intent.putExtra("collectionName", parcelable);
                startActivity(intent);

            }
        });

        bba_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                parcelable = Parcels.wrap(bbaCollection);
                Intent intent = new Intent(NotesAndReferences.this,TestFirebase.class);
                intent.putExtra("collectionName", parcelable);
                startActivity(intent);

            }
        });

        law_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                parcelable = Parcels.wrap(lawCollection);
                Intent intent = new Intent(NotesAndReferences.this,TestFirebase.class);
                intent.putExtra("collectionName", parcelable);
                startActivity(intent);

            }
        });

        other_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                parcelable = Parcels.wrap(otherCollection);
                Intent intent = new Intent(NotesAndReferences.this, TestFirebase.class);
                intent.putExtra("collectionName", parcelable);
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


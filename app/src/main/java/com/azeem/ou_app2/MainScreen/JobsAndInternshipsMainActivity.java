package com.azeem.ou_app2.MainScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.azeem.ou_app2.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class JobsAndInternshipsMainActivity extends AppCompatActivity implements RewardedVideoAdListener {

    String info;
    TextView infoTextView2;
    Button clickHereBtn2;
    private RewardedVideoAd mRewardedVideoad;
    boolean isAdShown;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_and_internships_main);
        isAdShown=false;

        mRewardedVideoad = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoad.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();

        if(!isOnline())
            Toast.makeText(this, "No Internet connection!", Toast.LENGTH_LONG).show();

        info = getIntent().getStringExtra("info");
        infoTextView2 = findViewById(R.id.infoTextView2);
        clickHereBtn2 = findViewById(R.id.click_here_btn2);

        if(info!=null)
            infoTextView2.setText(info);

        clickHereBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mRewardedVideoad.isLoaded()) {
                    mRewardedVideoad.show();
                }
            }
        });

    }

    private void loadRewardedVideoAd() {
        mRewardedVideoad.loadAd("ca-app-pub-3940256099942544/5224354917",
                new AdRequest.Builder().build());
    }

    private boolean isOnline() {
        ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        if(netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()){
            return false;
        }
        return true;
    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {
            loadRewardedVideoAd();
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {
        Intent intent2=new Intent();
        intent2.setAction(Intent.ACTION_VIEW);
        intent2.addCategory(Intent.CATEGORY_BROWSABLE);
        intent2.setData(Uri.parse("https://ouallinone.netlify.app/placements.html"));
        startActivity(intent2);
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }
}

package com.azeem.ou_app2.MainScreen;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.azeem.ou_app2.R;

import java.util.Random;

public class LabsAndViva extends AppCompatActivity {

    LinearLayout labsBtn;
    LinearLayout videoTutsBtn;
    ProgressBar progressBar2;
    // private InterstitialAd interstitial;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.labs_and_viva_first_dashboard);


        labsBtn = findViewById(R.id.labsBtn);
        videoTutsBtn = findViewById(R.id.videoTutsBtn);
        progressBar2 = findViewById(R.id.progressbar2);

        /*
        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId("ca-app-pub-9640740685338831/8727980871");
        loadinterstitial();

        // Listener for Ad
        interstitial.setAdListener(new AdListener()
        {
            // When Closed Ad, Load new Ad
            @Override
            public void onAdClosed()
            {
                super.onAdClosed();
                loadinterstitial();
            }
        });

         */

        if (!isOnline())
            Toast.makeText(this, "No Internet connection!", Toast.LENGTH_LONG).show();


        labsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/open?id=1TzCGhJ2izzDyTrSwWVs4-wt9rcP0JoyF"));
                startActivity(intent);
            }
        });

        videoTutsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LabsAndViva.this, VideoTutorials.class);
                startActivity(intent);

            }
        });

    }

    /*

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        // Make rand
        Random rnd = new Random();

        int randomNumber = rnd.nextInt(2);
        if (randomNumber == 1) {
            // Go to Show Interstitial Ad
            showInterstitialAd();
        }
    }

    // Show Interstitial Ad
    private void showInterstitialAd()
    {
        if (!interstitial.isLoaded()) {
            return;
        }
        interstitial.show();
    }

    private void loadinterstitial()
    {
        AdRequest adRequest = new AdRequest.Builder().build();
        interstitial.loadAd(adRequest);
    }

     */

    public boolean isOnline() {

        ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        if (netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()) {
            return false;
        }
        return true;

    }
}

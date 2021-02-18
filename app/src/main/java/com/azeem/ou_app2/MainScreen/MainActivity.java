package com.azeem.ou_app2.MainScreen;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.azeem.ou_app2.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.IUnityBannerListener;
import com.unity3d.services.banners.UnityBanners;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private AdView mAdView;

    private String GameId = "4017549";
    private boolean testMode = true;
    private String bannerAdPlacement = "Banner_Android";

    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!isOnline())
            Toast.makeText(this, "No Internet connection!", Toast.LENGTH_LONG).show();

        UnityAds.initialize(MainActivity.this,GameId,testMode);
        IUnityAdsListener unityAdsListener = new IUnityAdsListener() {
            @Override
            public void onUnityAdsReady(String s) {
                Toast.makeText(MainActivity.this,"Inter ready",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onUnityAdsStart(String s) {
                Toast.makeText(MainActivity.this,"Inter start",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {
                Toast.makeText(MainActivity.this,"Inter finish",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String s) {
                Toast.makeText(MainActivity.this,unityAdsError.toString(),Toast.LENGTH_SHORT).show();
            }
        };

        UnityAds.setListener(unityAdsListener);
        IUnityBannerListener iUnityBannerListener = new IUnityBannerListener() {

            @Override
            public void onUnityBannerLoaded(String s, View view) {
                ((ViewGroup)findViewById(R.id.bannerAdLayout)).removeView(view);
                ((ViewGroup)findViewById(R.id.bannerAdLayout)).addView(view);
            }

            @Override
            public void onUnityBannerUnloaded(String s) {

            }

            @Override
            public void onUnityBannerShow(String s) {

            }

            @Override
            public void onUnityBannerClick(String s) {

            }

            @Override
            public void onUnityBannerHide(String s) {

            }

            @Override
            public void onUnityBannerError(String s) {

            }
        };
        
        UnityBanners.setBannerListener(iUnityBannerListener);

        if (UnityAds.isInitialized()){
        UnityBanners.loadBanner(MainActivity.this,this.bannerAdPlacement);
        }else{
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    UnityBanners.loadBanner(MainActivity.this,bannerAdPlacement);
                }
            },5000);
        }

        // for initializing ad and requesting ad

//        MobileAds.initialize(this, new OnInitializationCompleteListener() {
//            @Override
//            public void onInitializationComplete(InitializationStatus initializationStatus) {
//            }
//        });
//
//
//        mAdView = findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);



        /*

        This section  is just for testing , don't uncomment while deployment

        MobileAds.setRequestConfiguration(
                new RequestConfiguration.Builder().
                        build()
        );

        List<String> testDeviceIds = Arrays.asList("358187074695712");
        RequestConfiguration configuration =
                new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
        MobileAds.setRequestConfiguration(configuration);
         */


        // list for models
        models = new ArrayList<>();

        models.add(new Model(R.drawable.books, "Notes and References", "Printed and handwritten notes of various subjects all at one place."));
        models.add(new Model(R.drawable.prev_papers, "Previous Question Papers", "Refer previous year's question papers of different subjects from the oldest to the latest."));
        models.add(new Model(R.drawable.lab_pic, "Labs and Viva", "Lab Manuals and respective Viva-voce for Lab internals and externals."));
        models.add(new Model(R.drawable.interview2, "Placements and Interviews", "Helpful material,quizzes and company-specific interview questions for placements."));
        models.add(new Model(R.drawable.developer, "Contact Developer", ""));
        models.add(new Model(R.drawable.privacy_policy, "Privacy Policy", ""));

        adapter = new Adapter(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0, 130, 0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color5),
                getResources().getColor(R.color.color6)
        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position < (adapter.getCount() - 1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                } else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private boolean isOnline() {
        ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        if(netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()){
            return false;
        }
        return true;
    }

}

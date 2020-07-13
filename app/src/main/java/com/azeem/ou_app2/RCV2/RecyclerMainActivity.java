package com.azeem.ou_app2.RCV2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.azeem.ou_app2.MainScreen.NotesAndReferences;
import com.azeem.ou_app2.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

public class RecyclerMainActivity extends AppCompatActivity implements RecyclerAdapter.OnNoteListener {


    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    List<SingleItemDetails> moviesList;
    List<String> moviesTitleList;

    // private InterstitialAd interstitial;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("Search...");
        setContentView(R.layout.recycler_main_activity);
        Spannable text = new SpannableString(getSupportActionBar().getTitle());
        text.setSpan(new ForegroundColorSpan(Color.WHITE), 0, text.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        getSupportActionBar().setTitle(text);



        // for initializing ad and requesting ad
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });



        mAdView = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

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


        // retrieve last position on start

        moviesList=new ArrayList<SingleItemDetails>();
        int status = getIntent().getIntExtra("isOnlyFirstYearClicked",0);

        if(status==1)
        {
            Parcelable parcelable = getIntent().getParcelableExtra("firstYearList");
            moviesList= Parcels.unwrap(parcelable);
        }
        else
        {
            Parcelable parcelable = getIntent().getParcelableExtra("listToDisplay");
            if(parcelable==null)
                parcelable = getIntent().getParcelableExtra("videoToDisplay");
            moviesList = Parcels.unwrap(parcelable);
        }

        moviesTitleList=new ArrayList<>();

        for(SingleItemDetails movie:moviesList)
            moviesTitleList.add(movie.getTitle());

        recyclerView = findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter(moviesTitleList,this);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                recyclerAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void OnNoteClick(int pos) {
        moviesList.get(pos);
        String downloadURL=moviesList.get(pos).getUrlForDownload();
        int x= getIntent().getIntExtra("isVideo",0);
        if(x==1) {
            Intent myintent = new Intent(this, VideoPopUpWindow.class);
            myintent.putExtra("url2", downloadURL);
            startActivity(myintent);
        }
        if(x==100)
        {
            Intent myintent = new Intent(this, PracticePopUpWindow.class);
            myintent.putExtra("url2", downloadURL);
            startActivity(myintent);
        }
        if(x==0)
        {
            Intent myintent = new Intent(this, PopUpWindow.class);
            myintent.putExtra("url2", downloadURL);
            startActivity(myintent);
        }
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();

        int val = getIntent().getIntExtra("isAdShown", 0);

        if (val == 1) {
            Intent intent = new Intent(this, NotesAndReferences.class);
            startActivity(intent);
        }
    }


    /*

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


}

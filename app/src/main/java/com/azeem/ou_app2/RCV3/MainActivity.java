package com.azeem.ou_app2.RCV3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.azeem.ou_app2.R;
import com.azeem.ou_app2.RCV2.PopUpWindow;
import com.azeem.ou_app2.RCV2.PracticePopUpWindow;
import com.azeem.ou_app2.RCV2.VideoPopUpWindow;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements UserAdapter.UserClickListener{

    RecyclerView rvUsers;
    UserAdapter userAdapter;
    List<UserModel> userModelList;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        setTitle("Search...");
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

        rvUsers = findViewById(R.id.rvUsers);
        setData();
        prepareRecyclerView();

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rvUsers.addItemDecoration(dividerItemDecoration);
    }

    public void setData(){
//        userModelList.add(new UserModel("Jospehine","Martha"));
//        userModelList.add(new UserModel("Richard","Larn"));
//        userModelList.add(new UserModel("Maiko","William"));
//        userModelList.add(new UserModel("Dennis","Martin"));
        Parcelable parcelable = getIntent().getParcelableExtra("listToDisplay");
        if(parcelable==null)
            parcelable = getIntent().getParcelableExtra("videoToDisplay");
        userModelList = Parcels.unwrap(parcelable);
    }

    public void prepareRecyclerView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvUsers.setLayoutManager(linearLayoutManager);
        preAdapter();
    }

    public void preAdapter(){
        userAdapter = new UserAdapter(userModelList,this,this::selectedUser);
        rvUsers.setAdapter(userAdapter);
    }

    @Override
    public void selectedUser(UserModel userModel) {
//        Toast.makeText(this,"Selected user"+userModel.getFirstName(),Toast.LENGTH_SHORT).show();
//        startActivity(new Intent(this,SelectedUserActivity.class).putExtra("data",userModel));
        String downloadURL = userModel.getUrl();
        int x= getIntent().getIntExtra("isVideo",0);
        Intent myintent;
        if(x==1) {
            myintent = new Intent(this, VideoPopUpWindow.class);
            myintent.putExtra("url2", downloadURL);
            startActivity(myintent);
        }
        else if(x==100)
        {
            myintent = new Intent(this, PracticePopUpWindow.class);
            myintent.putExtra("url2", downloadURL);
            startActivity(myintent);
        }
        else if(x==0)
        {
            myintent = new Intent(this, PopUpWindow.class);
            myintent.putExtra("url2", downloadURL);
            startActivity(myintent);
        }
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.searchView){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {

        getMenuInflater().inflate(R.menu.search,menu);
        MenuItem menuItem = menu.findItem(R.id.searchView);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                String searchStr = newText;
                userAdapter.getFilter().filter(newText);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
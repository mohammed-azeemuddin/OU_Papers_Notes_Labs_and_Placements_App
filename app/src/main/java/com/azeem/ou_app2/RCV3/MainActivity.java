package com.azeem.ou_app2.RCV3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.azeem.ou_app2.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements UserAdapter.UserClickListener{

    RecyclerView rvUsers;
    UserAdapter userAdapter;
    List<UserModel> userModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        rvUsers = findViewById(R.id.rvUsers);
        setData();
        prepareRecyclerView();
    }

    public void setData(){
        userModelList.add(new UserModel("Jospehine","Martha","209348213"));
        userModelList.add(new UserModel("Richard","Larn","2021333"));
        userModelList.add(new UserModel("Maiko","William","4321551"));
        userModelList.add(new UserModel("Dennis","Martin","3213212"));
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
        startActivity(new Intent(this,SelectedUserActivity.class).putExtra("data",userModel));
    }
}
package com.azeem.ou_app2.RCV3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.azeem.ou_app2.R;

public class SelectedUserActivity extends AppCompatActivity {

    TextView tvSelectedUserName;
    UserModel userModel;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_user);

        intent = getIntent();

        if(intent!=null){
            userModel = (UserModel) intent.getSerializableExtra("data");
            String userName = userModel.getFirstName()+" "+userModel.getLastName();
            tvSelectedUserName.setText(userName);
        }
        tvSelectedUserName = findViewById(R.id.tvSelectedUserName);
    }
}
package com.azeem.ou_app2.NotificationTest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.azeem.ou_app2.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    private FirebaseAuth mAuth ;
    public static final String NODE_USERS ="users";
    private List<User> userList;

    private RecyclerView recyclerView;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        progressBar = findViewById(R.id.progressbar);

        mAuth = FirebaseAuth.getInstance();

        loadUsers();

        FirebaseMessaging.getInstance().subscribeToTopic("updates");

        FirebaseInstanceId.getInstance().getInstanceId()
                .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
                    @Override
                    public void onComplete(@NonNull Task<InstanceIdResult> task) {
                        if(task.isSuccessful()){

                            String token = task.getResult().getToken();
                            saveToken(token);

                        }else{



                        }
                    }
                });
    }

    private void loadUsers() {

        progressBar.setVisibility(View.VISIBLE);
        userList=new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DatabaseReference dbUsers = FirebaseDatabase.getInstance().getReference("users");
        dbUsers.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                progressBar.setVisibility(View.GONE);
                if(dataSnapshot.exists()){

                    for(DataSnapshot dsUser:dataSnapshot.getChildren()){

                        User user = dsUser.getValue(User.class);
                        userList.add(user);

                    }

                    UserAdapter adapter = new UserAdapter(ProfileActivity.this,userList);
                    recyclerView.setAdapter(adapter);
                }
                else
                {
                    Toast.makeText(ProfileActivity.this,"No user found",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        if(mAuth.getCurrentUser() == null) {
            Intent intent = new Intent(this, MainNotificationActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }

    private void saveToken(String token) {
        String email = mAuth.getCurrentUser().getEmail();
        User user = new User(email,token);

        DatabaseReference dbUsers = FirebaseDatabase.getInstance().getReference(NODE_USERS);

        dbUsers.child(mAuth.getCurrentUser().getUid())
                .setValue(user)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(ProfileActivity.this,
                                    "Token saved",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                });

    }
}

package com.azeem.ou_app2.MainScreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.azeem.ou_app2.R;
import com.azeem.ou_app2.RCV2.RecyclerMainActivity;
import com.azeem.ou_app2.RCV2.SingleItemDetails;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

public class TestFirebase extends AppCompatActivity {

    FirebaseFirestore db;
    List<DBItem> datalist;
    List<SingleItemDetails> finalList;
    ProgressDialog progressDialog;
    Parcelable parcelable;
    String collectionName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_firebase);

        datalist = new ArrayList<>();
        finalList = new ArrayList<>();
        db = FirebaseFirestore.getInstance();

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Fetching data...");
        progressDialog.show();

        parcelable = getIntent().getParcelableExtra("collectionName");
        collectionName = Parcels.unwrap(parcelable);

        if(collectionName!=null){
            db.collection(collectionName)
                    .orderBy("name")
                    .get()
                    .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                        @Override
                        public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                            List<DocumentSnapshot> list=queryDocumentSnapshots.getDocuments();
                            for(DocumentSnapshot d:list)
                            {
                                DBItem obj=d.toObject(DBItem.class);
                                datalist.add(obj);
                            }
                            for(DBItem item:datalist){
                                finalList.add(new SingleItemDetails(item.name, item.url));
                            }
                            if(progressDialog.isShowing())
                                progressDialog.dismiss();

                            parcelable = Parcels.wrap(finalList);
                            Intent intent = new Intent(TestFirebase.this, RecyclerMainActivity.class);
                            intent.putExtra("listToDisplay", parcelable);
                            startActivity(intent);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(TestFirebase.this,"Cant get data",Toast.LENGTH_SHORT).show();
                        }
            });

        } else {
            if(progressDialog.isShowing())
                progressDialog.dismiss();
        }
    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        Intent intent = new Intent(this,MainActivity.class);
//        startActivity(intent);
//    }
}
package com.azeem.ou_app2.MainScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.azeem.ou_app2.MyScreens.MostAskedQuestionsInfyOne;
import com.azeem.ou_app2.R;

import org.parceler.Parcels;

import java.util.ArrayList;

public class InterviewQuestions extends AppCompatActivity {

    ListView listView;
    private ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;
    Parcelable parcelable;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview_questions);

        listView = findViewById(R.id.listview31);
        arrayList = new ArrayList<>();

        arrayList.add("Tips for interview preparation (VERY IMPORTANT)(Must watch)"); //0

        arrayList.add("Most asked Questions in Infosys -I"); //1
        arrayList.add("Most asked Questions in Infosys -II"); //2
        arrayList.add("Most asked Questions in TCS -I"); //3
        arrayList.add("Most asked Questions in TCS -II"); //4

        // https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html
        arrayList.add("Top 50 Coding Questions (can be implemented in any language) (MUST LEARN)"); //5

        // https://www.softwaretestinghelp.com/database-interview-questions
        arrayList.add("Top 50 DMBS and SQL Interview Questions"); //6


        arrayList.add("Top 50 Most Common Interview Questions (General)");  //7
        arrayList.add("Top 50 C++ Interview Questions"); //8
        arrayList.add("Top 50 OOPS Interview Questions"); //9

        // https://career.guru99.com/top-50-data-structure-interview-questions/
        arrayList.add("Top 50 Data Structure Questions"); //10

        arrayList.add("Top 50 Java Interview Questions"); //11

        // https://www.careerride.com/Operating-System-Interview-Questions.aspx
        arrayList.add("Top 50 OS Interview Questions"); //12

        // https://www.softwaretestinghelp.com/networking-interview-questions-2/
        arrayList.add("Top 50 CN Interview Questions"); //13

        arrayList.add("Top 50 Software Engineering Interview Questions"); //14
        arrayList.add("Top 50 C Programming Interview Questions"); //15
        arrayList.add("Top 50 Python Interview Questions"); //16


        arrayAdapter = new ArrayAdapter(
                this,
                R.layout.row,
                R.id.tv1,
                arrayList);


        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // introduction video
                if(position==0) {
                    Intent intent2=new Intent();
                    intent2.setAction(Intent.ACTION_VIEW);
                    intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent2.setData(Uri.parse("https://www.youtube.com/watch?v=JAMLk_azFpQ"));
                    startActivity(intent2);
                }
                // infy imp-1
                if(position==1) {
                    pos=position;
                    movetoNextActivity();
                }
                // infy imp-2
                if(position==2) {
                    pos=position;
                    movetoNextActivity();
                }
                // tcs imp-1
                if(position==3) {
                    pos=position;
                    movetoNextActivity();
                }
                // tcs imp-2
                if(position==4) {
                    pos=position;
                    movetoNextActivity();
                }
                // top 50 coding ques
                if(position==5) {
                    Intent intent2=new Intent();
                    intent2.setAction(Intent.ACTION_VIEW);
                    intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent2.setData(Uri.parse("https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html"));
                    startActivity(intent2);
                }
                // top 50 dbms and sql questions
                if(position==6) {
                    Intent intent2=new Intent();
                    intent2.setAction(Intent.ACTION_VIEW);
                    intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent2.setData(Uri.parse("https://www.softwaretestinghelp.com/database-interview-questions"));
                    startActivity(intent2);
                }
                // general ques
                if(position==7) {
                    pos=position;
                    movetoNextActivity();
                }
                // c++
                if(position==8) {
                    pos=position;
                    movetoNextActivity();
                }
                // oops
                if(position==9) {
                    pos=position;
                    movetoNextActivity();
                }
                // ds-imp
                if(position==10) {
                    Intent intent2=new Intent();
                    intent2.setAction(Intent.ACTION_VIEW);
                    intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent2.setData(Uri.parse("https://career.guru99.com/top-50-data-structure-interview-questions/"));
                    startActivity(intent2);
                }
                // java ques
                if(position==11) {
                    pos=position;
                    movetoNextActivity();
                }
                // top 50 os questions
                if(position==12) {
                    Intent intent2=new Intent();
                    intent2.setAction(Intent.ACTION_VIEW);
                    intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent2.setData(Uri.parse("https://www.careerride.com/Operating-System-Interview-Questions.aspx"));
                    startActivity(intent2);
                }
                // top 50 cn questions
                if(position==13) {
                    Intent intent2=new Intent();
                    intent2.setAction(Intent.ACTION_VIEW);
                    intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent2.setData(Uri.parse("https://www.softwaretestinghelp.com/networking-interview-questions-2/"));
                    startActivity(intent2);
                }
                // software engg ques
                if(position==14) {
                    pos=position;
                    movetoNextActivity();
                }
                // c prog ques
                if(position==15) {
                    pos=position;
                    movetoNextActivity();
                }
                // python ques
                if(position==16) {
                    pos=position;
                    movetoNextActivity();
                }
            }
        });



    }

    private void movetoNextActivity() {
        parcelable = Parcels.wrap(pos);
        Intent intent = new Intent(InterviewQuestions.this, MostAskedQuestionsInfyOne.class);
        intent.putExtra("recPos", parcelable);
        startActivity(intent);
    }
}

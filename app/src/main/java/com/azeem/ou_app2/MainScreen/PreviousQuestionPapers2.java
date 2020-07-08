package com.azeem.ou_app2.MainScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.azeem.ou_app2.PrevQuesSetAndGetLists.PopulateListsForClasses;
import com.azeem.ou_app2.PrevQuesSetAndGetLists.ReturnListsToClasses;
import com.azeem.ou_app2.R;
import com.azeem.ou_app2.RCV2.RecyclerMainActivity;
import com.azeem.ou_app2.RCV2.SingleItemDetails;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

public class PreviousQuestionPapers2 extends AppCompatActivity {

    TextView firstYear;
    TextView secondYear;
    TextView thirdYear;
    TextView fourthYear;
    PopulateListsForClasses p1;
    ReturnListsToClasses r1;
    Parcelable parcelable;
    List<SingleItemDetails> listToSend;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prev_question_papers_second_dashboard);


        firstYear=findViewById(R.id.FIRST_YEAR);
        secondYear=findViewById(R.id.SECOND_YEAR);
        thirdYear=findViewById(R.id.THIRD_YEAR);
        fourthYear=findViewById(R.id.FOURTH_YEAR);


        p1=new PopulateListsForClasses();
        r1=new ReturnListsToClasses();

        listToSend=new ArrayList<SingleItemDetails>();

        final String branch = getIntent().getStringExtra("branch");

        firstYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (branch)
                {
                    case "it":
                        p1.populate_it_first_year();
                        listToSend = r1.getItFirstYear();
                        moveToNextActivity();
                        break;
                    case "cse":
                        p1.populate_cse_first_year();
                        listToSend = r1.getCseFirstYear();
                        moveToNextActivity();
                        break;
                    case "ece":
                        p1.populate_ece_first_year();
                        listToSend = r1.getEceFirstYear();
                        moveToNextActivity();
                        break;
                    case "mech":
                        p1.populate_mech_first_year();
                        listToSend = r1.getMechFirstYear();
                        moveToNextActivity();
                        break;
                    case "civil":
                        p1.populate_civil_first_year();
                        listToSend = r1.getCivilFirstYear();
                        moveToNextActivity();
                        break;
                    case "prod":
                        p1.populate_prod_first_year();
                        listToSend = r1.getProdFirstYear();
                        moveToNextActivity();
                        break;
                    case "eee":
                        p1.populate_eee_first_year();
                        listToSend = r1.getEeeFirstYear();
                        moveToNextActivity();
                        break;
                    case "eie":
                        p1.populate_eie_first_year();
                        listToSend = r1.getEieFirstYear();
                        moveToNextActivity();
                        break;
                    default:
                        Toast.makeText(PreviousQuestionPapers2.this,"UNDEFINED!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        secondYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (branch)
                {
                    case "it":
                        p1.populate_it_second_year();
                        listToSend = r1.getItSecondYear();
                        moveToNextActivity();
                        break;
                    case "cse":
                        p1.populate_cse_second_year();
                        listToSend = r1.getCseSecondYear();
                        moveToNextActivity();
                        break;
                    case "ece":
                        p1.populate_ece_second_year();
                        listToSend = r1.getEceSecondYear();
                        moveToNextActivity();
                        break;
                    case "mech":
                        p1.populate_mech_second_year();
                        listToSend = r1.getMechSecondYear();
                        moveToNextActivity();
                        break;
                    case "civil":
                        p1.populate_civil_second_year();
                        listToSend = r1.getCivilSecondYear();
                        moveToNextActivity();
                        break;
                    case "prod":
                        p1.populate_prod_second_year();
                        listToSend = r1.getProdSecondYear();
                        moveToNextActivity();
                        break;
                    case "eee":
                        p1.populate_eee_second_year();
                        listToSend = r1.getEeeSecondYear();
                        moveToNextActivity();
                        break;
                    case "eie":
                        p1.populate_eie_second_year();
                        listToSend = r1.getEieSecondYear();
                        moveToNextActivity();
                        break;
                    default:
                        Toast.makeText(PreviousQuestionPapers2.this,"UNDEFINED!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        thirdYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (branch)
                {
                    case "it":
                        p1.populate_it_third_year();
                        listToSend = r1.getItThirdYear();
                        moveToNextActivity();
                        break;
                    case "cse":
                        p1.populate_cse_third_year();
                        listToSend = r1.getCseThirdYear();
                        moveToNextActivity();
                        break;
                    case "ece":
                        p1.populate_ece_third_year();
                        listToSend = r1.getEceThirdYear();
                        moveToNextActivity();
                        break;
                    case "mech":
                        p1.populate_mech_third_year();
                        listToSend = r1.getMechThirdYear();
                        moveToNextActivity();
                        break;
                    case "civil":
                        p1.populate_civil_third_year();
                        listToSend = r1.getCivilThirdYear();
                        moveToNextActivity();
                        break;
                    case "prod":
                        p1.populate_prod_third_year();
                        listToSend = r1.getProdThirdYear();
                        moveToNextActivity();
                        break;
                    case "eee":
                        p1.populate_eee_third_year();
                        listToSend = r1.getEeeThirdYear();
                        moveToNextActivity();
                        break;
                    case "eie":
                        p1.populate_eie_third_year();
                        listToSend = r1.getEieThirdYear();
                        moveToNextActivity();
                        break;
                    default:
                        Toast.makeText(PreviousQuestionPapers2.this,"UNDEFINED!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        fourthYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (branch)
                {
                    case "it":
                        p1.populate_it_fourth_year();
                        listToSend = r1.getItFourthYear();
                        moveToNextActivity();
                        break;
                    case "cse":
                        p1.populate_cse_fourth_year();
                        listToSend = r1.getCseFourthYear();
                        moveToNextActivity();
                        break;
                    case "ece":
                        p1.populate_ece_fourth_year();
                        listToSend = r1.getEceFourthYear();
                        moveToNextActivity();
                        break;
                    case "mech":
                        p1.populate_mech_fourth_year();
                        listToSend = r1.getMechFourthYear();
                        moveToNextActivity();
                        break;
                    case "civil":
                        p1.populate_civil_fourth_year();
                        listToSend = r1.getCivilFourthYear();
                        moveToNextActivity();
                        break;
                    case "prod":
                        p1.populate_prod_fourth_year();
                        listToSend = r1.getProdFourthYear();
                        moveToNextActivity();
                        break;
                    case "eee":
                        p1.populate_eee_fourth_year();
                        listToSend = r1.getEeeFourthYear();
                        moveToNextActivity();
                        break;
                    case "eie":
                        p1.populate_eie_fourth_year();
                        listToSend = r1.getEieFourthYear();
                        moveToNextActivity();
                        break;
                    default:
                        Toast.makeText(PreviousQuestionPapers2.this,"UNDEFINED!",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void moveToNextActivity()
    {
        parcelable = Parcels.wrap(listToSend);
        Intent intent = new Intent(PreviousQuestionPapers2.this, RecyclerMainActivity.class);
        intent.putExtra("listToDisplay", parcelable);
        startActivity(intent);
    }


}

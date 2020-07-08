package com.azeem.ou_app2.MyScreens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.WebView;
import android.widget.Toast;

import com.azeem.ou_app2.R;

import org.parceler.Parcels;
import org.sufficientlysecure.htmltextview.HtmlHttpImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class MostAskedQuestionsInfyOne extends AppCompatActivity {

    int recPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_asked_questions_infy_one);

        Parcelable parcelable = getIntent().getParcelableExtra("recPos");
        recPos = Parcels.unwrap(parcelable);

        WebView view = new WebView(this);
        view.getSettings().setJavaScriptEnabled(true);

        /*
        HtmlTextView textView = findViewById(R.id.html_text2);
        textView.setHtml(htmlCode,new HtmlHttpImageGetter(textView));
         */

        switch (recPos){
            case 1:  view.loadUrl("file:///android_asset/most_asked_questions_infosys_1.html");
                     setContentView(view);
                     break;
            case 2:  view.loadUrl("file:///android_asset/most_asked_questions_infosys_2.html");
                     setContentView(view);
                     break;
            case 3:  view.loadUrl("file:///android_asset/most_asked_questions_tcs_1.html");
                     setContentView(view);
                     break;
            case 4:  view.loadUrl("file:///android_asset/most_asked_questions_tcs_2.html");
                     setContentView(view);
                     break;
            case 7:  view.loadUrl("file:///android_asset/general_interview_ques.html");
                     setContentView(view);
                     break;
            case 8:  view.loadUrl("file:///android_asset/cpp_interview_ques.html");
                     setContentView(view);
                     break;
            case 9:  view.loadUrl("file:///android_asset/oops_interview_ques.html");
                     setContentView(view);
                     break;
            case 11: view.loadUrl("file:///android_asset/java_interview_ques.html");
                     setContentView(view);
                     break;
            case 14: view.loadUrl("file:///android_asset/software_engg_interview_ques.html");
                     setContentView(view);
                     break;
            case 15: view.loadUrl("file:///android_asset/c_prog_interview_ques.html");
                     setContentView(view);
                     break;
            case 16: view.loadUrl("file:///android_asset/python_interview_questions.html");
                     setContentView(view);
                     break;
            default:
                Toast.makeText(MostAskedQuestionsInfyOne.this,"invalid",Toast.LENGTH_SHORT).show();

        }



        /*

        view.loadUrl("file:///android_asset/cpp_interview_ques.html");
        setContentView(view);

         */



    }
}

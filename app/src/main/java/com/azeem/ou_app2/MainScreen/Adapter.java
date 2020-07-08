package com.azeem.ou_app2.MainScreen;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.azeem.ou_app2.R;

import java.util.List;

public class Adapter extends PagerAdapter
{

    private List<Model> models;
    private LayoutInflater layoutInflater;
    private Context context;

    public Adapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }


    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item, container, false);

        ImageView imageView;
        TextView title, desc;

        imageView = view.findViewById(R.id.image);
        title = view.findViewById(R.id.title);
        desc = view.findViewById(R.id.desc);

        imageView.setImageResource(models.get(position).getImage());
        title.setText(models.get(position).getTitle());
        desc.setText(models.get(position).getDesc());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Class c=null;
                switch(position){

                    case 0:
                        c = NotesAndReferences.class;
                        break;
                    case 1:
                        c = PreviousQuestionPapers.class;
                        break;
                    case 2:
                        c = LabsAndViva.class;
                        break;
                    case 3:
                        c = PlacementAndInterviews.class;
                        break;
                    case 4:
                        c= ContactDeveloper.class;
                        break;
                    case 5:
                        c= PrivacyPolicy.class;
                        break;
                }

                Intent intent = new Intent(context,c);
                context.startActivity(intent);
            }
        });

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}

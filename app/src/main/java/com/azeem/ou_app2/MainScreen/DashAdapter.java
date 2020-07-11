package com.azeem.ou_app2.MainScreen;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.azeem.ou_app2.R;
import com.azeem.ou_app2.RCV2.SingleItemDetails;

import java.util.ArrayList;


public class DashAdapter extends RecyclerView.Adapter<DashAdapter.ViewHolder> {

    Context context ;
    ArrayList<DashModel> dashModelArrayList;

    public DashAdapter(ArrayList<DashModel> dashModelArrayList,Context context) {
        this.dashModelArrayList = dashModelArrayList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        String ret_head = dashModelArrayList.get(position).getHead();
        holder.setheader(ret_head);

        String ret_sub = dashModelArrayList.get(position).getSub();
        holder.set_sub(ret_sub);

        int ret_image = dashModelArrayList.get(position).getImage();
        holder.set_image(ret_image);

        holder.cardview.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Class c=null;
                switch(position)
                {
                    case 0: c= AptitudePractice.class;
                            break;

                    case 1: c= MCQSPractice.class;
                            break;

                    case 2: c= InterviewQuestions.class;
                            break;

                    case 3: c= myTempActivity.class;
                            break;

                    case 4: c= CoursesMainActivity.class;
                            break;

                    case 5: c= JobsAndInternshipsMainActivity.class;
                            break;
                }
                Intent intent = new Intent(context,c);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dashModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView header,sub_header;
        ImageView images;
        View myView;

        public ViewHolder(View itemView) {
            super(itemView);
            myView = itemView;
        }

        public void setheader(String h)
        {
            header = myView.findViewById(R.id.header);
            header.setText(h);
        }

        public void set_sub(String s)
        {
            sub_header = myView.findViewById(R.id.sub_header);
            sub_header.setText(s);
        }
        public void set_image(int i)
        {
            images = myView.findViewById(R.id.dash_image);
            images.setImageResource(i);
        }

        CardView cardview = itemView.findViewById(R.id.cardView);
    }

}

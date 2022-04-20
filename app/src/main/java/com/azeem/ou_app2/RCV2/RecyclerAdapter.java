package com.azeem.ou_app2.RCV2;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.azeem.ou_app2.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> implements Filterable {

    private static final String TAG = "RecyclerAdapter";
    private OnNoteListener mOnNoteListener;
    List<String> moviesTitleList;
    List<String> moviesTitleListAll;


    ViewHolder viewHolder;

    public RecyclerAdapter(List<String> moviesTitleList, OnNoteListener onNoteListener) {
        this.moviesTitleList = moviesTitleList;
        moviesTitleListAll = new ArrayList<String>();
        moviesTitleListAll.addAll(moviesTitleList);
        this.mOnNoteListener=onNoteListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            //String x= mOnNoteListener.getClass().getSimpleName();
            View view = layoutInflater.inflate(R.layout.recycler_view_row_item, parent, false);
            viewHolder = new ViewHolder(view, mOnNoteListener);
            return  viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //holder.rowCountTextView.setText(String.valueOf(position));
        holder.textView.setText(moviesTitleList.get(position));
    }

    @Override
    public int getItemCount() {
        return moviesTitleList.size();
    }

    @Override
    public Filter getFilter() {

        return myFilter;
    }

    Filter myFilter = new Filter() {

        //Automatic on background thread
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {

            List<String> filteredList = new ArrayList<>();

            if (charSequence == null || charSequence.length() == 0) {
                filteredList.addAll(moviesTitleListAll);
            } else {
                for (String movie : moviesTitleListAll) {
                    if (movie.toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        filteredList.add(movie);
                    }
                }
            }

            FilterResults filterResults = new FilterResults();
            filterResults.values = filteredList;
            return filterResults;
        }

        //Automatic on UI thread
        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            moviesTitleList.clear();
            moviesTitleList.addAll((Collection<? extends String>) filterResults.values);
            notifyDataSetChanged();
        }
    };



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView textView;
        //TextView rowCountTextView;
        OnNoteListener onNoteListener;
        CheckedTextView mcheckedTextView;

        public ViewHolder(@NonNull View itemView,OnNoteListener onNoteListener) {
            super(itemView);

            imageView = itemView.findViewById(R.id.icon_rv);
            textView = itemView.findViewById(R.id.textView);

            //rowCountTextView = itemView.findViewById(R.id.rowCountTextView);

            this.onNoteListener=onNoteListener;
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            onNoteListener.OnNoteClick(getAdapterPosition());

            //Toast.makeText(view.getContext(), moviesList.get(getAdapterPosition()), Toast.LENGTH_SHORT).show();
        }
    }

    public interface OnNoteListener
    {
        void OnNoteClick(int pos);
    }

}

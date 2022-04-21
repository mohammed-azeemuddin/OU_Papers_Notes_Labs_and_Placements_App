package com.azeem.ou_app2.RCV3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.azeem.ou_app2.R;
import com.google.firebase.firestore.auth.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserAdapterVh> implements Filterable {

    public List<UserModel> userModelList = new ArrayList<>();
    public List<UserModel> getUserModelListFilter = new ArrayList<>();
    public Context context;
    public UserClickListener userClickListener;

    public UserAdapter(List<UserModel> userModels,Context context,UserClickListener userClickListener){
        this.userModelList = userModels;
        this.getUserModelListFilter = userModels;
        this.context = context;
        this.userClickListener = userClickListener;
    }


    @Override
    public Filter getFilter() {
        Filter filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults filterResults = new FilterResults();
                if(constraint == null || constraint.length() == 0){
                    filterResults.values = getUserModelListFilter;
                    filterResults.count = getUserModelListFilter.size();
                } else {
                    String searchStr = constraint.toString().toLowerCase();
                    List<UserModel> userModels = new ArrayList<>();
                    for(UserModel userModel:getUserModelListFilter){
                        if(userModel.getName().toLowerCase().contains(searchStr)){
                            userModels.add(userModel);
                        }
                    }
                    filterResults.values = userModels;
                    filterResults.count = userModels.size();
                }
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraints, FilterResults results) {
                    userModelList = (List<UserModel>)results.values;
                    notifyDataSetChanged();
            }
        };
        return filter;
    }

    public interface UserClickListener{
        void selectedUser(UserModel userModel);
    }



    @NonNull
    @Override
    public UserAdapterVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.row_users,parent,false);
        return new UserAdapterVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserAdapterVh holder, int position) {

            UserModel userModel = userModelList.get(position);
            String name = userModel.getName();
            String url = userModel.getUrl();

            holder.userName.setText(name);
            // holder.userPrefix.setText(prefix);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    userClickListener.selectedUser(userModel);
                }
            });
    }

    @Override
    public int getItemCount() {
        return userModelList.size();
    }

    public static class UserAdapterVh extends RecyclerView.ViewHolder{

        private TextView userName;

        public UserAdapterVh(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.tvUserName);
        }
    }
}

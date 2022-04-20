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
                        if(userModel.getFirstName().toLowerCase().contains(searchStr)
                        || userModel.getUserPhone().toLowerCase().contains(searchStr)){
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
            String firstName = userModel.getFirstName();
            String lastName = userModel.getLastName();
            String userPhone = userModel.getUserPhone();
            String userName = firstName+lastName;
            String prefix = firstName.charAt(0)+""+lastName.charAt(0);

            holder.userPhone.setText(userPhone);
            holder.userName.setText(userName);
            holder.userPrefix.setText(prefix);

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
        private TextView userPhone;
        private TextView userPrefix;

        public UserAdapterVh(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.tvUserName);
            userPrefix = itemView.findViewById(R.id.tvPrefix);
            userPhone = itemView.findViewById(R.id.tvPhoneNumber);
        }
    }
}

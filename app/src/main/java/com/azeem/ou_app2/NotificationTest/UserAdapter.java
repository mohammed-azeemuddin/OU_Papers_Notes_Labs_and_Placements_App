package com.azeem.ou_app2.NotificationTest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.azeem.ou_app2.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>
{
    private Context context;
    private List<User> userList;

    public UserAdapter(Context context, List<User> userList){
        this.context = context;
        this.userList =userList;
    }


    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_users,
                parent,
                false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);
        holder.textViewEmail.setText(user.email);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class UserViewHolder extends  RecyclerView.ViewHolder{

        TextView textViewEmail;

        public UserViewHolder(View itemView){
            super(itemView);
            textViewEmail = itemView.findViewById(R.id.textViewEmail);
        }
    }


}

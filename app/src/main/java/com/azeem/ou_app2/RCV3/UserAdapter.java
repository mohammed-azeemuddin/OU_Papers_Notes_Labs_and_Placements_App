package com.azeem.ou_app2.RCV3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.azeem.ou_app2.R;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserAdapterVh> {

    public List<UserModel> userModelList = new ArrayList<>();
    public Context context;
    public UserClickListener userClickListener;

    public interface UserClickListener{
        void selectedUser(UserModel userModel);
    }

    public UserAdapter(List<UserModel> userModels,Context context,UserClickListener userClickListener){
        this.userModelList = userModels;
        this.context = context;
        this.userClickListener = userClickListener;
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

package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Sadapter  extends RecyclerView.Adapter<Sviewholder> {


    private final ArrayList<Database> userList;
    private final ItemClickListener itemClickListener;

    public Sadapter(ArrayList<Database> userlist, ItemClickListener itemClickListener) {
        userList = userlist;
        this.itemClickListener = itemClickListener;
    }


    @NonNull
    @Override
    public Sviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdesign, parent, false);

        return new Sviewholder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull Sviewholder holder, int position) {
        Database database = userList.get(position);
        holder.setData(database);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
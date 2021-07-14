package com.example.recyclerview;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Sviewholder extends RecyclerView.ViewHolder {

    private TextView editText;
    private TextView editText1;
    private TextView editText2;
    private TextView editText3;
    private RelativeLayout relativeLayout;
    private ItemClickListener itemClickListener;
    private ImageView image1;

    public Sviewholder(@NonNull  View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener=itemClickListener;
        initviews(itemView);

    }

    private void initviews(View itemView) {
        editText=itemView.findViewById(R.id.name);
        editText1=itemView.findViewById(R.id.id);
        editText2=itemView.findViewById(R.id.DOB);
        editText3=itemView.findViewById(R.id.address);
        relativeLayout=itemView.findViewById(R.id.relat);
        image1=itemView.findViewById(R.id.jeff);
    }




    public void setData(Database database) {
        editText.setText(database.getName() + "");
        editText1.setText(database.getId() + "");
        editText2.setText(database.getDOB() + "");
        editText3.setText(database.getAddress() + "");
        image1.setImageResource(database.getImage());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onitemClicked(database,getAdapterPosition());

            }
        });
    }
}

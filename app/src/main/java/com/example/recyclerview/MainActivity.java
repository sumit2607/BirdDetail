package com.example.recyclerview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements ItemClickListener{

    private ArrayList<Database>userlist;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        Sadapter sadapter=new Sadapter(userlist,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(sadapter);

    }

    private void initData() {
        userlist=new ArrayList<>();

        userlist.add(new Database("jeff_bezos",209,"18-12-1956","361, rajpur khurd new delhi",R.drawable.jeff_bezos_1));
        userlist.add(new Database("Prateek Shukla",210,"28-02-1996","361 rajpur khurd new delhi",R.drawable.prateek_sukla_1));
        userlist.add(new Database("bill gataes",211,"28-02-1997","Usa",R.drawable.bill_gates_1));
        userlist.add(new Database("jeff_bezos",209,"18-12-1956","361, rajpur khurd new delhi",R.drawable.jeff_bezos_1));
        userlist.add(new Database("Prateek Shukla",210,"28-02-1996","361 rajpur khurd new delhi",R.drawable.prateek_sukla_1));
        userlist.add(new Database("bill gataes",211,"28-02-1997","Usa",R.drawable.bill_gates_1));
        userlist.add(new Database("jeff_bezos",209,"18-12-1956","361, rajpur khurd new delhi",R.drawable.jeff_bezos_1));
        userlist.add(new Database("Prateek Shukla",210,"28-02-1996","361 rajpur khurd new delhi",R.drawable.prateek_sukla_1));
        userlist.add(new Database("bill gataes",211,"28-02-1997","Usa",R.drawable.bill_gates_1));
        userlist.add(new Database("jeff_bezos",209,"18-12-1956","361, rajpur khurd new delhi",R.drawable.jeff_bezos_1));
        userlist.add(new Database("Prateek Shukla",210,"28-02-1996","361 rajpur khurd new delhi",R.drawable.prateek_sukla_1));
        userlist.add(new Database("bill gataes",211,"28-02-1997","Usa",R.drawable.bill_gates_1));
        userlist.add(new Database("jeff_bezos",209,"18-12-1956","361, rajpur khurd new delhi",R.drawable.jeff_bezos_1));
        userlist.add(new Database("Prateek Shukla",210,"28-02-1996","361 rajpur khurd new delhi",R.drawable.prateek_sukla_1));
        userlist.add(new Database("bill gataes",211,"28-02-1997","Usa",R.drawable.bill_gates_1));



    }

    @Override
    public void onitemClicked(Database data, int position) {
        new AlertDialog.Builder(this)
                .setTitle("Hey this is the data")
                .setMessage(
                        data.getName()+"\n"
                        + data.getId() +"\n"
                        +data.getDOB()+"\n"
                        +data.getAddress()+"\n"
                ).show();
    }
}
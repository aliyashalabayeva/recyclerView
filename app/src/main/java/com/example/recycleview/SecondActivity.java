package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    clothesListAdapter clothesListAdapter;
    ArrayList<Clothes> clothesList;
    private RecyclerView.LayoutManager LinearLayoutManager, gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = findViewById(R.id.recyclerView);
        clothesList = new ArrayList<>();

        clothesList.add(new Clothes(R.drawable.tshirt, "T-shirt","S M L",7000));
        clothesList.add(new Clothes(R.drawable.sweater, "Sweater","S M L",10000));
        clothesList.add(new Clothes(R.drawable.socks, "Socks","S M L",1200));

        clothesListAdapter = new clothesListAdapter(this, clothesList);

        LinearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this,3);

        recyclerView.setLayoutManager(LinearLayoutManager);
        recyclerView.setAdapter(clothesListAdapter);
    }
}
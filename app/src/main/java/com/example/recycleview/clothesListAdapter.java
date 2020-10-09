package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class clothesListAdapter extends RecyclerView.Adapter<clothesListAdapter.MyTViewHolder>{
    private Context context;
    private List<Clothes> clothesList;

    public class MyTViewHolder extends RecyclerView.ViewHolder {
        public ImageView photo;
        public TextView title, size, price;


        public MyTViewHolder(View view) {
            super(view);
            photo = view.findViewById(R.id.photo);
            title = view.findViewById(R.id.title);
            size = view.findViewById(R.id.size);
            price = view.findViewById(R.id.price);

        }
    }

    public clothesListAdapter(Context context, List<Clothes> clothesList){
        this.context = context;
        this.clothesList = clothesList;
    }


    @Override
    public MyTViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_clothes, parent, false);

        return new MyTViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyTViewHolder holder, int position) {

        Clothes item = clothesList.get(position);
        holder.photo.setImageResource(item.getPhoto());
        holder.title.setText(item.getTitle());
        holder.size.setText(item.getSize());
        holder.price.setText(""+item.getPrice());
    }

    @Override
    public int getItemCount() { return clothesList.size(); }
}


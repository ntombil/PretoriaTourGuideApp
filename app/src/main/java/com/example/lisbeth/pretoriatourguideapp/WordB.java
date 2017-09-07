package com.example.lisbeth.pretoriatourguideapp;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by LISBETH on 2017/08/17.
 */

public class WordB extends RecyclerView .Adapter<WordB.ViewHolder> {
    Context context ;
    List<Recycler> recyclerList;

    public WordB(Context context, List<Recycler> recyclerList) {
        this.context = context;
        this.recyclerList = recyclerList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contain,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final  Recycler recycler=recyclerList.get(position);

        holder.name.setText(recycler.getName());
        holder.details.setText(recycler.getMore());
        holder.image.setImageResource(recycler.getImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Accomodation.class);
                intent.putExtra("family bond",(CharSequence) context);
                context.startActivity(intent);
            }
        });

    }
    @Override
    public int getItemCount() {
       return recyclerList.size();

    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView details;
        ImageView image;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.card);

        }
    }





        }


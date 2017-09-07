package com.example.lisbeth.pretoriatourguideapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LISBETH on 2017/08/16.
 */

public class Word extends RecyclerView.Adapter <Word.ViewHolder> {
    Context context ;
    List<Recycler> recyclerList;

    public Word(Context context, List<Recycler> recyclerLists) {
        this.context = context;
        this.recyclerList = recyclerLists;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contain,parent,false);
        ViewHolder viewHolder =new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final Word.ViewHolder holder, int position) {
        final Recycler contacts = recyclerList.get(position);
        holder.name.setText(contacts.getName());
        holder.details.setText(contacts.getMore());
        holder.image.setImageResource(contacts.getImage());


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Next.class);
                intent.putExtra("family bond",contacts);
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

                name= (TextView) itemView.findViewById(R.id.txtName);
                details= (TextView) itemView.findViewById(R.id.txtmore);
                image= (ImageView) itemView.findViewById(R.id.imageV);

                cardView=(CardView)itemView.findViewById(R.id.card);



            }
        }

    }

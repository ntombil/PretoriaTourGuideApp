package com.example.lisbeth.pretoriatourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Next extends AppCompatActivity {
    ImageView imageView;
    TextView top,bottom;
    Recycler recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        top=(TextView)findViewById(R.id.txt_top );
        bottom= (TextView) findViewById(R.id.txt_bottom);
        imageView=(ImageView)findViewById(R.id.imageView1);


        Intent intent=getIntent();
        recycler=(Recycler)intent.getSerializableExtra("family bond");
        top.setText(recycler.getName());
        bottom.setText(recycler.getMore() );
        imageView.setImageResource(recycler.getImage());



    }
}

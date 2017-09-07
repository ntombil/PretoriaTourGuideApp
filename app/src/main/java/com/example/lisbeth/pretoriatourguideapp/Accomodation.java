package com.example.lisbeth.pretoriatourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Accomodation extends AppCompatActivity {
TextView textView ,textView2;
    ImageView imageView;
    Word word;
   Recycler recycler;
RecyclerView viewd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation);

        viewd=(RecyclerView)findViewById(R.id.Root);
        viewd.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Recycler> recyclerArrayList=new ArrayList<>();
        Recycler contacts =new Recycler();
        contacts.setName("Premier Hotel");
        recyclerArrayList.add(contacts);
        contacts.setImage(R.drawable.premi);
        contacts.setMore("1. SunnyPark Resort" + "The gleaming 25-storey glass and steel Holiday Inn Express Pretoria-Sunnypark is just 2km from the heart of the city and a 5-minute drive from Pretoria MediClinic. As a hotel near Sunnypark Shopping Centre, you'll find a wide range of shopping, dining and entertainment options close by. Relax in your modern guest room, a peaceful haven with wireless internet. Gaze at Pretoria's urban skyline and the mountains beyond as you cool off in our outdoor pool. For a Pretoria hotel near downtown, look no further than Holiday Inn Express Pretoria-Sunnypark as it is centrally located near the government offices and just an hour's drive from OR Tambo International Airport. This Pretoria business  hotel has two air-conditioned meeting rooms with wireless internet and can fit up to 40 guests. Feel free to use our self-service business centre open 24-hours. Bask in the sunshine with a hearty complimentary buffet breakfast on the hotel's terrace, followed by a dip in the sparkling outdoor pool. Take a short walk from the hotel to Freedom Park, a cultural landmark that celebrates South Africa’s rich heritage.Get a glimpse of the President's office as you wander through the lush terraced gardens of the Union Buildings. In the evening, join friends in the vibrant bars and restaurants clustered around the pretty Hatfield Square.\"" + "\n2. Nkwe pleasure Resort" + " Nkwe Caravan Park and Picnic Spot is a short distance from the city Pretoria and 50km from the East Rand, an ideal spot for family, friends and group get togethers, less than a hours drive from Johannesburg. Nkwe offers our guests the following facilities.");
        word = new Word(this,recyclerArrayList);
        viewd.setAdapter(word);


        Recycler contacts4 =new Recycler();
        contacts4.setName("Arabelle Guest House");
        recyclerArrayList.add(contacts4);
        contacts4.setImage(R.drawable.arabelle);
        contacts4.setMore("1. SunnyPark Resort" + "The gleaming 25-storey glass and steel Holiday Inn Express Pretoria-Sunnypark is just 2km from the heart of the city and a 5-minute drive from Pretoria MediClinic. As a hotel near Sunnypark Shopping Centre, you'll find a wide range of shopping, dining and entertainment options close by. Relax in your modern guest room, a peaceful haven with wireless internet. Gaze at Pretoria's urban skyline and the mountains beyond as you cool off in our outdoor pool. For a Pretoria hotel near downtown, look no further than Holiday Inn Express Pretoria-Sunnypark as it is centrally located near the government offices and just an hour's drive from OR Tambo International Airport. This Pretoria business  hotel has two air-conditioned meeting rooms with wireless internet and can fit up to 40 guests. Feel free to use our self-service business centre open 24-hours. Bask in the sunshine with a hearty complimentary buffet breakfast on the hotel's terrace, followed by a dip in the sparkling outdoor pool. Take a short walk from the hotel to Freedom Park, a cultural landmark that celebrates South Africa’s rich heritage.Get a glimpse of the President's office as you wander through the lush terraced gardens of the Union Buildings. In the evening, join friends in the vibrant bars and restaurants clustered around the pretty Hatfield Square.\"" + "\n2. Nkwe pleasure Resort" + " Nkwe Caravan Park and Picnic Spot is a short distance from the city Pretoria and 50km from the East Rand, an ideal spot for family, friends and group get togethers, less than a hours drive from Johannesburg. Nkwe offers our guests the following facilities.");
        word = new Word(this,recyclerArrayList);
        viewd.setAdapter(word);

        Recycler contacts6 =new Recycler();
        contacts6.setName("Akanani Apartment");
        recyclerArrayList.add(contacts6);
        contacts6.setImage(R.drawable.akanani);
        contacts6.setMore("1. SunnyPark Resort" + "The gleaming 25-storey glass and steel Holiday Inn Express Pretoria-Sunnypark is just 2km from the heart of the city and a 5-minute drive from Pretoria MediClinic. As a hotel near Sunnypark Shopping Centre, you'll find a wide range of shopping, dining and entertainment options close by. Relax in your modern guest room, a peaceful haven with wireless internet. Gaze at Pretoria's urban skyline and the mountains beyond as you cool off in our outdoor pool. For a Pretoria hotel near downtown, look no further than Holiday Inn Express Pretoria-Sunnypark as it is centrally located near the government offices and just an hour's drive from OR Tambo International Airport. This Pretoria business  hotel has two air-conditioned meeting rooms with wireless internet and can fit up to 40 guests. Feel free to use our self-service business centre open 24-hours. Bask in the sunshine with a hearty complimentary buffet breakfast on the hotel's terrace, followed by a dip in the sparkling outdoor pool. Take a short walk from the hotel to Freedom Park, a cultural landmark that celebrates South Africa’s rich heritage.Get a glimpse of the President's office as you wander through the lush terraced gardens of the Union Buildings. In the evening, join friends in the vibrant bars and restaurants clustered around the pretty Hatfield Square.\"" + "\n2. Nkwe pleasure Resort" + " Nkwe Caravan Park and Picnic Spot is a short distance from the city Pretoria and 50km from the East Rand, an ideal spot for family, friends and group get togethers, less than a hours drive from Johannesburg. Nkwe offers our guests the following facilities."

        );
        word = new Word(this,recyclerArrayList);
        viewd.setAdapter(word) ;


        Recycler contacts7 =new Recycler();
        contacts7.setName("Fort Klapperkop Museum");
        recyclerArrayList.add(contacts7);
        contacts7.setImage(R.drawable.klapp);
        contacts7.setMore("1. SunnyPark Resort" + "The gleaming 25-storey glass and steel Holiday Inn Express Pretoria-Sunnypark is just 2km from the heart of the city and a 5-minute drive from Pretoria MediClinic. As a hotel near Sunnypark Shopping Centre, you'll find a wide range of shopping, dining and entertainment options close by. Relax in your modern guest room, a peaceful haven with wireless internet. Gaze at Pretoria's urban skyline and the mountains beyond as you cool off in our outdoor pool. For a Pretoria hotel near downtown, look no further than Holiday Inn Express Pretoria-Sunnypark as it is centrally located near the government offices and just an hour's drive from OR Tambo International Airport. This Pretoria business  hotel has two air-conditioned meeting rooms with wireless internet and can fit up to 40 guests. Feel free to use our self-service business centre open 24-hours. Bask in the sunshine with a hearty complimentary buffet breakfast on the hotel's terrace, followed by a dip in the sparkling outdoor pool. Take a short walk from the hotel to Freedom Park, a cultural landmark that celebrates South Africa’s rich heritage.Get a glimpse of the President's office as you wander through the lush terraced gardens of the Union Buildings. In the evening, join friends in the vibrant bars and restaurants clustered around the pretty Hatfield Square.\"" + "\n2. Nkwe pleasure Resort" + " Nkwe Caravan Park and Picnic Spot is a short distance from the city Pretoria and 50km from the East Rand, an ideal spot for family, friends and group get togethers, less than a hours drive from Johannesburg. Nkwe offers our guests the following facilities.");
        word = new Word(this,recyclerArrayList);
        viewd.setAdapter(word) ;



        Recycler contacts8=new Recycler();
        contacts8.setName("Kruger House Museum");
        recyclerArrayList.add(contacts8);
        contacts8.setImage(R.drawable.kruger);
        contacts8.setMore("1. SunnyPark Resort" + "The gleaming 25-storey glass and steel Holiday Inn Express Pretoria-Sunnypark is just 2km from the heart of the city and a 5-minute drive from Pretoria MediClinic. As a hotel near Sunnypark Shopping Centre, you'll find a wide range of shopping, dining and entertainment options close by. Relax in your modern guest room, a peaceful haven with wireless internet. Gaze at Pretoria's urban skyline and the mountains beyond as you cool off in our outdoor pool. For a Pretoria hotel near downtown, look no further than Holiday Inn Express Pretoria-Sunnypark as it is centrally located near the government offices and just an hour's drive from OR Tambo International Airport. This Pretoria business  hotel has two air-conditioned meeting rooms with wireless internet and can fit up to 40 guests. Feel free to use our self-service business centre open 24-hours. Bask in the sunshine with a hearty complimentary buffet breakfast on the hotel's terrace, followed by a dip in the sparkling outdoor pool. Take a short walk from the hotel to Freedom Park, a cultural landmark that celebrates South Africa’s rich heritage.Get a glimpse of the President's office as you wander through the lush terraced gardens of the Union Buildings. In the evening, join friends in the vibrant bars and restaurants clustered around the pretty Hatfield Square.\"" + "\n2. Nkwe pleasure Resort" + " Nkwe Caravan Park and Picnic Spot is a short distance from the city Pretoria and 50km from the East Rand, an ideal spot for family, friends and group get togethers, less than a hours drive from Johannesburg. Nkwe offers our guests the following facilities.");
        word = new Word(this,recyclerArrayList);
        viewd.setAdapter(word) ;


        Recycler contacts9=new Recycler();
        contacts9.setName("Voortrekkermon Monument  Museum");
        recyclerArrayList.add(contacts9);
        contacts9.setImage(R.drawable.voor);
        contacts9 .setMore("1. SunnyPark Resort" + "The gleaming 25-storey glass and steel Holiday Inn Express Pretoria-Sunnypark is just 2km from the heart of the city and a 5-minute drive from Pretoria MediClinic. As a hotel near Sunnypark Shopping Centre, you'll find a wide range of shopping, dining and entertainment options close by. Relax in your modern guest room, a peaceful haven with wireless internet. Gaze at Pretoria's urban skyline and the mountains beyond as you cool off in our outdoor pool. For a Pretoria hotel near downtown, look no further than Holiday Inn Express Pretoria-Sunnypark as it is centrally located near the government offices and just an hour's drive from OR Tambo International Airport. This Pretoria business  hotel has two air-conditioned meeting rooms with wireless internet and can fit up to 40 guests. Feel free to use our self-service business centre open 24-hours. Bask in the sunshine with a hearty complimentary buffet breakfast on the hotel's terrace, followed by a dip in the sparkling outdoor pool. Take a short walk from the hotel to Freedom Park, a cultural landmark that celebrates South Africa’s rich heritage.Get a glimpse of the President's office as you wander through the lush terraced gardens of the Union Buildings. In the evening, join friends in the vibrant bars and restaurants clustered around the pretty Hatfield Square.\"" + "\n2. Nkwe pleasure Resort" + " Nkwe Caravan Park and Picnic Spot is a short distance from the city Pretoria and 50km from the East Rand, an ideal spot for family, friends and group get togethers, less than a hours drive from Johannesburg. Nkwe offers our guests the following facilities.");
        word = new Word(this,recyclerArrayList);
        viewd.setAdapter(word) ;


        Recycler contacts10=new Recycler();
        contacts10.setName("SunnyPark Resorts");
        recyclerArrayList.add(contacts10);
        contacts10.setImage(R.drawable.resortssss);
        contacts10 .setMore("1. SunnyPark Resort" + "The gleaming 25-storey glass and steel Holiday Inn Express Pretoria-Sunnypark is just 2km from the heart of the city and a 5-minute drive from Pretoria MediClinic. As a hotel near Sunnypark Shopping Centre, you'll find a wide range of shopping, dining and entertainment options close by. Relax in your modern guest room, a peaceful haven with wireless internet. Gaze at Pretoria's urban skyline and the mountains beyond as you cool off in our outdoor pool. For a Pretoria hotel near downtown, look no further than Holiday Inn Express Pretoria-Sunnypark as it is centrally located near the government offices and just an hour's drive from OR Tambo International Airport. This Pretoria business  hotel has two air-conditioned meeting rooms with wireless internet and can fit up to 40 guests. Feel free to use our self-service business centre open 24-hours. Bask in the sunshine with a hearty complimentary buffet breakfast on the hotel's terrace, followed by a dip in the sparkling outdoor pool. Take a short walk from the hotel to Freedom Park, a cultural landmark that celebrates South Africa’s rich heritage.Get a glimpse of the President's office as you wander through the lush terraced gardens of the Union Buildings. In the evening, join friends in the vibrant bars and restaurants clustered around the pretty Hatfield Square.\"" + "\n2. Nkwe pleasure Resort" + " Nkwe Caravan Park and Picnic Spot is a short distance from the city Pretoria and 50km from the East Rand, an ideal spot for family, friends and group get togethers, less than a hours drive from Johannesburg. Nkwe offers our guests the following facilities.");
        word = new Word(this,recyclerArrayList);
        viewd.setAdapter(word) ;


        Recycler contacts11=new Recycler();
        contacts11.setName("\"Nkwe pleasure  Resorts");
        recyclerArrayList.add(contacts11);
        contacts11.setImage(R.drawable.nkwe);
        contacts11 .setMore("1. SunnyPark Resort" + "The gleaming 25-storey glass and steel Holiday Inn Express Pretoria-Sunnypark is just 2km from the heart of the city and a 5-minute drive from Pretoria MediClinic. As a hotel near Sunnypark Shopping Centre, you'll find a wide range of shopping, dining and entertainment options close by. Relax in your modern guest room, a peaceful haven with wireless internet. Gaze at Pretoria's urban skyline and the mountains beyond as you cool off in our outdoor pool. For a Pretoria hotel near downtown, look no further than Holiday Inn Express Pretoria-Sunnypark as it is centrally located near the government offices and just an hour's drive from OR Tambo International Airport. This Pretoria business  hotel has two air-conditioned meeting rooms with wireless internet and can fit up to 40 guests. Feel free to use our self-service business centre open 24-hours. Bask in the sunshine with a hearty complimentary buffet breakfast on the hotel's terrace, followed by a dip in the sparkling outdoor pool. Take a short walk from the hotel to Freedom Park, a cultural landmark that celebrates South Africa’s rich heritage.Get a glimpse of the President's office as you wander through the lush terraced gardens of the Union Buildings. In the evening, join friends in the vibrant bars and restaurants clustered around the pretty Hatfield Square.\"" + "\n2. Nkwe pleasure Resort" + " Nkwe Caravan Park and Picnic Spot is a short distance from the city Pretoria and 50km from the East Rand, an ideal spot for family, friends and group get togethers, less than a hours drive from Johannesburg. Nkwe offers our guests the following facilities.");
        word = new Word(this,recyclerArrayList);
        viewd.setAdapter(word) ;

        Recycler contacts12=new Recycler();
        contacts12.setName("\"Fountain Recreation Resorts");
        recyclerArrayList.add(contacts12);
        contacts12.setImage(R.drawable.fount);
       contacts12.setMore("1. SunnyPark Resort" + "The gleaming 25-storey glass and steel Holiday Inn Express Pretoria-Sunnypark is just 2km from the heart of the city and a 5-minute drive from Pretoria MediClinic. As a hotel near Sunnypark Shopping Centre, you'll find a wide range of shopping, dining and entertainment options close by. Relax in your modern guest room, a peaceful haven with wireless internet. Gaze at Pretoria's urban skyline and the mountains beyond as you cool off in our outdoor pool. For a Pretoria hotel near downtown, look no further than Holiday Inn Express Pretoria-Sunnypark as it is centrally located near the government offices and just an hour's drive from OR Tambo International Airport. This Pretoria business  hotel has two air-conditioned meeting rooms with wireless internet and can fit up to 40 guests. Feel free to use our self-service business centre open 24-hours. Bask in the sunshine with a hearty complimentary buffet breakfast on the hotel's terrace, followed by a dip in the sparkling outdoor pool. Take a short walk from the hotel to Freedom Park, a cultural landmark that celebrates South Africa’s rich heritage.Get a glimpse of the President's office as you wander through the lush terraced gardens of the Union Buildings. In the evening, join friends in the vibrant bars and restaurants clustered around the pretty Hatfield Square.\"" + "\n2. Nkwe pleasure Resort" + " Nkwe Caravan Park and Picnic Spot is a short distance from the city Pretoria and 50km from the East Rand, an ideal spot for family, friends and group get togethers, less than a hours drive from Johannesburg. Nkwe offers our guests the following facilities.");
        word = new Word(this,recyclerArrayList);
        viewd.setAdapter(word) ;

    }
}

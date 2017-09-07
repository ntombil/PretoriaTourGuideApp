package com.example.lisbeth.pretoriatourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    Word word;
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView=(RecyclerView)findViewById(R.id.RootView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Recycler> recyclerArrayList=new ArrayList<>();

        Recycler contacts2 =new Recycler();
        contacts2.setName("Pretoria Zoo");
        recyclerArrayList.add(contacts2);
        contacts2.setImage(R.drawable.zoo);
        contacts2 .setMore(
                "The National Zoological Gardens, more commonly known as the Pretoria Zoo, is the largest zoo in South Africa and the only one which has a national status. It is also rated as one of the top zoos in the world.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Pretoria Zoo Elephants in Pretoria \n" +
                        " The zoo was established in 1899 but only officially became the National Zoo in 1916, and now hosts in excess of 600 000 visitors every year.\n" +
                        "\n" +
                        "Contact Pretoria Zoo :\n" +
                        "Physical Address: 232 Boom St, Box 754, Pretoria, 0001, South Africa\n" +
                        "\n" +
                        "\n" +
                        "Telephone: 012 328 3265\n" +
                        "\n" +
                        "It is no longer just a collection of rare and unusual caged animals, but rather plays a vital part in the conservation of threatened species. The Pretoria zoo is also a well respected research facility and is famous for its successful breeding programmes.\n" +
                        "\n" +
                        "There is a lot of importance placed on providing the animals with a natural environment to live in, and for this reason, a large number of enclosures have been revamped or modernised in recent years. Some special enclosures include a large walk-through aviary and a specially air-conditioned Australia section. The zoo also has the largest inland aquarium in the country, a large reptile park.");
        recyclerView.setAdapter(word) ;

        Recycler contacts3 =new Recycler();
        contacts3.setName("Union Building");
        recyclerArrayList.add(contacts3);
        contacts3.setImage(R.drawable.un);
        contacts3 .setMore("Entrance to the building itself is prohibited for security reasons, since it is the site of the Presidential Offices. However, the beautiful terraced gardens, which boast a wide variety of indigenous plants, are open to the public and provide a truly amazing view over the city."+
                "It was in these gardens that former president, Nelson Mandela’s inauguration ceremony was held on May 10, 1994."+
                "The gardens of the Union Buildings also house numerous statues and memorials,including statues of former presidents and a war memorial. The gardens are also the site of numerous celebrations arranged on an annual basis to coincide with national holidays."+
                "Find accommodation in the City of Tshwane (previously Pretoria), and visit the Union Buildings during your visit.");
        word = new Word(this,recyclerArrayList);
        recyclerView.setAdapter(word) ;


        Recycler contacts4 =new Recycler();
        contacts4.setName("Resorts");
        recyclerArrayList.add(contacts4);
        contacts4.setMore("1. SunnyPark Resort" +
                "The gleaming 25-storey glass and steel Holiday Inn Express Pretoria-Sunnypark is just 2km from the heart of the city and a 5-minute drive from Pretoria MediClinic. As a hotel near Sunnypark Shopping Centre, you'll find a wide range of shopping, dining and entertainment options close by. Relax in your modern guest room, a peaceful haven with wireless internet. Gaze at Pretoria's urban skyline and the mountains beyond as you cool off in our outdoor pool. For a Pretoria hotel near downtown, look no further than Holiday Inn Express Pretoria-Sunnypark as it is centrally located near the government offices and just an hour's drive from OR Tambo International Airport. This Pretoria business  hotel has two air-conditioned meeting rooms with wireless internet and can fit up to 40 guests. Feel free to use our self-service business centre open 24-hours. Bask in the sunshine with a hearty complimentary buffet breakfast on the hotel's terrace, followed by a dip in the sparkling outdoor pool. Take a short walk from the hotel to Freedom Park, a cultural landmark that celebrates South Africa’s rich heritage.Get a glimpse of the President's office as you wander through the lush terraced gardens of the Union Buildings. In the evening, join friends in the vibrant bars and restaurants clustered around the pretty Hatfield Square." +
                "\n" +
                "\n 2. Nkwe pleasure Resort" +
                "\n" +
               " Nkwe Caravan Park and Picnic Spot is a short distance from the city Pretoria and 50km from the East Rand, an ideal spot for family, friends and group get togethers, less than a hours drive from Johannesburg. Nkwe offers our guests the following facilities."+
                "\n" +
                "\n 3.The Fountains Valley Resort, located   "+
                        "\n" +
                        "within the Groenkloof Reserve in Tshwane, is one of the most popular resorts in Pretoria and offers recreational facilities."+
                        " Many years ago the resort site was placed under the stewardship of the Nature and Conservation Department, as the ground is the source of the Apies River, which provides Pretoria with some of its daily water needs. It took years to eradicate alien plant species threatening to choke the natural water supply, but Fountains Valley is once again a natural, indigenous garden that is home to a variety of birdlife."+
                        " The Fountains Valley Resort usually bursts into life at the weekend, and is among the most popular resorts in Pretoria for day visit activities with people arriving to braai (barbeque) using the convenient braai facilities, or picnic in the well-maintained grounds."+
               " Music festivals are occasionally held at the venue too. Within Fountains Valley there is a large swimming pool and a smaller children’s splash pool, a popular place to cool off during the heat of the Pretori");
        contacts4.setImage(R.drawable.resorts);
        word = new Word(this,recyclerArrayList);
        recyclerView.setAdapter(word) ;




        Recycler contacts =new Recycler();
        contacts.setName("Station");
        recyclerArrayList.add(contacts);
        contacts.setMore("Pretoria railway station is the central station in Pretoria, the executive capital of South Africa. It is located between Pretoria's central business district and Salvokop, in a 1910 building designed by Herbert Baker. It is the terminus of various Metrorail commuter rail services in the northern part of Gauteng, and a stop on Shosholoza Meyl inter-city services from Johannesburg to Polokwane and Nelspruit. Pretoria is also the northern terminus of the luxury Blue Train service from Cape Town. Platforms and tracks for the Gautrain rapid-rail service are adjacent to the main-line station.");
        contacts.setImage(R.drawable.station);
        word = new Word(this,recyclerArrayList);
        recyclerView.setAdapter(word) ;

        Recycler contacts5 =new Recycler();
        contacts5.setName("Stadium");
        recyclerArrayList.add(contacts5);
        contacts5.setImage(R.drawable.stadium);
        contacts5 .setMore("Loftus Versfeld Stadium is a rugby and soccer stadium situated in the Arcadia suburb of Pretoria, Gauteng, South Africa. The stadium has a capacity of 51,762 for rugby union and it is occasionally used for football matches."+
                " Owned by the Blue Bulls Rugby Union, the stadium is the home ground of the Bulls franchise of the Super Rugby tournament and the Blue Bulls union in South Africa's Currie Cup. It also hosted the 2009 Super 14 Final which the Bulls won 61 - 17 against the Waikato Chiefs, and the 2009 Currie Cup final, which the Bulls went on to win 36 - 24 against the Free State Cheetahs."+
                "  Also, the South Africa national rugby union team has played several test matches at the Loftus Versfeld Stadium. They played New Zealand in 1970, 1996, 1999, 2003 and 2006, Australia in 1967, 1997, 2001, 2005, 2010 and 2012, England in 1994, 2000 and 2007, and Ireland in 1998."+
                " In June 2010, the stadium hosted opening round games and one game of the round of 16 of the 2010 FIFA World Cup."+
                "\n"

                             );
        word = new Word(this,recyclerArrayList);
        recyclerView.setAdapter(word) ;



        Recycler contacts0 =new Recycler();
        contacts0.setName("Accomodation");
        recyclerArrayList.add(contacts0);
        contacts0.setImage(R.drawable.arabelle);
        contacts0 .setMore("Arabelle Guest House \n \n The elegant accommodation consists of six beautifully decorated en-suite rooms. Guests have a choice between the Family Room or one of the double rooms (some with entrance to garden and others to the patio). Every room is comfortably elegant with immaculate white linen."+
                        "\n* Breakfast at the trendy Pure Cafe across the street"+
               "\n * Free Wi-Fi internet access"+
               "\n * Secure parking" +
               "\n * Alarm / security"+
                "\n* TV with selected DStv channels"+
               "\n * Garden and braai facilities"+
              "\n * Comfortable lounge / reading room"+
               "\n \n Location and Attractions\n\n"+
        "• The city centre\n" +
                "• Easy access to the N1 and N4 highways\n" +
                "• Hatfield Gautrain station\n" +
                "• The Union Buildings\n" +
                "• Loftus Versfeld Rugby and Sports Arena\n" +
                "• The University of Pretoria\n" +
                "• The popular Hatfield square and entertainment hall");

    }
}

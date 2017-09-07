package com.example.lisbeth.pretoriatourguideapp;

import android.media.Image;

import java.io.Serializable;

/**
 * Created by LISBETH on 2017/08/16.
 */

public class Recycler  implements Serializable {
    private   String name;
    private int image;
   private String more;


    public Recycler(String name, String more, int image) {
        this.name = name;
        this.more = more;
        this.image = image;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Recycler() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
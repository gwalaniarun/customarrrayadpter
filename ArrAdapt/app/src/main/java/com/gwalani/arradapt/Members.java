package com.gwalani.arradapt;

/**
 * Created by Arun on 27/12/2017.
 */

public class Members {

    private String mName;
    private int mImageResourceId;

    public Members(String name, int imageResourceId){

        mName = name;
        mImageResourceId = imageResourceId;
    }
    public Members(String name){

        mName = name;

    }

    public String getName()
    {
        return mName;
    }

    public int getImage(){
        return mImageResourceId;
    }

}

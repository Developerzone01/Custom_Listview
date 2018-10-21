package com.Faisal_Ijaz.customadaptor;

/**
 * Created by Faisal Ijaz on 10/21/2018.
 */

public class AndroidFlavor {
    private String mListItem_name;
    private int mImageResource;
    private double mListItemversion;

    public AndroidFlavor(String mVersion_name, int mImageResource,double mListItemversion) {
        this.mListItem_name = mVersion_name;
        this.mImageResource = mImageResource;
        this.mListItemversion=mListItemversion;
    }

    public String getmVersion_name() {
        return mListItem_name;
    }

    public int getmImageResource() {
        return mImageResource;
    }
    public double getmListItemversion() {
        return mListItemversion;
    }
}

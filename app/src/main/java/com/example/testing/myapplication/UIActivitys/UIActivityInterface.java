package com.example.testing.myapplication.UIActivitys;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by 조남진 on 2017-01-06.
 */
public abstract class UIActivityInterface extends Activity {

    private ArrayList<ImageView> imageViews;
    public void init() {

    }

    public void backNavigation() {

    }
    public void onBackPressed(){
        backNavigation();
    }
    public int getWidth(int pixel)
    {
        double rate = pixel/640.0;
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay()
                .getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels;
        return (int)(rate*width);
    }
    public int getHeight(int pixel)
    {
        double rate = pixel/335.0;
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay()
                .getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        return (int)(rate*height);
    }
    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }
    protected void onResume()
    {
        super.onResume();
        imageViews=new ArrayList<>();
        init();
    }
    protected void onStop()
    {
        super.onStop();
        for(int i=imageViews.size()-1;imageViews.size()!=0;i=imageViews.size()-1)
        {
            imageViews.get(i).setImageBitmap(null);
            imageViews.remove(i);
        }
        imageViews=null;
    }
    protected void setBitmap(ImageView item, Bitmap bitmap)
    {
        if(item==null)
            Log.d("디버깅","?");
        if(bitmap==null)
            Log.d("디버깅","!");
        item.setImageBitmap(bitmap);
        imageViews.add(item);
    }
}

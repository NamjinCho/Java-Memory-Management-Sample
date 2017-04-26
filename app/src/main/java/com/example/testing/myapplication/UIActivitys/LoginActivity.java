package com.example.testing.myapplication.UIActivitys;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.testing.myapplication.ETC.BitmapLoader;
import com.example.testing.myapplication.R;

/**
 * Created by 조남진 on 2017-01-03.
 */
public class LoginActivity extends UIActivityInterface {

    @Override
    public void onCreate(Bundle datas)
    {
        super.onCreate(datas);
        setContentView(R.layout.login_activity_layout);
        init();
    }
    public void init()
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay()
                .getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels;
        int height = displaymetrics.heightPixels;
        ImageView logo = (ImageView)findViewById(R.id.logo);
        ImageView background = (ImageView)findViewById(R.id.backgroundImg);
        //background load
        background.setImageBitmap(BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.bg_basic,
                width,height));
        //logo load
        //486(162,0.253),162(54,0.1125)
        logo.setImageBitmap(BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.logo_login01,
                162,54));
        logo.getLayoutParams().width = (int)(width*0.253);
        logo.getLayoutParams().height = (int)(height*0.1612);
        //set Logo Margin
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(logo.getLayoutParams());
        lp.setMargins(0, (int)(height*0.119), 0, (int)(height*0.1731));
        logo.setLayoutParams(lp);

        //make Talk Login Btn
        ImageView btnTalkBack = (ImageView)findViewById(R.id.talkLoginBtnBackground);
        Bitmap bmp = BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.btn_login_talk,
                21,20);
        byte [] chunk = bmp.getNinePatchChunk();
        NinePatchDrawable drawable = new NinePatchDrawable(bmp,chunk,new Rect(),null);
        btnTalkBack.setImageDrawable(drawable);
        btnTalkBack.getLayoutParams().width = (int)(width*0.45);
        btnTalkBack.getLayoutParams().height=(int)(height*0.149);
     //34(0.053) 31(0.065)

        ImageView btnTalkIcon = (ImageView)findViewById(R.id.talkLoginBtnIcon);
        btnTalkIcon.setImageBitmap(BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.icon_login01,
                (int)(width*0.053),(int)(height*0.092)));
        btnTalkIcon.getLayoutParams().width = (int)(width*0.053);
        btnTalkIcon.getLayoutParams().height=(int)(height*0.092);
        //(int)(width*0.052)

        FrameLayout.LayoutParams lp2 = new FrameLayout.LayoutParams(btnTalkIcon.getLayoutParams());
        lp2.gravity = Gravity.CENTER_VERTICAL;
        lp2.setMargins((int)(width*0.044), 0,0,0);
        btnTalkIcon.setLayoutParams(lp2);

        TextView btnTalkText = (TextView)findViewById(R.id.talkLoginBtnText);
        lp2 = new FrameLayout.LayoutParams(btnTalkText.getLayoutParams());
        lp2.setMargins((int)(width*0.149), 0,0,0);//0.044+0.052
        lp2.gravity = Gravity.CENTER_VERTICAL;
        btnTalkText.setLayoutParams(lp2);

        FrameLayout btnTalkFrame = (FrameLayout)findViewById(R.id.talkLoginBtnFrame);
        lp = new LinearLayout.LayoutParams(btnTalkFrame.getLayoutParams());
        lp.gravity = Gravity.CENTER_HORIZONTAL;
        lp.setMargins(0, 0, 0, (int)(height*0.0388));
        btnTalkFrame.setLayoutParams(lp);

        //make Talk Login Btn
        ImageView btnOtherBack = (ImageView)findViewById(R.id.otherLoginBtnBackground);
        bmp = BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.btn_white,
                21,20);
        byte [] chunk2 = bmp.getNinePatchChunk();
        drawable = new NinePatchDrawable(bmp,chunk2,new Rect(),null);
        btnOtherBack.setImageDrawable(drawable);
        btnOtherBack.getLayoutParams().width = (int)(width*0.45);
        btnOtherBack.getLayoutParams().height=(int)(height*0.149);
        //34(0.053) 31(0.065)

        ImageView btnOtherIcon = (ImageView)findViewById(R.id.otherLoginBtnIcon);
        btnOtherIcon.setImageBitmap(BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.icon_login02,
                (int)(width*0.053),(int)(height*0.092)));
        btnOtherIcon.getLayoutParams().width = (int)(width*0.053);
        btnOtherIcon.getLayoutParams().height=(int)(height*0.092);
        //(int)(width*0.052)

        lp2 = new FrameLayout.LayoutParams(btnOtherIcon.getLayoutParams());
        lp2.gravity = Gravity.CENTER_VERTICAL;
        lp2.setMargins((int)(width*0.044), 0,0,0);
        btnOtherIcon.setLayoutParams(lp2);

        TextView btnOtherText = (TextView)findViewById(R.id.otherLoginBtnText);
        lp2 = new FrameLayout.LayoutParams(btnTalkText.getLayoutParams());
        lp2.setMargins((int)(width*0.149), 0,0,0);//0.044+0.052
        lp2.gravity = Gravity.CENTER_VERTICAL;
        btnOtherText.setLayoutParams(lp2);

        FrameLayout btnOtherFrame = (FrameLayout)findViewById(R.id.otherLoginBtnFrame);
        lp = new LinearLayout.LayoutParams(btnOtherFrame.getLayoutParams());
        lp.gravity = Gravity.CENTER_HORIZONTAL;
        lp.setMargins(0, 0, 0, 0);
        btnOtherFrame.setLayoutParams(lp);

    }
}

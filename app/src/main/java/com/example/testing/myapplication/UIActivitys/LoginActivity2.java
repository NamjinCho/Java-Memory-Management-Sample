package com.example.testing.myapplication.UIActivitys;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.widget.EditText;
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
public class LoginActivity2 extends UIActivityInterface {

    @Override
    public void onCreate(Bundle datas)
    {
        super.onCreate(datas);
        setContentView(R.layout.login_activity2_layout);
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
        logo.getLayoutParams().height = (int)(height*0.1104);
        //set Logo Margin
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(logo.getLayoutParams());
        lp.setMargins(0, (int)(height*0.0746), 0, (int)(height*0.0388));
        logo.setLayoutParams(lp);

        ImageView editIdBack = (ImageView)findViewById(R.id.idBoxImg);
        Bitmap bmp = BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.bg_input_login,
                21,20);
        byte [] chunk = bmp.getNinePatchChunk();
        NinePatchDrawable drawable = new NinePatchDrawable(bmp,chunk,new Rect(),null);
        editIdBack.setImageDrawable(drawable);
        editIdBack.getLayoutParams().width = (int)(width*0.3547);
        editIdBack.getLayoutParams().height=(int)(height*0.1164);

        EditText editIdText=(EditText)findViewById(R.id.idBoxEdit);
        editIdText.getLayoutParams().width = (int)(width*0.3547);
        editIdText.getLayoutParams().height=(int)(height*0.1164);

        FrameLayout editIdFrame = (FrameLayout)findViewById(R.id.editIdFrame);
        RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(editIdFrame.getLayoutParams());
        lp3.width=(int)(width*0.3547);
        lp3.height=(int)(height*0.1164);
        lp3.setMargins(0, (int)(height*0.0776), (int)(width*0.0969), 0);
        lp3.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        editIdFrame.setLayoutParams(lp3);

        LinearLayout boxFrame = (LinearLayout)findViewById(R.id.boxFrame);
        boxFrame.getLayoutParams().width= (int)(width*0.675);
        boxFrame.getLayoutParams().height=(int)(height*0.6567);
        ImageView boxBack = (ImageView)findViewById(R.id.boxBackground);
        bmp = BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.textbox,
                (int)(width*0.675),(int)(height*0.6567));
        byte [] chunk2 = bmp.getNinePatchChunk();
        drawable = new NinePatchDrawable(bmp,chunk2,new Rect(),null);
        boxBack.setImageDrawable(drawable);
        boxBack.getLayoutParams().width = (int)(width*0.675);
        boxBack.getLayoutParams().height=(int)(height*0.6567);

        FrameLayout boxRootFrame = (FrameLayout)findViewById(R.id.boxRootFrame);
        lp = new LinearLayout.LayoutParams(boxRootFrame.getLayoutParams());
        lp.gravity = Gravity.CENTER_HORIZONTAL;
        lp.setMargins(0, 0, 0, 0);
        boxRootFrame.setLayoutParams(lp);

        TextView textViewID = (TextView)findViewById(R.id.textViewId);
        textViewID.setGravity(Gravity.CENTER );

        RelativeLayout idRootLayout = (RelativeLayout)findViewById(R.id.idRootLayout);
        lp = new LinearLayout.LayoutParams(idRootLayout.getLayoutParams());
        lp.setMargins(0, 0, 0, (int)(height*0.0447));
        idRootLayout.setLayoutParams(lp);

        ImageView editPassBack = (ImageView)findViewById(R.id.passBoxImg);
        bmp = BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.bg_input_login,
                21,20);
        byte [] chunk3 = bmp.getNinePatchChunk();
        drawable = new NinePatchDrawable(bmp,chunk3,new Rect(),null);
        editPassBack.setImageDrawable(drawable);
        editPassBack.getLayoutParams().width = (int)(width*0.3547);
        editPassBack.getLayoutParams().height=(int)(height*0.1164);

        EditText editPassText=(EditText)findViewById(R.id.passBoxEdit);
        editPassText.getLayoutParams().width = (int)(width*0.3547);
        editPassText.getLayoutParams().height=(int)(height*0.1164);

        FrameLayout editPassFrame = (FrameLayout)findViewById(R.id.editPassFrame);
        lp3 = new RelativeLayout.LayoutParams(editPassFrame.getLayoutParams());
        lp3.width=(int)(width*0.3547);
        lp3.height=(int)(height*0.1164);
        lp3.setMargins(0,0, (int)(width*0.0969), (int)(height*0.1014));
        lp3.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        editPassFrame.setLayoutParams(lp3);

        TextView textViewPass = (TextView)findViewById(R.id.textViewPass);
        textViewPass.setGravity(Gravity.CENTER );


        ImageView btnCancleBack = (ImageView)findViewById(R.id.btnCancleBackground);
        bmp = BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.btn_white,
                21,20);
        byte [] chunk4 = bmp.getNinePatchChunk();
        drawable = new NinePatchDrawable(bmp,chunk4,new Rect(),null);
        btnCancleBack.setImageDrawable(drawable);
        btnCancleBack.getLayoutParams().width = (int)(width*0.1766);
        btnCancleBack.getLayoutParams().height=(int)(height*0.1493);

        FrameLayout btnCancleFrame = (FrameLayout)findViewById(R.id.btnCancle);
        lp3 = new RelativeLayout.LayoutParams(btnCancleFrame.getLayoutParams());
        lp3.width=(int)(width*0.1766);
        lp3.height=(int)(height*0.1493);
        lp3.setMargins((int)(width*0.0969),0, (int)(width*0.0227), 0);
        btnCancleFrame.setLayoutParams(lp3);

        TextView btnCancleText = (TextView)findViewById(R.id.btnCancleText);
        btnCancleText.getLayoutParams().width=(int)(width*0.1766);
        btnCancleText.getLayoutParams().height=(int)(height*0.1493);
        btnCancleText.setGravity(Gravity.CENTER );

        ImageView btnOKBack = (ImageView)findViewById(R.id.btnOKBackground);

        drawable = new NinePatchDrawable(bmp,chunk4,new Rect(),null);
        btnOKBack.setImageDrawable(drawable);
        btnOKBack.getLayoutParams().width = (int)(width*0.28125);
        btnOKBack.getLayoutParams().height=(int)(height*0.1493);

        FrameLayout btnOKFrame = (FrameLayout)findViewById(R.id.btnOK);
        lp3 = new RelativeLayout.LayoutParams(btnOKFrame.getLayoutParams());
        lp3.width=(int)(width*0.28125);
        lp3.height=(int)(height*0.1493);
        lp3.setMargins(0,0, 0, 0);
        btnOKFrame.setLayoutParams(lp3);

        TextView btnOKText = (TextView)findViewById(R.id.btnOKText);
        btnOKText.getLayoutParams().width=(int)(width*0.28125);
        btnOKText.getLayoutParams().height=(int)(height*0.1493);
        btnOKText.setGravity(Gravity.CENTER );

    }

    @Override
    public void backNavigation() {

    }
}

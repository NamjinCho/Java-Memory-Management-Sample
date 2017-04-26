package com.example.testing.myapplication.UIActivitys;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.testing.myapplication.ETC.BitmapLoader;
import com.example.testing.myapplication.R;

public class MenuActivity extends UIActivityInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity_layout);

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
        setBitmap(background,BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.bg_basic,
                width,height));
        //logo load
        //486(162,0.253),162(54,0.1125)

        setBitmap(logo,BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.logo_login01,
                getWidth(162),getHeight(54)));
        logo.getLayoutParams().width = (int)(width*0.1219);
        logo.getLayoutParams().height = (int)(height*0.1104);
        //set Logo Margin
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(logo.getLayoutParams());
        lp.setMargins((int)(width*0.0516), (int)(height*0.0657), 0, 0);
        logo.setLayoutParams(lp);

        //main frame 마진 주기

        LinearLayout mainFrame = (LinearLayout)findViewById(R.id.mainFrame);
        FrameLayout.LayoutParams lp2 = new FrameLayout.LayoutParams(mainFrame.getLayoutParams());
        lp2.setMargins((int)(width*0.0359),(int)(height*0.2627),0,0);
        mainFrame.setLayoutParams(lp2);
        //
        ImageView stateBack = (ImageView)findViewById(R.id.stateBackground);
        Bitmap bmp = BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.bg_input_login,
                getWidth(133),getHeight(100));
        byte [] chunk = bmp.getNinePatchChunk();
        NinePatchDrawable drawable = new NinePatchDrawable(bmp,chunk,new Rect(),null);
        stateBack.setImageDrawable(drawable);
        stateBack.getLayoutParams().width = (int)(width*0.2078);
        stateBack.getLayoutParams().height=(int)(height*0.2985);

        TextView stateNameTitle = (TextView)findViewById(R.id.stateNameTitle);
        TextView stateNameContents=(TextView)findViewById(R.id.stateNameContents);

        stateNameTitle.getLayoutParams().width=(int)(width*0.0984);
        stateNameTitle.getLayoutParams().height=(int)(height*0.1015);
        stateNameTitle.setGravity(Gravity.CENTER_VERTICAL);
        stateNameTitle.setPadding((int)(width*0.0203),0,0,0);

        stateNameContents.getLayoutParams().width=(int)(width*0.1094);
        stateNameContents.getLayoutParams().height=(int)(height*0.1015);
        stateNameContents.setGravity(Gravity.CENTER_VERTICAL);

        ImageView underBar1 = (ImageView)findViewById(R.id.stateUnderbar1);
        bmp = BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.main_leftform_line,
                21,20);
        byte [] chunk2 = bmp.getNinePatchChunk();
        drawable = new NinePatchDrawable(bmp,chunk2,new Rect(),null);
        underBar1.setImageDrawable(drawable);
        underBar1.getLayoutParams().width = (int)(width*0.1875);
        underBar1.getLayoutParams().height=(int)(height*0.00597);

        TextView stateLevelTitle = (TextView)findViewById(R.id.stateLevelTitle);
        TextView stateLevelContents=(TextView)findViewById(R.id.stateLevelContents);

        stateLevelTitle.getLayoutParams().width=(int)(width*0.0984);
        stateLevelTitle.getLayoutParams().height=(int)(height*0.0836);
        stateLevelTitle.setGravity(Gravity.CENTER_VERTICAL);
        stateLevelTitle.setPadding((int)(width*0.0203),0,0,0);

        ImageView levelIcon = (ImageView)findViewById(R.id.stateLevelIcon);
        setBitmap(levelIcon,BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.level_01,
                (int)(width*0.0625),(int)(height*0.1015)));

        levelIcon.getLayoutParams().width = (int)(width*0.0375);
        levelIcon.getLayoutParams().height = (int)(height*0.0715);
        levelIcon.setPadding(0,(int)(height*0.0175),0,0);

        stateLevelContents.getLayoutParams().width=(int)(width*0.0719);
        stateLevelContents.getLayoutParams().height=(int)(height*0.0836);
        stateLevelContents.setGravity(Gravity.CENTER_VERTICAL);
        stateLevelContents.setPadding((int)(width*0.0119),0,0,0);
        //0.0836
        ImageView underBar2 = (ImageView)findViewById(R.id.stateUnderbar2);
        underBar2.setImageDrawable(drawable);
        underBar2.getLayoutParams().width = (int)(width*0.1875);
        underBar2.getLayoutParams().height=(int)(height*0.00597);

        TextView stateExpTitle = (TextView)findViewById(R.id.stateExpTitle);
        TextView stateExpContents=(TextView)findViewById(R.id.stateExpContents);

        stateExpTitle.getLayoutParams().width=(int)(width*0.0984);
        stateExpTitle.getLayoutParams().height=(int)(height*0.1015);
        stateExpTitle.setGravity(Gravity.CENTER_VERTICAL);
        stateExpTitle.setPadding((int)(width*0.0203),0,0,0);

        stateExpContents.getLayoutParams().width=(int)(width*0.1094);
        stateExpContents.getLayoutParams().height=(int)(height*0.1015);
        stateExpContents.setGravity(Gravity.CENTER_VERTICAL);

        lp = new LinearLayout.LayoutParams(underBar1.getLayoutParams());
        lp.setMargins((int)(width*0.0078125),0,0,0);
        underBar1.setLayoutParams(lp);
        underBar2.setLayoutParams(lp);

        FrameLayout rankingBtnFrame = (FrameLayout)findViewById(R.id.rankingBtnFrame);

        lp = new LinearLayout.LayoutParams(rankingBtnFrame.getLayoutParams());
        lp.setMargins(0,(int)(height*0.11045),0,0);
        rankingBtnFrame.setLayoutParams(lp);

        ImageView rankingBtnBack = (ImageView)findViewById(R.id.rankingBtnBackground);
        bmp = BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.btn_white,
                getWidth(133),getHeight(50));
        byte [] chunk3 = bmp.getNinePatchChunk();
        drawable = new NinePatchDrawable(bmp,chunk3,new Rect(),null);
        rankingBtnBack.setImageDrawable(drawable);
        rankingBtnBack.getLayoutParams().width = (int)(width*0.2078);
        rankingBtnBack.getLayoutParams().height=(int)(height*0.1493);

        ImageView rankingBtnIcon = (ImageView)findViewById(R.id.rankingBtnIcon);
        setBitmap(rankingBtnIcon,BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.icon_lanking,
                (int)(width*0.046875),(int)(height*0.08955)));
        rankingBtnIcon.getLayoutParams().width = (int)(width*0.046875);
        rankingBtnIcon.getLayoutParams().height=(int)(height*0.08955);

        lp2 = new FrameLayout.LayoutParams(rankingBtnIcon.getLayoutParams());
        lp2.setMargins((int)(width*0.0359375),(int)(height*0.029875),0,0);
        rankingBtnIcon.setLayoutParams(lp2);

        TextView rankingBtnTextKo=(TextView)findViewById(R.id.rankingBtnTextKo);
        rankingBtnTextKo.setPadding((int)(width*0.0379375)+(int)(width*0.046875),(int)(height*0.034875),0,0);

        TextView rankingBtnTextEn=(TextView)findViewById(R.id.rankingBtnTextEn);
        rankingBtnTextEn.setPadding((int)(width*0.0379375)+(int)(width*0.046875),(int)(height*0.034875*2.3),0,0);

        LinearLayout boardFrame=(LinearLayout)findViewById(R.id.boardFrame);
        lp=new LinearLayout.LayoutParams(boardFrame.getLayoutParams());
        lp.setMargins(getWidth(16),0,0,0);
        boardFrame.setLayoutParams(lp);
       //quizbtn
        FrameLayout quizBtnFrame=(FrameLayout)findViewById(R.id.quizBtnFrame);
        lp=new LinearLayout.LayoutParams(quizBtnFrame.getLayoutParams());
        lp.setMargins(0,0,(int)(width*0.0125),0);
        quizBtnFrame.setLayoutParams(lp);

        ImageView quizBtnBack = (ImageView)findViewById(R.id.quizBtnBackground);
        bmp = BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.btn_white,
                getWidth(143),getHeight(187));
        byte [] chunk4 = bmp.getNinePatchChunk();
        drawable = new NinePatchDrawable(bmp,chunk4,new Rect(),null);
        quizBtnBack.setImageDrawable(drawable);

        quizBtnBack.getLayoutParams().width = (int)(width*0.2234375);
        quizBtnBack.getLayoutParams().height=(int)(height*0.5582);
        ImageView quizBtnIcon = (ImageView)findViewById(R.id.quizBtnIcon);
        setBitmap(quizBtnIcon,BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.main_img01,
                getWidth(134),getHeight(126)));

        quizBtnIcon.getLayoutParams().width=getWidth(134);
        quizBtnIcon.getLayoutParams().height=getHeight(126);
        lp2=new FrameLayout.LayoutParams(quizBtnIcon.getLayoutParams());
        lp2.setMargins((int)(width*0.00625),(int)(height*0.011940298),0,0);
        quizBtnIcon.setLayoutParams(lp2);

        TextView quizBtnTextKo =(TextView)findViewById(R.id.quizBtnTextKo);
        TextView quizBtnTextEn =(TextView)findViewById(R.id.quizBtnTextEn);

        quizBtnTextKo.getLayoutParams().width = (int)(width*0.2234375);
        quizBtnTextKo.setGravity(Gravity.CENTER_HORIZONTAL);
        quizBtnTextKo.setPadding(0,getHeight(142),0,0);

        quizBtnTextEn.getLayoutParams().width = (int)(width*0.2234375);
        quizBtnTextEn.setGravity(Gravity.CENTER_HORIZONTAL);
        quizBtnTextEn.setPadding(0,getHeight(162),0,0);
        //quizbtn finish

        //lecture btn
        FrameLayout lectureBtnFrame=(FrameLayout)findViewById(R.id.lectureBtnFrame);
        lp=new LinearLayout.LayoutParams(lectureBtnFrame.getLayoutParams());
        lp.setMargins(0,0,(int)(width*0.0125),0);
        lectureBtnFrame.setLayoutParams(lp);

        ImageView lectureBtnBack = (ImageView)findViewById(R.id.lectureBtnBackground);
        lectureBtnBack.setImageDrawable(drawable);

        lectureBtnBack.getLayoutParams().width = (int)(width*0.2234375);
        lectureBtnBack.getLayoutParams().height=(int)(height*0.5582);
        ImageView lectureBtnIcon = (ImageView)findViewById(R.id.lectureBtnIcon);
        setBitmap(lectureBtnIcon,BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.main_img02,
                getWidth(134),getHeight(126)));
        lectureBtnIcon.getLayoutParams().width=getWidth(134);
        lectureBtnIcon.getLayoutParams().height=getHeight(126);
        lp2=new FrameLayout.LayoutParams(lectureBtnIcon.getLayoutParams());
        lp2.setMargins((int)(width*0.00625),(int)(height*0.011940298),0,0);
        lectureBtnIcon.setLayoutParams(lp2);

        TextView lectureBtnTextKo =(TextView)findViewById(R.id.lectureBtnTextKo);
        TextView lectureBtnTextEn =(TextView)findViewById(R.id.lectureBtnTextEn);

        lectureBtnTextKo.getLayoutParams().width = (int)(width*0.2234375);
        lectureBtnTextKo.setGravity(Gravity.CENTER_HORIZONTAL);
        lectureBtnTextKo.setPadding(0,getHeight(142),0,0);

        lectureBtnTextEn.getLayoutParams().width = (int)(width*0.2234375);
        lectureBtnTextEn.setGravity(Gravity.CENTER_HORIZONTAL);
        lectureBtnTextEn.setPadding(0,getHeight(162),0,0);
        //lecture btn finish

        //pgn btn
        FrameLayout pgnBtnFrame=(FrameLayout)findViewById(R.id.pgnBtnFrame);
        lp=new LinearLayout.LayoutParams(pgnBtnFrame.getLayoutParams());
        lp.setMargins(0,0,(int)(width*0.0125),0);
        pgnBtnFrame.setLayoutParams(lp);

        ImageView pgnBtnBack = (ImageView)findViewById(R.id.pgnBtnBackground);
        pgnBtnBack.setImageDrawable(drawable);

        pgnBtnBack.getLayoutParams().width = (int)(width*0.2234375);
        pgnBtnBack.getLayoutParams().height=(int)(height*0.5582);
        ImageView pgnBtnIcon = (ImageView)findViewById(R.id.pgnBtnIcon);
        setBitmap(pgnBtnIcon,BitmapLoader.decodeSampledBitmapFromResource(getResources(),R.drawable.main_img03,
                getWidth(134),getHeight(126)));
        pgnBtnIcon.getLayoutParams().width=getWidth(134);
        pgnBtnIcon.getLayoutParams().height=getHeight(126);
        lp2=new FrameLayout.LayoutParams(pgnBtnIcon.getLayoutParams());
        lp2.setMargins((int)(width*0.00625),(int)(height*0.011940298),0,0);
        pgnBtnIcon.setLayoutParams(lp2);

        TextView pgnBtnTextKo =(TextView)findViewById(R.id.pgnBtnTextKo);
        TextView pgnBtnTextEn =(TextView)findViewById(R.id.pgnBtnTextEn);

        pgnBtnTextKo.getLayoutParams().width = (int)(width*0.2234375);
        pgnBtnTextKo.setGravity(Gravity.CENTER_HORIZONTAL);
        pgnBtnTextKo.setPadding(0,getHeight(142),0,0);

        pgnBtnTextEn.getLayoutParams().width = (int)(width*0.2234375);
        pgnBtnTextEn.setGravity(Gravity.CENTER_HORIZONTAL);
        pgnBtnTextEn.setPadding(0,getHeight(162),0,0);
        //pgn btn finish

        //make toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        lp2 = new FrameLayout.LayoutParams(toolbar.getLayoutParams());
        lp2.setMargins(0,getHeight(24),0,0);
        toolbar.setLayoutParams(lp2);
        toolbar.inflateMenu(R.menu.main_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if(item.getTitle().toString().startsWith("메인")){

                }
                else if (item.getTitle().toString().startsWith("갤러리"))
                {
                }else if(item.getTitle().toString().startsWith("설정"))
                {

                }else if(item.getTitle().toString().startsWith("동영상"))
                {

                }else if(item.getTitle().toString().startsWith("약도"))
                {

                }else if(item.getTitle().toString().startsWith("로그아웃")){

                }
                return false;
            }
        });
        //finish
    }

    @Override
    public void backNavigation() {

    }
}

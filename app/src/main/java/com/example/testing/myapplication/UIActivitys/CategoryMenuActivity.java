package com.example.testing.myapplication.UIActivitys;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testing.myapplication.Adapters.CategoryAdapter;
import com.example.testing.myapplication.Adapters.CategoryPGNAdapter;
import com.example.testing.myapplication.DataObjects.MainCategoryItem;
import com.example.testing.myapplication.ETC.BitmapLoader;
import com.example.testing.myapplication.R;

import java.util.ArrayList;

/**
 * Created by 조남진 on 2017-01-08.
 */
public class CategoryMenuActivity extends UIActivityInterface {
    public GridView mCategoryGridView;
    CategoryAdapter mCategoryAdaptor;
    CategoryPGNAdapter mCategoryPGNAdaptor;
    ArrayList<MainCategoryItem> mainCategoryItems;
    boolean firstOnResume = true;
    public static int category = 3;
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.categorymenu_activity_layout);
    }

    @Override
    public void init() {
        if(category==1)
            makeQuizView();
        else if(category==2)
            makeLectureView();
        else
            makePgnView();
    }

    public void makeQuizView() {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay()
                .getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels;
        int height = displaymetrics.heightPixels;
        ImageView backBtn = (ImageView) findViewById(R.id.backBtn);
        ImageView background = (ImageView) findViewById(R.id.backgroundImg);
        //Color.parseColor("#6e9aca")

        //background load
        setBitmap(background, BitmapLoader.decodeSampledBitmapFromResource(getResources(), R.drawable.bg_blue,
                width, height));
        setBitmap(backBtn, BitmapLoader.decodeSampledBitmapFromResource(getResources(), R.drawable.icon_navi05,
                getWidth(35), getHeight(37)));
        backBtn.getLayoutParams().width = getWidth(35);
        backBtn.getLayoutParams().height = getHeight(37);

        FrameLayout.LayoutParams frameLp = new FrameLayout.LayoutParams(backBtn.getLayoutParams());
        frameLp.setMargins(0, getHeight(16), 0, 0);
        backBtn.setLayoutParams(frameLp);
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        titleTextView.setText("문제보기");
        titleTextView.setPadding(getHeight(50), getHeight(16), 0, 0);
        if (firstOnResume) {
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

            frameLp = new FrameLayout.LayoutParams(toolbar.getLayoutParams());
            frameLp.setMargins(0, getHeight(16), 0, 0);
            toolbar.setLayoutParams(frameLp);
            toolbar.inflateMenu(R.menu.main_menu);
            toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {

                    if (item.getTitle().toString().startsWith("메인")) {

                    } else if (item.getTitle().toString().startsWith("갤러리")) {
                    } else if (item.getTitle().toString().startsWith("설정")) {

                    } else if (item.getTitle().toString().startsWith("동영상")) {

                    } else if (item.getTitle().toString().startsWith("약도")) {

                    } else if (item.getTitle().toString().startsWith("로그아웃")) {

                    }
                    return false;
                }
            });
            firstOnResume=false;
        }
        mCategoryGridView = (GridView) findViewById(R.id.boardGridView);
        frameLp = new FrameLayout.LayoutParams(mCategoryGridView.getLayoutParams());
        frameLp.setMargins(getWidth(17), getHeight(78), 0, 0);
        mCategoryGridView.setLayoutParams(frameLp);
        //TODO: 임시로  설정 원래는 서버로부터 파싱한 데이터가 들어와야함.
        mainCategoryItems = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            MainCategoryItem temp = new MainCategoryItem();
            temp.name = "테스트중 " + i;
            temp.position = i;
            mainCategoryItems.add(temp);
        }
        //

        mCategoryAdaptor = new CategoryAdapter(this, this.getLayoutInflater(), mainCategoryItems, this);

        mCategoryGridView.setAdapter(mCategoryAdaptor);

        mCategoryGridView.setColumnWidth(getWidth(121));
        mCategoryGridView.setNumColumns(5);
    }
    public void makeLectureView() {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay()
                .getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels;
        int height = displaymetrics.heightPixels;
        ImageView backBtn = (ImageView) findViewById(R.id.backBtn);
        ImageView background = (ImageView) findViewById(R.id.backgroundImg);
        //Color.parseColor("#6e9aca")

        //background load
        setBitmap(background, BitmapLoader.decodeSampledBitmapFromResource(getResources(), R.drawable.bg_green,
                width, height));
        setBitmap(backBtn, BitmapLoader.decodeSampledBitmapFromResource(getResources(), R.drawable.icon_navi05,
                getWidth(35), getHeight(37)));
        backBtn.getLayoutParams().width = getWidth(35);
        backBtn.getLayoutParams().height = getHeight(37);

        FrameLayout.LayoutParams frameLp = new FrameLayout.LayoutParams(backBtn.getLayoutParams());
        frameLp.setMargins(0, getHeight(16), 0, 0);
        backBtn.setLayoutParams(frameLp);
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        titleTextView.setText("강의보기");
        titleTextView.setPadding(getHeight(50), getHeight(16), 0, 0);
        if (firstOnResume) {
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

            frameLp = new FrameLayout.LayoutParams(toolbar.getLayoutParams());
            frameLp.setMargins(0, getHeight(16), 0, 0);
            toolbar.setLayoutParams(frameLp);
            toolbar.inflateMenu(R.menu.main_menu);
            toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {

                    if (item.getTitle().toString().startsWith("메인")) {

                    } else if (item.getTitle().toString().startsWith("갤러리")) {
                    } else if (item.getTitle().toString().startsWith("설정")) {

                    } else if (item.getTitle().toString().startsWith("동영상")) {

                    } else if (item.getTitle().toString().startsWith("약도")) {

                    } else if (item.getTitle().toString().startsWith("로그아웃")) {

                    }
                    return false;
                }
            });
            firstOnResume=false;
        }
        mCategoryGridView = (GridView) findViewById(R.id.boardGridView);
        frameLp = new FrameLayout.LayoutParams(mCategoryGridView.getLayoutParams());
        frameLp.setMargins(getWidth(17), getHeight(78), 0, 0);
        mCategoryGridView.setLayoutParams(frameLp);
        //TODO: 임시로  설정 원래는 서버로부터 파싱한 데이터가 들어와야함.
        mainCategoryItems = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            MainCategoryItem temp = new MainCategoryItem();
            temp.name = "테스트중 " + i;
            temp.position = i;
            mainCategoryItems.add(temp);
        }
        //

        mCategoryAdaptor = new CategoryAdapter(this, this.getLayoutInflater(), mainCategoryItems, this);

        mCategoryGridView.setAdapter(mCategoryAdaptor);

        mCategoryGridView.setColumnWidth(getWidth(121));
        mCategoryGridView.setNumColumns(5);
    }
    public void makePgnView() {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay()
                .getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels;
        int height = displaymetrics.heightPixels;
        ImageView backBtn = (ImageView) findViewById(R.id.backBtn);
        ImageView background = (ImageView) findViewById(R.id.backgroundImg);
        //Color.parseColor("#6e9aca")

        //background load
        setBitmap(background, BitmapLoader.decodeSampledBitmapFromResource(getResources(), R.drawable.bg_orange,
                width, height));
        setBitmap(backBtn, BitmapLoader.decodeSampledBitmapFromResource(getResources(), R.drawable.icon_navi05,
                getWidth(35), getHeight(37)));
        backBtn.getLayoutParams().width = getWidth(35);
        backBtn.getLayoutParams().height = getHeight(37);

        FrameLayout.LayoutParams frameLp = new FrameLayout.LayoutParams(backBtn.getLayoutParams());
        frameLp.setMargins(0, getHeight(16), 0, 0);
        backBtn.setLayoutParams(frameLp);
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        titleTextView.setText("기보보기");
        titleTextView.setPadding(getHeight(50), getHeight(16), 0, 0);
        if (firstOnResume) {
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

            frameLp = new FrameLayout.LayoutParams(toolbar.getLayoutParams());
            frameLp.setMargins(0, getHeight(16), 0, 0);
            toolbar.setLayoutParams(frameLp);
            toolbar.inflateMenu(R.menu.main_menu);
            toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {

                    if (item.getTitle().toString().startsWith("메인")) {

                    } else if (item.getTitle().toString().startsWith("갤러리")) {
                    } else if (item.getTitle().toString().startsWith("설정")) {

                    } else if (item.getTitle().toString().startsWith("동영상")) {

                    } else if (item.getTitle().toString().startsWith("약도")) {

                    } else if (item.getTitle().toString().startsWith("로그아웃")) {

                    }
                    return false;
                }
            });
            firstOnResume=false;
        }
        mCategoryGridView = (GridView) findViewById(R.id.boardGridView);
        frameLp = new FrameLayout.LayoutParams(mCategoryGridView.getLayoutParams());
        frameLp.setMargins(getWidth(14), getHeight(78), 0, 0);
        mCategoryGridView.setLayoutParams(frameLp);
        //TODO: 임시로  설정 원래는 서버로부터 파싱한 데이터가 들어와야함.
        mainCategoryItems = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            MainCategoryItem temp = new MainCategoryItem();
            temp.name = "테스트중 " + i;
            temp.position = i;
            mainCategoryItems.add(temp);
        }
        //

        mCategoryPGNAdaptor = new CategoryPGNAdapter(this, this.getLayoutInflater(), mainCategoryItems, this);

        mCategoryGridView.setAdapter(mCategoryPGNAdaptor);

        mCategoryGridView.setColumnWidth(getWidth(297));
        mCategoryGridView.setHorizontalSpacing(getHeight(9));
        mCategoryGridView.setNumColumns(2);
    }
}

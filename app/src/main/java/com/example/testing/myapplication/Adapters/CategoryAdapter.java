package com.example.testing.myapplication.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testing.myapplication.DataObjects.MainCategoryItem;
import com.example.testing.myapplication.ETC.BitmapLoader;
import com.example.testing.myapplication.R;
import com.example.testing.myapplication.UIActivitys.CategoryMenuActivity;
import com.example.testing.myapplication.UIActivitys.UIActivityInterface;

import java.util.ArrayList;

public class CategoryAdapter extends BaseAdapter {
    LayoutInflater inflater;
    private Context mContext = null;
    private ArrayList<MainCategoryItem> mListData = new ArrayList<>();
    private UIActivityInterface mActivity;
    public CategoryAdapter(Context mContext, LayoutInflater inflater, ArrayList<MainCategoryItem> listdatas ,
                           UIActivityInterface activity) {
        super();
        this.mContext = mContext;
        this.inflater = inflater;
        mListData = listdatas;
        mActivity=activity;
    }

    @Override
    public int getCount() {
        return mListData.size();
    }

    @Override
    public Object getItem(int position) {
        return mListData.get(position);
    }

    public ArrayList<MainCategoryItem> getListData() {
        return mListData;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void remove(int position) {
        mListData.remove(position);
        dataChange();
    }

    public void dataChange() {
        this.notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        convertView = inflater.inflate(R.layout.quiz_maincategory_gridview_layout, null);
        String title = mListData.get(position).name;


        //TODO: icon 뭔지 알아야함

        //지금은 임의로 설정해둠

        ImageView btnBack = (ImageView)convertView.findViewById(R.id.categoryBtnBackground);
        ImageView btnIcon = (ImageView)convertView.findViewById(R.id.categoryBtnIcon);
        TextView btnTitle = (TextView)convertView.findViewById(R.id.categoryBtnTitle);

        Bitmap bmp = BitmapLoader.decodeSampledBitmapFromResource(mActivity.getResources(),R.drawable.btn_white,
                mActivity.getWidth(110),mActivity.getHeight(155));
        byte [] chunk = bmp.getNinePatchChunk();
        NinePatchDrawable drawable = new NinePatchDrawable(bmp,chunk,new Rect(),null);
        btnBack.setImageDrawable(drawable);
        btnBack.getLayoutParams().width = mActivity.getWidth(110);
        btnBack.getLayoutParams().height=mActivity.getHeight(155);
        //todo:icon 류에따라 thumnail 바꿔야함
        if(CategoryMenuActivity.category==1) {
            btnIcon.setImageBitmap(BitmapLoader.decodeSampledBitmapFromResource(mActivity.getResources(), R.drawable.thumb_blue_01,
                    mActivity.getWidth(103), mActivity.getHeight(103)));
        }else
        {
            btnIcon.setImageBitmap(BitmapLoader.decodeSampledBitmapFromResource(mActivity.getResources(), R.drawable.thumb_green_01,
                    mActivity.getWidth(103), mActivity.getHeight(103)));
        }
        btnTitle.setText(title);

        btnIcon.getLayoutParams().width=mActivity.getWidth(103);
        btnIcon.getLayoutParams().height=mActivity.getHeight(103);

        FrameLayout.LayoutParams frameLp = new FrameLayout.LayoutParams(btnIcon.getLayoutParams());
        frameLp.setMargins(mActivity.getWidth(3),mActivity.getHeight(3),0,0);
        btnIcon.setLayoutParams(frameLp);
        //
        btnTitle.setPadding(0,mActivity.getHeight(116),0,0);
        btnTitle.getLayoutParams().width=mActivity.getWidth(110);
        btnTitle.setGravity(Gravity.CENTER_HORIZONTAL);
        //todo:관리자면 플러스 만들기

        return convertView;
    }
}

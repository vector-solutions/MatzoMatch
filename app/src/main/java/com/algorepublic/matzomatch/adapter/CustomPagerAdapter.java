package com.algorepublic.matzomatch.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.algorepublic.matzomatch.R;
import com.androidquery.AQuery;
import com.bumptech.glide.Glide;

/**
 * Created by android on 8/3/15.
 */
public class CustomPagerAdapter extends PagerAdapter {

    Context mContext;
    AQuery aq;
    LayoutInflater mLayoutInflater;
    int[] images = {R.drawable.splas1,R.drawable.splas2,R.drawable.splas3};
    ImageView image;
    public CustomPagerAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public CustomPagerAdapter() {
        super();
    }
    @Override
    public int getCount() {
            return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = mLayoutInflater.inflate(R.layout.layout_intro_pager, container, false);
        aq = new AQuery(view);
        image = (ImageView) view.findViewById(R.id.imageView);
        Glide.with(mContext).load(images[position]).into(image);
//        aq.id(R.id.imageView).image(images[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }
}

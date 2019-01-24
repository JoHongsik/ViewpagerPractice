package com.example.viewpagerpractice;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    int images[] = {R.drawable.image,R.drawable.image2,R.drawable.image3};
    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return itemFragment.newInstance(images[i]);
    }

    @Override
    public int getCount() {
        return 3;
    }
}

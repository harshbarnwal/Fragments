package com.tech4use.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

public class MyAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragment1 fragment1 = new Fragment1();
                return fragment1;
            case 1:
                Fragment2 fragment2 = new Fragment2();
                return fragment2;
            case 2:
                Fragment3 fragment3 = new Fragment3();
                return fragment3;
            case 3:
                Fragment4 fragment4 = new Fragment4();
                return fragment4;
            case 4:
                Fragment5 fragment5 = new Fragment5();
                return fragment5;
            case 5:
                Fragment6 fragment6 = new Fragment6();
                return fragment6;
            case 6:
                Fragment7 fragment7 = new Fragment7();
                return fragment7;
            case 7:
                Fragment8 fragment8 = new Fragment8();
                return fragment8;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
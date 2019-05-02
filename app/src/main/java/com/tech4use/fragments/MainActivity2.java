package com.tech4use.fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //casting the tab and frame layouts
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

        //setting the tabs to get all space
        tabLayout.addTab(tabLayout.newTab().setText("DB1"));
        tabLayout.addTab(tabLayout.newTab().setText("DB2"));
        tabLayout.addTab(tabLayout.newTab().setText("DB3"));
        tabLayout.addTab(tabLayout.newTab().setText("DB4"));
        tabLayout.addTab(tabLayout.newTab().setText("Web 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Web 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Web 3"));
        tabLayout.addTab(tabLayout.newTab().setText("Web 4"));

        final MyAdapter adapter = new MyAdapter(this,getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}

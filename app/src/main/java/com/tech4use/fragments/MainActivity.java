package com.tech4use.fragments;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    FrameLayout fram;
    Fragment fragment = null;
    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //method of fragment
        tab = (TabLayout)findViewById(R.id.tab_layout);
        fram = (FrameLayout) findViewById(R.id.frame_layout);

        //setting and adding the new Fragment
        fragment = new HomeFragment();
        //setting the default tab using FrameManager and FrameTransaction
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.frame_layout, fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();

        //setting the transaction between different fragments
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //default fragment is null

                //switching between different tabs
                switch (tab.getPosition()) {

                    case 0 :
                        fragment = new HomeFragment();
                        break;

                    case 1 :
                        fragment = new SportFragment();
                        break;

                    case 2 :
                        fragment = new MovieFragment();
                        break;
                }

                //again adding FrameManager and FrameTransaction to transact between different fragments
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame_layout, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();

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

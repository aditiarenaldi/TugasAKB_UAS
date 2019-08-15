package com.AKB_10116359_IF8.presenter;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.AKB_10116359_IF8.R;
import com.AKB_10116359_IF8.fragment.Tab1;
import com.AKB_10116359_IF8.fragment.Tab2;
import com.AKB_10116359_IF8.fragment.Tab3;

// NIM      : 10116359
// Nama     : Aditia Renaldi
// Kelas    : IF - 8
// Tanggal Pengerjaan : 12 Agustus 2019

public class viewpager extends AppCompatActivity implements Tab1.OnFragmentInteractionListener, Tab2.OnFragmentInteractionListener
    , Tab3.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText(" Profile "));
        tabLayout.addTab(tabLayout.newTab().setText(" Kontak "));
        tabLayout.addTab(tabLayout.newTab().setText(" List Friend "));
        tabLayout.addTab(tabLayout.newTab().setText(" Logout "));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final PagerAdapter adapter = new com.AKB_10116359_IF8.adapter.PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition()) ;
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

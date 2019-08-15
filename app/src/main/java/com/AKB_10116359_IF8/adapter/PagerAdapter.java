package com.AKB_10116359_IF8.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.AKB_10116359_IF8.fragment.Tab1;
import com.AKB_10116359_IF8.fragment.Tab2;
import com.AKB_10116359_IF8.fragment.Tab3;
import com.AKB_10116359_IF8.fragment.Tab4;

// NIM      : 10116359
// Nama     : Aditia Renaldi
// Kelas    : IF - 8
// Tanggal Pengerjaan : 13 Agustus 2019

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {


        switch(position)
        {

            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return  tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return  tab3;
            case 3:
                Tab4 tab4 = new Tab4();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }

}

package com.ajapps.climatecars;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int i) {
		switch (i) {
        case 0:
            //Fragement for Android Tab
            return new Android();
        case 1:
           //Fragment for Ios Tab
            return new Ios();
        case 2:
            //Fragment for Windows Tab
            return new Windows();
        case 3:
            //Fragment for Linux Tab
            return new Linux();
        case 4:
            return new Dos();

        }
		return null;

	}

	@Override
	public int getCount() {
		return 5; //No of Tabs
	}


    }
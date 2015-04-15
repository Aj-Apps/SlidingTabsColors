
package com.example.android.slidingtabscolors.tests;

import android.annotation.SuppressLint;
import android.test.ActivityInstrumentationTestCase2;

import com.ajapps.climatecars.slidingtabscolors.MainActivity;
import com.ajapps.climatecars.slidingtabscolors.SlidingTabsColorsFragment;

public class SampleTests extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mTestActivity;
    private SlidingTabsColorsFragment mTestFragment;

    @SuppressLint("NewApi")
    public SampleTests() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mTestActivity = getActivity();
        mTestFragment = (SlidingTabsColorsFragment)
            mTestActivity.getSupportFragmentManager().getFragments().get(1);
    }

    public void testPreconditions() {

        assertNotNull("mTestActivity is null", mTestActivity);
        assertNotNull("mTestFragment is null", mTestFragment);
    }


}
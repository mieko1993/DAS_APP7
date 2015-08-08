package com.team16.antenna.trend.das;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class Introduction extends ActionBarActivity {

    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_introduction);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        ViewPager mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(adapter);
    }

    public void onClickButtonStart(View view){
        Intent i=new Intent(Introduction.this,CarSelection.class);
        startActivity(i);
    }

    public class PagerAdapter extends FragmentPagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public Fragment getItem(int arg0) {
            switch (arg0) {
                case 0:
                    return new Intro1();
                case 1:
                    return new Intro2();
                case 2:
                    return new Intro3();
                default:
                    return null;
            }
        }

        public int getCount() {
            return 3;
        }

        public CharSequence getPageTitle(int position) {
            String title = null;
            switch (position) {
                case 0:
                    title = "1";
                    break;
                case 1:
                    title = "2";
                    break;
                case 2:
                    title = "3";
                    break;
            }
            return title;
        }
    }
}
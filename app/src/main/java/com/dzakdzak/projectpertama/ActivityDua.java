package com.dzakdzak.projectpertama;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ActivityDua extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
   private int[] tabIcon = {
            R.drawable.ic_food,
            R.drawable.ic_ldrink
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.vPager);
        tabLayout.setupWithViewPager(viewPager);
        setUpViewPager();
        setUpIcon();
    }
    private void setUpIcon(){
        tabLayout.getTabAt(0).setIcon(tabIcon[0]);
        tabLayout.getTabAt(1).setIcon(tabIcon[1]);
    }
    private void setUpViewPager(){
        ViewPagerAdapter vPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        vPagerAdapter.addFragment(new Makanan(), "Makanan");
        vPagerAdapter.addFragment(new Minuman(), "Minuman");
        viewPager.setAdapter(vPagerAdapter);

    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> listFragment = new ArrayList<>();
        private final List<String> listTitle = new ArrayList<>();
        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return listFragment.get(position);
        }

        @Override
        public int getCount() {
            return listFragment.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return listTitle.get(position);
        }

        public  void  addFragment(Fragment fragment, String title){
            listFragment.add(fragment);
            listTitle.add(title);
        }
    }
}

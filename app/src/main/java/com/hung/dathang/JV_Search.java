package com.hung.dathang;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.widget.TabHost;

import com.hung.adapter.MyFragmentPagerAdapter;
import com.hung.fragment.Fragment_Search_Kind;
import com.hung.fragment.Fragment_Search_Sale;
import com.hung.fragment.Fragment_Search_Trademark;

import java.util.ArrayList;
import java.util.List;


public class JV_Search extends ActionBarActivity implements ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener {
    ViewPager viewPager;
    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initViewPager();
        initTabhost();
    }

    private void initTabhost() {
        tabHost = (TabHost)findViewById(R.id.tabHostSearch);
        tabHost.setup();
        //Tab Thương hiệu
        TabHost.TabSpec spec = tabHost.newTabSpec("tab1");
        spec.setContent(R.id.tabTrademark);
        spec.setIndicator("Thương Hiệu");

        tabHost.addTab(spec);
        //Tab Loại
        spec = tabHost.newTabSpec("tab2");
        spec.setContent(R.id.tabKind);
        spec.setIndicator("Loại");
        tabHost.addTab(spec);

        //Tab Giảm giá
        spec = tabHost.newTabSpec("tab3");
        spec.setContent(R.id.tabSale);
        spec.setIndicator("Giảm giá");
        tabHost.addTab(spec);

        tabHost.setOnTabChangedListener(this);
    }


    private void initViewPager() {
        viewPager = (ViewPager)findViewById(R.id.view_paper);
        //Khai báo, thêm danh sách fragment con. Những fragment có trong đây sẽ được cài đặt chung theo Fragment cha
        List<Fragment> listFragment = new ArrayList<Fragment>();
        listFragment.add(new Fragment_Search_Trademark());
        listFragment.add(new Fragment_Search_Kind());
        listFragment.add(new Fragment_Search_Sale());
        MyFragmentPagerAdapter myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),listFragment);
        viewPager.setAdapter(myFragmentPagerAdapter);
        viewPager.setOnPageChangeListener(this);
    }
//==================================================================================================
    //====================Set Color================================================================
@SuppressLint("ResourceAsColor")
public void setTabColor(TabHost tabhost) {

    for (int i = 0; i < tabhost.getTabWidget().getChildCount(); i++)
        tabhost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#FFD700")); //unselected

    if (tabhost.getCurrentTab() == 0){
        tabhost.getTabWidget().getChildAt(tabhost.getCurrentTab()).setBackgroundColor(Color.parseColor("#8B4513"));

    }
     else
        tabhost.getTabWidget().getChildAt(tabhost.getCurrentTab()).setBackgroundColor(Color.parseColor("#8B4513"));

}
    //============================================================================================
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    setTabColor(tabHost);

    }

    @Override
    public void onPageSelected(int selectedItem) {
        tabHost.setCurrentTab(selectedItem);

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabChanged(String tabId) {
        int selectedItem = tabHost.getCurrentTab();
        viewPager.setCurrentItem(selectedItem);



    }
}

package com.example.viewpagerpractice;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();   // 화면 actionbar없애기
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);    // 화면 statebar 없애기.

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);

        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager()));
    }
}

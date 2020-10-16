package com.example.bionatal.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.bionatal.Adaptor.ViewPagerAdapter;
import com.example.bionatal.Fragment.DeliveryStatusFragment;
import com.example.bionatal.Fragment.FreeConsultationFragment;
import com.example.bionatal.Fragment.MyOfferFragment;
import com.example.bionatal.Fragment.ShopFragment;
import com.example.bionatal.Fragment.SupportFragment;
import com.example.bionatal.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends BaseActivity {
    private LinearLayout llHome;
    BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private int position = 0;
    private MenuItem prevMenuItem;
    private DeliveryStatusFragment deliveryStatusFragment;
    private FreeConsultationFragment freeConsultationFragment;
    private MyOfferFragment myOfferFragment;
    private ShopFragment shopFragment;
    private SupportFragment supportFragment;

    public void initialize() {
        llHome = (LinearLayout) inflater.inflate(R.layout.home, null);
        llBody.addView(llHome, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        viewPager = (ViewPager) llHome.findViewById(R.id.viewpager);
        bottomNavigationView = (BottomNavigationView) llHome.findViewById(R.id.bottom_navigation);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_shop:
                                txt_head.setText("Shop");
                                viewPager.setCurrentItem(0);
                                break;
                            case R.id.action_myOffer:
                                txt_head.setText("My Offers");
                                viewPager.setCurrentItem(1);
                                break;
                            case R.id.action_FreeConsultation:
                                txt_head.setText("Free Consultation");
                                viewPager.setCurrentItem(2);
                                break;
                            case R.id.action_deliveryStatus:
                                txt_head.setText("Delivery Status");
                                viewPager.setCurrentItem(3);
                                break;
                            case R.id.action_support:
                                txt_head.setText("Support");
                                viewPager.setCurrentItem(4);
                                break;

                        }
                        return false;
                    }
                });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                } else {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                Log.d("page", "onPageSelected: " + position);
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottomNavigationView.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setupViewPager(viewPager);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            position = extras.getInt("viewpager_position");
            imgAdd.setVisibility(View.VISIBLE);
            viewPager.setCurrentItem(position);
        }
    }

    private void setupViewPager(ViewPager viewPager) {
        deliveryStatusFragment = new DeliveryStatusFragment(HomeActivity.this);
        freeConsultationFragment = new FreeConsultationFragment(HomeActivity.this);
        myOfferFragment = new MyOfferFragment(HomeActivity.this);
        shopFragment = new ShopFragment(HomeActivity.this);
        supportFragment = new SupportFragment(HomeActivity.this);

        adapter.addFragment(shopFragment);
        adapter.addFragment(myOfferFragment);
        adapter.addFragment(freeConsultationFragment);
        adapter.addFragment(deliveryStatusFragment);
        adapter.addFragment(supportFragment);

        viewPager.setAdapter(adapter);
    }
}
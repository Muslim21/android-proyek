package com.example.success.asingpay;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public static final String ROOT_URL = "http://192.168.1.109/mahasiswa/";

//    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    HomeFragment homeFragment = new HomeFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content, homeFragment);
                    fragmentTransaction.commit();
                    return true;

                case R.id.navigation_dashboard:

                    TentangFragment dashboardFragment = new TentangFragment();
                    FragmentTransaction fragmentTentangTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTentangTransaction.replace(R.id.content, dashboardFragment);
                    fragmentTentangTransaction.commit();
                    return true;

                case R.id.navigation_notifications:

                    AboutFragment notificationFragment = new AboutFragment();
                    FragmentTransaction fragmentAboutfTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentAboutfTransaction.replace(R.id.content, notificationFragment);
                    fragmentAboutfTransaction.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        HomeFragment homeFragment = new HomeFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, homeFragment);
        fragmentTransaction.commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}

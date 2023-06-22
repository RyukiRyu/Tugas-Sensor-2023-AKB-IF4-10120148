package com.ryuzen.tugas10120148.activity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.ryuzen.tugas10120148.R;
import com.ryuzen.tugas10120148.databinding.ActivityMainBinding;
import com.ryuzen.tugas10120148.ui.info.InfoFragment;
import com.ryuzen.tugas10120148.ui.location.LocationFragment;
import com.ryuzen.tugas10120148.ui.profile.ProfileFragment;

/**
 * 10121048-Ariyandi Julian Pratama-IF-4
 */

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        getFragmentPage(new InfoFragment());

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                int itemId = item.getItemId();
                if (itemId == R.id.info){
                    fragment = new InfoFragment();
                } else if (itemId == R.id.lokasi) {
                    fragment = new LocationFragment();
                } else if (itemId == R.id.profile ) {
                    fragment = new ProfileFragment();
                }
                return getFragmentPage(fragment);
            }
        });
    }

    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.pageContainer, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
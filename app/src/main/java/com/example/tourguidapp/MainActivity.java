package com.example.tourguidapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager2 viewPager2 = findViewById(R.id.viewpager);

        // Set the adapter onto the view pager
        viewPager2.setAdapter(new CategoryAdapter(this));

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);


        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position){
                    case 0 : {
                        tab.setText("Attractions");
                        break;
                    }
                    case 1 : {
                        tab.setText("Restaurants");
                        break;
                    }
                    case 2 : {
                        tab.setText("Public Places");
                        break;
                    }
                    case 3 : {
                        tab.setText("Events");
                        break;
                    }
                }
            }
        }
        );
        tabLayoutMediator.attach();

    }

}

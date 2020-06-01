package com.example.tourguidapp;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class CategoryAdapter extends FragmentStateAdapter {


    public CategoryAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new PublicPlacesFragment();
            default:
                return new EventsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}

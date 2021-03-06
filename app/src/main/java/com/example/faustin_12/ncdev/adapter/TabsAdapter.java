package com.example.faustin_12.ncdev.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.faustin_12.ncdev.activity.fragment.ActualiteFragment;
import com.example.faustin_12.ncdev.activity.fragment.BoiteFragment;
import com.example.faustin_12.ncdev.activity.fragment.EvenementFragment;

/**
 * Created by FAUSTIN-12 on 17/03/2016.
 */
public class TabsAdapter extends FragmentStatePagerAdapter {
    public static int int_items = 3 ;

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return fragment with respect to Position .
     */

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new ActualiteFragment();
            case 1 : return new EvenementFragment();
            case 2 : return new BoiteFragment();
            //case 3 : return new SnackFragment();
        }
        return null;
    }

    @Override
    public int getCount() {

        return int_items;
    }
    /**
     * This method returns the title of the tab according to the position.
     */

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0 :
                return "Actualité";
            case 1 :
                return "Evénement";
            case 2 :
                return "Boites";
            //case 3 :
            //    return "Snacks";
        }
        return null;
    }
}

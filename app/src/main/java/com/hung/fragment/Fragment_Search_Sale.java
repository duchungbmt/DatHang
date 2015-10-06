package com.hung.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hung.dathang.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Search_Sale extends android.support.v4.app.Fragment {


    public Fragment_Search_Sale() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_sale, container, false);
    }


}

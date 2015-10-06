package com.hung.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.hung.dathang.JV_Product_Kfc;
import com.hung.dathang.R;

public class Fragment_Search_Trademark extends Fragment {

Integer[] imageID = {
        R.drawable.circlek_icon,
        R.drawable.h2t_icon,
        R.drawable.hung_icon,
        R.drawable.kfc_icon,
        R.drawable.logo,
        R.drawable.lotte_icon,
        R.drawable.mc_donal_icon,
        R.drawable.pizza,
        R.drawable.taopho_icon,
};
GridView gridView;
    public Fragment_Search_Trademark() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search_trademark,container,false);
            super.onCreate(savedInstanceState);
        gridView = (GridView)view.findViewById(R.id.gridViewTrademark);
        gridView.setAdapter(new ImageAdapter(view.getContext()));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==3)
                {
                    Intent go_kfc;
                    go_kfc = new Intent(getActivity(), JV_Product_Kfc.class);
                    startActivity(go_kfc);
                }
            }
        });
        return view;
    }


    private class ImageAdapter extends BaseAdapter {
        Fragment_Search_Trademark fragment_search_trademark;
        Context context;

        public ImageAdapter( Context mcontext) {

            context = mcontext;

        }

        @Override
        public int getCount() {
            return imageID.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if(convertView==null)
            {
                imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);

            }else{
                imageView = (ImageView)convertView;
            }
            imageView.setImageResource(imageID[position]);
            return imageView;
        }
    }
}

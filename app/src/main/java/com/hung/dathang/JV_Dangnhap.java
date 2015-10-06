package com.hung.dathang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;


public class JV_Dangnhap extends FragmentActivity {

    Button btn_DangKy;
    Button btn_DangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        btn_DangKy = (Button)findViewById(R.id.btn_DangNhap_dangky);
        btn_DangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh2 = new Intent(JV_Dangnhap.this, JV_Dangky.class);

                startActivity(mh2);
                overridePendingTransition(R.anim.abc_fade_in,R.anim.abc_popup_exit);
            }
        });
        btn_DangNhap = (Button)findViewById(R.id.btn_DangNhap_dangnhap);
        btn_DangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_search;
                go_search = new Intent(JV_Dangnhap.this, JV_Search.class);


                startActivity(go_search);
            }
        });
    }



}

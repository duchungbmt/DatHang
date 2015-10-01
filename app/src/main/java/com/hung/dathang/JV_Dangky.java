package com.hung.dathang;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class JV_Dangky extends ActionBarActivity {
    Button btn_TroVe;
    Button btn_DangKy;
    Spinner Quan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);
        btn_TroVe = (Button)findViewById(R.id.btn_Dangky_Trove);
        btn_TroVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh1 = new Intent(JV_Dangky.this, JV_Dangnhap.class);
                startActivity(mh1);
            }
        });
        btn_DangKy = (Button)findViewById(R.id.btn_Dangky_Dangky);
        btn_DangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh1 = new Intent(JV_Dangky.this, JV_Dangnhap.class);
                startActivity(mh1);
            }
        });
        Spinner dropdown = (Spinner)findViewById(R.id.spinner);
        String[] items = new String[]{"Quận", "Bình Thạnh", "Thủ Đức", "Gò Vấp", "Quận 1", "Quận 2"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(JV_Dangky.this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jv__dangky, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

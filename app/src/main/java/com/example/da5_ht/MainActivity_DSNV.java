package com.example.da5_ht;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity_DSNV extends AppCompatActivity {

    ListView lsView;
    TextView thongBao, thongBao1;
    SQL_NV sql_nv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dsnv);
        addControls();
    }

    private void addControls() {
        lsView = findViewById(R.id.lsView);
        sql_nv = new SQL_NV(this);
        Ob_TTNV ob = new Ob_TTNV(1000, "thuong");
        sql_nv.addOne(ob);
    }
}
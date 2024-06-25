package com.example.da5_ht;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity_TinhLuong extends AppCompatActivity {

    EditText etId, etThang, etNam, etLuong;
    Button btnTinhLuong;
    TextView soNgayLam, soGioMuon, soGioTangCa;
    SQL_CCNV sql_ccnv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tinh_luong);
        addContronls();
    }

    private void addContronls() {
        etId = findViewById(R.id.nhapId);
        etThang = findViewById(R.id.nhapThang);
        etNam = findViewById(R.id.nhapNam);
        soNgayLam = findViewById(R.id.soNgayDiLam);
        soGioTangCa = findViewById(R.id.gioTangCa);
        btnTinhLuong = findViewById(R.id.btnTinhLuong);
        etLuong = findViewById(R.id.etLuong);
        soGioMuon = findViewById(R.id.textView14);
        sql_ccnv = new SQL_CCNV(this);
        OB_CCNV ob = new OB_CCNV(1000, "thuong", "7:00", "1/12/2023");
        sql_ccnv.addOne(ob);
    }
}
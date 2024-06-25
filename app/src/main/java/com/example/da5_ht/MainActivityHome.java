package com.example.da5_ht;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivityHome extends AppCompatActivity {

    ImageView imgNhanVien, imgTinhLuong, imgSuaVaXoa, imgXemTongNgay_GioLam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
        addControls();
        btnImage();
    }
    private void btnImage() {
        imgNhanVien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityHome.this, MainActivity_DSNV.class);
                startActivity(intent);
            }
        });

        imgTinhLuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivityHome.this, MainActivity_TinhLuong.class);
                startActivity(intent1);
            }
        });
        imgXemTongNgay_GioLam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivityHome.this, MainActivity_NgayDiLamAndGio.class);
                startActivity(intent2);
            }
        });
        imgSuaVaXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivityHome.this, MainActivity_SuaXoaTT.class);
                startActivity(intent3);
            }
        });
    }

    private void addControls() {
        imgNhanVien = findViewById(R.id.imgNhanVien);
        imgTinhLuong = findViewById(R.id.imgTinhLuong);
        imgSuaVaXoa = findViewById(R.id.imgUpdateAndDekete);
        imgXemTongNgay_GioLam = findViewById(R.id.imgXemNgayGio);
    }
}
package com.example.da5_ht;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SQL_CCNV extends SQLiteOpenHelper {

    public static final String CUSTOMER_TABLE = "test";
    public static final String CUSTOMER_ID = "id";
    public static final String CUSTOMER_NAME = "name";
    public static final String CUSTOMER_THOIGIAN = "thoigian";
    public static final String CUSTOMER_NGAYTHANGNAM = "ngaythangnam";
    Context context;
    public SQL_CCNV(Context context) {
        super(context, "ccnv.db", null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + CUSTOMER_TABLE + " (" + CUSTOMER_ID + " INTEGER, "+ CUSTOMER_NAME + " TEXT, "  + CUSTOMER_THOIGIAN + " TEXT, " + CUSTOMER_NGAYTHANGNAM + " TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addOne(OB_CCNV obCC){
        SQLiteDatabase sqlCC = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(CUSTOMER_ID, obCC.getId());
        cv.put(CUSTOMER_NAME, obCC.getName());
        cv.put(CUSTOMER_THOIGIAN, obCC.getThoigian());
        cv.put(CUSTOMER_NGAYTHANGNAM, obCC.getNgaythangnam());
        long insert = sqlCC.insert(CUSTOMER_TABLE, null, cv);
        if(insert == -1){
            Toast.makeText(context, "Lỗi tạo dữ liệu", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(context, "Tạo dữ liệu thành công", Toast.LENGTH_LONG).show();
        }
    }
}

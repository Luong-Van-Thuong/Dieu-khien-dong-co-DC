package com.example.da5_ht;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SQL_NV extends SQLiteOpenHelper {

    public static final String CUSTOMER_TABLE = "Person";
    public static final String CUSTOMER_ID = "ID";
    public static final String CUSTOMER_NAME = "Name";
    Context context;
    public SQL_NV(Context context) {
        super(context, "ttnv.db", null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + CUSTOMER_TABLE + " (" + CUSTOMER_ID + " INTEGER PRIMARY KEY, " + CUSTOMER_NAME + " TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void addOne(Ob_TTNV obdsvn){
        SQLiteDatabase sqlDSNV = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(CUSTOMER_ID, obdsvn.getId());
        cv.put(CUSTOMER_NAME, obdsvn.getName());
        long insert = sqlDSNV.insert(CUSTOMER_TABLE, null, cv);
        if(insert == -1){
            Toast.makeText(context, "Lỗi tạo dữ liệu", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(context, "Tạo dữ liệu thành công", Toast.LENGTH_LONG).show();
        }
    }

    public List<Ob_TTNV> getEveryone(){
        List<Ob_TTNV> returnList = new ArrayList<>();
        String qureryString = "SELECT * FROM " + CUSTOMER_TABLE;
        SQLiteDatabase dbListDSNV = this.getWritableDatabase();
        Cursor cursor = dbListDSNV.rawQuery(qureryString, null);
        if(cursor.moveToNext()){
            do{
                int customerID = cursor.getInt(0);
                String customerName = cursor.getString(1);
                Ob_TTNV ob = new Ob_TTNV(customerID, customerName);
                returnList.add(ob);
            } while(cursor.moveToNext());
        } else {
            return returnList;
        }
        cursor.close();
        dbListDSNV.close();
        return returnList;
    }

}

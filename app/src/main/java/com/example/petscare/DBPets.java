package com.example.petscare;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBPets extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "PetsList.db";
    public static final String TABLE_NAME ="Pets";
    public static final String COL_1 = "Pet_ID";
    public static final String COL_2 = "Photo";
    public static final String COL_3 = "Name";
    public static final String COL_4 = "Age";
    public static final String COL_5 = "Description";

    public DBPets(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db =this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME+" (ID INTEGER PRIMARY KEY AUTOINCREMENT ,Photo BLOB,Name TEXT" +
            ",Age INTEGER,Description TEXT) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

}

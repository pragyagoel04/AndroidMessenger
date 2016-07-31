package com.example.pragyagoel.messenger;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pragyagoel on 7/28/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "user.db";
    public static final String TABLE_NAME = "user_table";
    public static final String FIRSTNAME =  "FIRSTNAME";
    public static final String LASTNAME =   "LASTNAME";
    public static final String USERNAME = "USERNAME";
    public static final String MOBILE = "MOBILE";
    public static final String EMAIL = "EMAIL";
    public static final String PASSWORD = "PASSWORD";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +
                "(FIRSTNAME TEXT, LASTNAME TEXT, USERNAME TEXT PRIMARY KEY, MOBILE INTEGER, EMAIL TEXT, PASSWORD TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String firstname, String lastname, String username, String mobile, String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(FIRSTNAME, firstname);
        contentValues.put(LASTNAME, lastname);
        contentValues.put(USERNAME, username);
        contentValues.put(MOBILE, mobile);
        contentValues.put(EMAIL, email);
        contentValues.put(PASSWORD, password);
        long result=db.insert(TABLE_NAME, null, contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public boolean checkuser(String username,String pass){

        return true;
    }
}

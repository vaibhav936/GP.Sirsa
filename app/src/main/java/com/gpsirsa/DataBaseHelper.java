package com.gpsirsa;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Vaibhav on 9/17/2017.
 */
/*
public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME ="Gps.db";
    public static final String Table_Name ="Noti";
    public static final String Col_1 ="result";
    public static final String Col_2 ="message";

   public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table "+Table_Name+"(result TEXT,message TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+Table_Name);
        onCreate(sqLiteDatabase);
    }
    public boolean insertData(String msg,String msg1)
    {
        SQLiteDatabase sqLiteDatabase =this.getReadableDatabase();
        ContentValues contentValues =new ContentValues();
        contentValues.put(Col_1,msg);
        contentValues.put(Col_2,msg1);
      long result =  sqLiteDatabase.insert(Table_Name,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public boolean updateProfile(String msg, String msg2)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put (Col_1,msg);
        values.put(Col_2,msg2);

        sqLiteDatabase.update(Table_Name,values,Col_1 + "=?",new String[]{msg});
       // sqLiteDatabase.update(Table_Name,values,Col_2 + "=?",new String[]{msg2});

        sqLiteDatabase.close();
        return true;
    }
}*/

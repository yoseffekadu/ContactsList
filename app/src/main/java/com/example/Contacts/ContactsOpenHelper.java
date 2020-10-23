package com.example.Contacts;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;


public class ContactsOpenHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "Contacts.db";
    public static final int DATABASE_VERSION = 1;

    public ContactsOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ContactsDatabase.PositionInfoEntry.SQL_CREATE_TABLE);
        db.execSQL(ContactsDatabase.CountryInfoEntry.SQL_CREATE_TABLE);
        db.execSQL(ContactsDatabase.RegionInfoEntry.SQL_CREATE_TABLE);
        db.execSQL(ContactsDatabase.ZoneInfoEntry.SQL_CREATE_TABLE);
        db.execSQL(ContactsDatabase.DistrictInfoEntry.SQL_CREATE_TABLE);
        db.execSQL(ContactsDatabase.ActorInfoEntry.SQL_CREATE_TABLE);

        DatabaseData data = new DatabaseData(db);
        data.insertCountries();
        data.insertRegions();
        data.insertZones();
        data.insertDistricts();
        data.insertActors();
        data.insertPositions();


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
/*
    public ArrayList<String> getRegion(){
        ArrayList<String> regionList = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        db.beginTransaction();
        String selectQuery = "SELECT * FROM " + ContactsDatabase.RegionInfoEntry.TABLE_NAME;
        Cursor cursor=db.rawQuery(selectQuery,null);
        if(cursor.moveToNext()){
            String rName = cursor.getString(cursor.getColumnIndex(ContactsDatabase.RegionInfoEntry.COLUMN_REGION_NAME));
            regionList.add(rName);

        }
        db.setTransactionSuccessful();
        db.close();
        return regionList;
    }
*/
}

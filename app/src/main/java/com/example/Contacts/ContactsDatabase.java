package com.example.Contacts;

import android.provider.BaseColumns;

public final class ContactsDatabase {
    private ContactsDatabase (){}

    public static final class PositionInfoEntry implements BaseColumns{
        public static final String TABLE_NAME = "actor_position";
        public static final String COLUMN_ACTOR_POSITION = "actor_position";


        public static final String SQL_CREATE_TABLE =
                "create table " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_ACTOR_POSITION + " TEXT NOT NULL)";
    }

    public static final class CountryInfoEntry implements BaseColumns {
        public static final String TABLE_NAME = "country_info";
        public static final String COLUMN_GEOGRAPHY_NAME = "country_name";

        public static final String SQL_CREATE_TABLE =
                "create table " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_GEOGRAPHY_NAME + " TEXT NOT NULL)";
    }

    public static final class RegionInfoEntry implements BaseColumns {
        public static final String TABLE_NAME = "region_info";
        public static final String COLUMN_REGION_NAME = "region_name";

        public static final String SQL_CREATE_TABLE =
                "create table " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_REGION_NAME + " TEXT NOT NULL)";
    }

    public static final class ZoneInfoEntry implements BaseColumns{
        public static final String TABLE_NAME = "zone_info";
        public static final String COLUMN_ZONE_NAME = "zone_name";
        public static final String COLUMN_REGION_NAME = "region_name";

        public static final String SQL_CREATE_TABLE =
                "create table " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_ZONE_NAME + " TEXT NOT NULL, " +
                        COLUMN_REGION_NAME + " TEXT NOT NULL)";
    }

    public static final class DistrictInfoEntry implements BaseColumns{
        public static final String TABLE_NAME = "district_info";
        public static final String COLUMN_DISTRICT_NAME = "district_name";
        public static final String COLUMN_ZONE_NAME = "zone_name";

        public static final String SQL_CREATE_TABLE =
                "create table " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_DISTRICT_NAME + " TEXT NOT NULL, " +
                        COLUMN_ZONE_NAME + " TEXT NOT NULL)";
    }

    public static final class ActorInfoEntry implements BaseColumns{
        public static final String TABLE_NAME = "actor_information";
        public static final String COLUMN_ACTOR_FIRST_NAME = "actor_fname";
        public static final String COLUMN_ACTOR_LAST_NAME = "actor_lname";
        public static final String COLUMN_ACTOR_INFO = "actor_info";
        public static final String COLUMN_ACTOR_PHONE = "actor_phone";
        public static final String COLUMN_ACTOR_EMAIL = "actor_email";
        public static final String COLUMN_ACTOR_POSITION = "actor_position";
        public static final String COLUMN_DISTRICT_NAME = "district_name";

        public static final String SQL_CREATE_TABLE =
                "create table " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_ACTOR_FIRST_NAME + " TEXT NOT NULL, " +
                        COLUMN_ACTOR_LAST_NAME + " TEXT NOT NULL, " +
                        COLUMN_ACTOR_INFO + " TEXT NOT NULL, " +
                        COLUMN_ACTOR_PHONE + " TEXT NOT NULL, " +
                        COLUMN_ACTOR_EMAIL + " TEXT, " +
                        COLUMN_ACTOR_POSITION + " TEXT, " +
                        COLUMN_DISTRICT_NAME + " TEXT NOT NULL)";
    }



}

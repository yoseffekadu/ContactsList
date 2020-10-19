package com.example.Contacts;

import android.provider.BaseColumns;

public final class ContactsDatabase {
    private ContactsDatabase (){}

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
        public static final String TABLE_NAME = "actor_info";
        public static final String COLUMN_ACTOR_INFO = "actor_info";
        public static final String COLUMN_ACTOR_PHONE = "actor_phone";
        public static final String COLUMN_ACTOR_EMAIL = "actor_email";
        public static final String COLUMN_DISTRICT_NAME = "district_name";

        public static final String SQL_CREATE_TABLE =
                "create table " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_ACTOR_INFO + " TEXT NOT NULL, " +
                        COLUMN_ACTOR_PHONE + " TEXT NOT NULL, " +
                        COLUMN_ACTOR_EMAIL + " TEXT, " +
                        COLUMN_DISTRICT_NAME + " TEXT NOT NULL)";
    }

}

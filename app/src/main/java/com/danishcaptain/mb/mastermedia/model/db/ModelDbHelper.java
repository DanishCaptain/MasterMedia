package com.danishcaptain.mb.mastermedia.model.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ModelDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "media.db";
    private static final int DATABASE_VERSION = 1;

    public ModelDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_MOVIE_TABLE =

                "CREATE TABLE " + MovieTable.TABLE_NAME + " (" +
                        MovieTable.COLUMN_ID + " TEXT PRIMARY KEY, " +
                        MovieTable.COLUMN_TITLE        + " TEXT NOT NULL, " +
                        MovieTable.COLUMN_IMDB_DB+ " TEXT, " +
                        MovieTable.COLUMN_YEAR        + " INTEGER, " +
                        MovieTable.COLUMN_SOURCE + " TEXT, " +
                        MovieTable.COLUMN_LOCATION  + " TEXT, " +
//                      MovieTable.COLUMN_DEAD         + " INTEGER, " +
                        MovieTable.COLUMN_CREATE_TS    + " TIMESTAMP, " +
                        MovieTable.COLUMN_UPDATE_TS    + " TIMESTAMP " +
                //" UNIQUE (" + MovieTable.COLUMN_TITLE + ") ON CONFLICT REPLACE"+
                        ");";
        db.execSQL(SQL_CREATE_MOVIE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

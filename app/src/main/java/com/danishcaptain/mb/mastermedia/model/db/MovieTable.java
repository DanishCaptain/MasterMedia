package com.danishcaptain.mb.mastermedia.model.db;

public final class MovieTable {
    public static final String TABLE_NAME = "movies";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_IMDB_DB = "imdb_id";
    public static final String COLUMN_YEAR = "year";
    public static final String COLUMN_CREATE_TS = "create_ts";
    public static final String COLUMN_UPDATE_TS = "update_ts";
    public static final String COLUMN_SOURCE = "source";
    public static final String COLUMN_LOCATION = "location";

    private MovieTable() {
    }
}

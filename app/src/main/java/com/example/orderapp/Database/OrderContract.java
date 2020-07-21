package com.example.orderapp.Database;

import android.net.Uri;
import android.provider.BaseColumns;

public class OrderContract {

    public OrderContract() {
    }

    // to understand this you have to study sqllite database but follow me anyways
    // contentauthority requires you to enter your package name
    public static final String CONTENT_AUTHORITY = "com.example.orderapp";
    public static final Uri BASE_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    // this should be similar to your table name
    public static final String PATH = "orderig";


    public static abstract class OrderEntry implements BaseColumns{

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_URI, PATH);

        public static final String TABLE_NAME = "orderig";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_QUANTITY = "quantity";
        public static final String COLUMN_PRICE = "price";
        public static final String COLUMN_HASTOPPING = "hastoppings";
        public static final String COLUMN_CREAM = "hascream";
    }
}

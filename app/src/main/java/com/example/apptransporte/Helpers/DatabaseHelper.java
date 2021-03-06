package com.example.apptransporte.Helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "street.db";
    public static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Creación de las tablas autobus, colectivo, sector
        db.execSQL("CREATE TABLE autobus(id_bus INTEGER PRIMARY KEY AUTOINCREMENT,nombre_bus TEXT,color_bus TEXT, tarifaN_bus INTEGER, tarifaE_bus INTEGER)");
        db.execSQL("CREATE TABLE colectivo(id_col INTEGER PRIMARY KEY AUTOINCREMENT, nombre_col TEXT, color_ool TEXT, tarifaN_bus INTEGER, tarifaE_bus INTEGER)");
        db.execSQL("CREATE TABLE sector(id_sec INTEGER PRIMARY KEY AUTOINCREMENT, nombre_sec TEXT)");
        db.execSQL("CREATE TABLE favorito(id_fav INTEGER PRIMARY KEY, nombre_fav TEXT)");

        //Inserción de datos en la respectivas tablas
        db.execSQL("INSERT INTO autobus VALUES(null,'Linea F','#ff0000',500,150)");
        db.execSQL("INSERT INTO colectivo VALUES(null,'Linea 13','#ff0000',700,1000)");
        db.execSQL("INSERT INTO sector VALUES(null,'Mall')");
        db.execSQL("INSERT INTO favorito VALUES(1,'Mall')");

        db.execSQL("INSERT INTO autobus VALUES(null,'Linea A','#ffff00',500,150)");
        db.execSQL("INSERT INTO colectivo VALUES(null,'Linea 14','#ffff00',700,1000)");
        db.execSQL("INSERT INTO sector VALUES(null,'Hospital')");
        db.execSQL("INSERT INTO favorito VALUES(2,'Hospital')");

        db.execSQL("INSERT INTO autobus VALUES(null,'Linea Z','#008000',500,150)");
        db.execSQL("INSERT INTO colectivo VALUES(null,'Linea 13','#008000',700,1000)");
        db.execSQL("INSERT INTO sector VALUES(null,'Centro')");

        db.execSQL("INSERT INTO autobus VALUES(null,'Linea M','#ffff00',500,150)");
        db.execSQL("INSERT INTO colectivo VALUES(null,'Linea 17','#ffff00',700,1000)");
        db.execSQL("INSERT INTO sector VALUES(null,'Parque')");

        db.execSQL("INSERT INTO autobus VALUES(null,'Linea 117','#ff0000',500,150)");
        db.execSQL("INSERT INTO colectivo VALUES(null,'Linea 32','#ff0000',700,1000)");
        db.execSQL("INSERT INTO sector VALUES(null,'Banco')");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
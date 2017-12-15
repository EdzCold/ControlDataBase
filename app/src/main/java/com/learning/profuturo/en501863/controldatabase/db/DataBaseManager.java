package com.learning.profuturo.en501863.controldatabase.db;

import android.database.sqlite.SQLiteDatabase;

import com.learning.profuturo.en501863.controldatabase.db.DataBaseContract.TablaUsuarios;
import com.learning.profuturo.en501863.controldatabase.db.DataBaseContract.TablaCuenta;
import com.learning.profuturo.en501863.controldatabase.db.DataBaseContract.TablaTransaccion;

/**
 * Created by EN501863 on 08/12/2017.
 */

public class DataBaseManager {
    private SQLiteDatabase db;

    public DataBaseManager(SQLiteDatabase db) {
        this.db = db;
    }

    public void createTables() {
        db.execSQL(SQL_CREATE_TABLE_USUARIO);
        db.execSQL(SQL_CREATE_TABLE_CUENTA);
        db.execSQL(SQL_CREATE_TABLE_TRANSACCION);
    }

    // Script to create table
    private static final String SQL_CREATE_TABLE_USUARIO = "CREATE TABLE IF NOT EXISTS " +
            TablaUsuarios.TABLE_NOMBRE + "(" +
            TablaUsuarios._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TablaUsuarios.COLUMNS_NOMBRE + "TEXT, " +
            TablaUsuarios.COLUMNS_APELLIDO + "TEXT, " +
            TablaUsuarios.COLUMNS_CONTRASENIA + "TEXT, " +
            TablaUsuarios.COLUMNS_CURP + "TEXT, " +
            TablaUsuarios.COLUMNS_GENERO + "INTEGER, " +
            TablaUsuarios.COLUMNS_USERNAME + "TEXT)";

    private static final String SQL_CREATE_TABLE_CUENTA = "CREATE TABLE IF NOT EXISTS " +
            TablaCuenta.TABLE_NOMBRE + "(" +
            TablaCuenta._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TablaCuenta.COLUMNS_CANTIDAD + "NUMERIC, " +
            TablaCuenta.COLUMNS_NUMCUENTA + "DOUBLE)";

    private static final String SQL_CREATE_TABLE_TRANSACCION = "CREATE TABLE IF NOT EXISTS " +
            TablaTransaccion.TABLA_NOMBRE + " (" +
            TablaTransaccion._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TablaTransaccion.COLUMNS_DESTINATARIO + " INTEGER, " +
            TablaTransaccion.COLUMNS_REMITENTE + " INTEGER)";


}

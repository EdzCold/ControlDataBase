package com.learning.profuturo.en501863.controldatabase.db;

import android.provider.BaseColumns;

/**
 * Created by EN501863 on 08/12/2017.
 */

public class DataBaseContract {

    public static abstract class TablaUsuarios implements BaseColumns {
        public static final String TABLE_NOMBRE = "usuario";
        public static final String COLUMNS_USERNAME = "username";
        public static final String COLUMNS_NOMBRE = "nombre";
        public static final String COLUMNS_APELLIDO = "apellido";
        public static final String COLUMNS_CONTRASENIA = "contrasenia";
        public static final String COLUMNS_GENERO = "genero";
        public static final String COLUMNS_CURP = "curp";
    }

    public static abstract class TablaCuenta implements BaseColumns {
        public static final String TABLE_NOMBRE = "cuenta";
        public static final String COLUMNS_NUMCUENTA = "num_cuenta";
        public static final String COLUMNS_CANTIDAD = "cuenta";
    }

    public static abstract class TablaTransaccion implements BaseColumns {
        public static final String TABLA_NOMBRE = "transaccion";
        public static final String COLUMNS_REMITENTE = "remitente";
        public static final String COLUMNS_DESTINATARIO  = "destinatario";
    }

}

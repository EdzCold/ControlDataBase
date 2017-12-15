package com.learning.profuturo.en501863.controldatabase.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.learning.profuturo.en501863.controldatabase.model.Usuario;
import com.learning.profuturo.en501863.controldatabase.db.DataBaseContract.TablaUsuarios;

import java.util.ArrayList;

/**
 * Created by EN501863 on 08/12/2017.
 */

public class ControlDataBaseSqlHelper extends SQLiteOpenHelper {

    private static final int VERSION_DATABASE = 1;
    private static final String NAME_DATABASE = "control_database";

    public ControlDataBaseSqlHelper(Context context) {
        super(context, NAME_DATABASE, null, VERSION_DATABASE);
    }

    public void onCreate(SQLiteDatabase db) {
        DataBaseManager managerTables = new DataBaseManager(db);
        managerTables.createTables();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long insertUsuario(Usuario usuario) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        long id = 0;
        String tabla = "usuario";
        String columnas[] = {};
        String seleccion = "_id = ?";
        String arguments[] = {String.valueOf(usuario.getId_usuario())};

        Cursor cursor = db.query(tabla, columnas, seleccion, arguments, null, null, null);

        if (cursor.getCount() == 0) {
            cv.put(TablaUsuarios.COLUMNS_NOMBRE, usuario.getNombre());
            cv.put(TablaUsuarios.COLUMNS_APELLIDO, usuario.getApellido());
            cv.put(TablaUsuarios.COLUMNS_CONTRASENIA, usuario.getContrasenia());
            cv.put(TablaUsuarios.COLUMNS_CURP, usuario.getCurp());
            cv.put(TablaUsuarios.COLUMNS_GENERO, usuario.getGenero());
            cv.put(TablaUsuarios.COLUMNS_USERNAME, usuario.getUsuario());

            id = db.insert(tabla, null, cv);
        }
        db.close();

        return id;
    }

    public Usuario consultarUsuarios(int usuario) {
        SQLiteDatabase db = this.getReadableDatabase();
        Usuario us = new Usuario();

        String[] columnas = {};
        String selection = "id_ = ?";
        String argumentos[] = {String.valueOf(usuario)};

        Cursor cursor = db.query(TablaUsuarios.TABLE_NOMBRE, columnas, selection, argumentos, null, null, null);

        if (cursor != null) {
            us.setNombre(cursor.getString(cursor.getColumnIndex("nombre")));
            us.setApellido(cursor.getString(cursor.getColumnIndex("apellido")));
            us.setContrasenia(cursor.getString(cursor.getColumnIndex("contrasenia")));
            us.setCurp(cursor.getString(cursor.getColumnIndex("curp")));
            us.setGenero(cursor.getInt(cursor.getColumnIndex("genero")));
            us.setUsuario(cursor.getString(cursor.getColumnIndex("username")));
        }

        cursor.close();
        db.close();

        return us;
    }

    public ArrayList<Usuario> consultarTodosUsuario() {
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues cv = new ContentValues();

        String[] columns = {};

        String selection;
        Cursor cursor = db.query(TablaUsuarios.TABLE_NOMBRE, columns, null, null, null, null, null);
        ArrayList<Usuario> elements = new ArrayList<>();

        while (cursor.moveToNext()) {
            Usuario usuario = new Usuario();

            usuario.setUsuario(cursor.getString(cursor.getColumnIndex("username")));
            usuario.setNombre(cursor.getString(cursor.getColumnIndex("nombre")));
            usuario.setApellido(cursor.getString(cursor.getColumnIndex("apellido")));
            usuario.setContrasenia(cursor.getString(cursor.getColumnIndex("contrasenia")));
            usuario.setGenero(cursor.getInt(cursor.getColumnIndex("genero")));
            usuario.setCurp(cursor.getString(cursor.getColumnIndex("curp")));

            elements.add(usuario);
        }

        return elements;
    }
}

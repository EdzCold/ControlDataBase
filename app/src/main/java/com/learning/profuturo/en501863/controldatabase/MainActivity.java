package com.learning.profuturo.en501863.controldatabase;

import android.content.Context;
import android.location.LocationListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.learning.profuturo.en501863.controldatabase.backup.RespaldoBaseDatos;
import com.learning.profuturo.en501863.controldatabase.db.ControlDataBaseSqlHelper;
import com.learning.profuturo.en501863.controldatabase.model.Usuario;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        ControlDataBaseSqlHelper database = new ControlDataBaseSqlHelper(context);

        ArrayList<Usuario> elementsInsert = inicializarUsuarios();
        ArrayList<Usuario> elementsConsult;

        for (Usuario usuario : elementsInsert) {
            database.insertUsuario(usuario);
        }

        elementsConsult = database.consultarTodosUsuario();

        for (Usuario usuario : elementsConsult) {

        }

        try {
            RespaldoBaseDatos.BD_backup(this);
        } catch (IOException ex) {
            ex.printStackTrace();
            Log.d("BackUpEror","----------------------");
        }

    }


    public ArrayList<Usuario> inicializarUsuarios() {
        ArrayList<Usuario> elements = new ArrayList<>();
        final Integer GENERO_MASCULINO = 1;
        final Integer GENERO_FEMENINO = 0;

        elements.add(new Usuario(null, "EN1", "Eduardo1", "AAAA", "1111", "AAAAAAAAA", GENERO_MASCULINO));
        elements.add(new Usuario(null, "EN2", "Eduardo2", "AAAA", "2222", "BBBBBBBB", GENERO_MASCULINO));
        elements.add(new Usuario(null, "EN3", "Eduardo3", "AAAA", "3333", "CCCCCCC", GENERO_MASCULINO));
        elements.add(new Usuario(null, "M1", "Monica1", "AAAA", "4444", "DDDDDDD", GENERO_FEMENINO));
        elements.add(new Usuario(null, "M1", "Monica2", "AAAA", "5555", "EEEEEEE", GENERO_FEMENINO));

        return elements;
    }


}

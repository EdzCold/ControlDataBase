package com.learning.profuturo.en501863.controldatabase.model;

import android.support.annotation.Nullable;

import com.learning.profuturo.en501863.controldatabase.db.DataBaseContract;

/**
 * Created by EN501863 on 12/12/2017.
 */

public class Usuario {

    private Integer id_usuario;
    private String usuario;
    private String nombre;
    private String apellido;
    private String contrasenia;
    private String curp;
    private Integer genero;

    public Usuario(){}

    public Usuario(@Nullable Integer id_usuario, String usuario, String nombre, String apellido, String contrasenia, String curp, Integer genero) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.curp = curp;
        this.genero = genero;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Integer getGenero() {
        return genero;
    }

    public void setGenero(Integer genero) {
        this.genero = genero;
    }
}

package com.learning.profuturo.en501863.controldatabase.model;

/**
 * Created by EN501863 on 12/12/2017.
 */

public class Cuenta {

    private Integer idCuenta;
    private Double numCuenta;
    private Double cantidad;
    private Integer idTransaccion;
    private Integer destinatario;
    private Integer remitente;


    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Double getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Double numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Integer getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Integer destinatario) {
        this.destinatario = destinatario;
    }

    public Integer getRemitente() {
        return remitente;
    }

    public void setRemitente(Integer remitente) {
        this.remitente = remitente;
    }
}

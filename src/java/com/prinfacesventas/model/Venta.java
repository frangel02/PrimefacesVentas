package com.prinfacesventas.model;

import java.sql.Date;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * Venta
 * Date: 2/23/2019
 * Time: 10:20 PM
 * Created by frodriguez on
 */
public class Venta {

    private int codigo;
    private Date fecha;
    private Persona persona;
    private double monto;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}

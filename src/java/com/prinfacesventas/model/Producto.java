package com.prinfacesventas.model;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * Producto
 * Date: 2/23/2019
 * Time: 10:19 PM
 * Created by frodriguez on
 */
public class Producto {

    private int codigo;
    private String nombre;
    private double precio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

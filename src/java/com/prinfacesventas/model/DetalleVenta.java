package com.prinfacesventas.model;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * DetalleVenta
 * Date: 2/23/2019
 * Time: 10:22 PM
 * Created by frodriguez on
 */
public class DetalleVenta {

    private int codigo;
    private Venta venta;
    private Producto producto;
    private int catidad;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCatidad() {
        return catidad;
    }

    public void setCatidad(int catidad) {
        this.catidad = catidad;
    }
}

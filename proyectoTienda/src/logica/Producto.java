/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author davi1
 */
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;
    private Proveedor proveedor;

    public Producto() {
    }

    public Producto(String codigo, String nombre, double precio, int cantidad, Proveedor proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor provedor) {
        this.proveedor = provedor;
    }

    @Override
    public String toString() {
        return "<html>" + nombre + " Cod. " + codigo + "<br>$$ " + precio + " cantidad: " + cantidad + "</html>";
    }
    
    
}

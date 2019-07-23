/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author davi1
 */
public class Venta {
    private int codVenta;
    private Date fecha;
    private Cliente cliente;
    private List<Producto> productos;

    public Venta() {
        this.fecha = new Date();
        productos = new ArrayList<Producto>();
    }

    public Venta(int codVenta, Cliente cliente, List<Producto> productos) {
        this.codVenta = codVenta;
        this.fecha = new Date();
        this.cliente = cliente;
        this.productos = productos;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public String toString (){
        return "<html>Cod. " + codVenta + " total: " + totalVenta() + "<br>Cliente: "
                + cliente.getNombre() + " " + cliente.getApellido() + " fecha: " + fecha + "</html>";
    }
    
    public String generarFactura (){
        String factura;
        double total = 0;
        factura = "<html><center>Almacen<br>Cod. venta:" + codVenta + "<br>" + fecha + "</center>"
                + "<br>Cliente: " + cliente.getNombre() + " " + cliente.getApellido();
        for ( int i=0; i<productos.size(); i++ ){
            total += productos.get(i).getPrecio() * productos.get(i).getCantidad();
            factura += "<br>" + productos.get(i).getNombre() + " [" + productos.get(i).getCantidad() + " ] [ "
                    + productos.get(i).getPrecio() + " ] [ " + productos.get(i).getPrecio() * productos.get(i).getCantidad() + " ]";
        }
        factura += "<br>Total: " + total;
        return factura;
    }
    
    public void agregarProducto ( Producto pro ){
        productos.add(pro);
    }

    
    public double totalVenta (){
        double total = 0;
        for ( int i=0; i<productos.size(); i++ ){
            total += productos.get(i).getPrecio() * productos.get(i).getCantidad();
        }
        return total;
    }
}

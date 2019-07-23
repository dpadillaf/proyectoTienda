/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davi1
 */
public class AdminTienda {
   private List<Cliente> clientes;
   private List<Producto> productos;
   private List<Venta> ventas;
   private List<Proveedor> proveedores;

    public AdminTienda() {
        this.clientes = new ArrayList<Cliente>();
        this.productos = new ArrayList<Producto>();
        this.ventas = new ArrayList<Venta>();
        this.proveedores = new ArrayList<Proveedor>();
    }

    public AdminTienda(List<Cliente> clientes, List<Producto> productos, List<Venta> ventas, List<Proveedor> proveedores) {
        this.clientes = clientes;
        this.productos = productos;
        this.ventas = ventas;
        this.proveedores = proveedores;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    
    public void agregarCliente( Cliente cli ){
        clientes.add(cli);
    }
    
    public void actualizarCliente( int i, Cliente cli ){
        clientes.set(i, cli);
    }
    
    public void borrarCliente( int i ){
        clientes.remove(i);
    }
    
    public void agregarProveedor( Proveedor pro ){
        proveedores.add(pro);
    }
    
    public void actualizarProveedor( int i, Proveedor pro ){
        proveedores.set(i, pro);
    }
    
    public void borrarProveedor( int i ){
        proveedores.remove(i);
    }
    
    public void agregarProducto( Producto pro ){
        productos.add(pro);
    }
    
    public void actualizarProducto( int i, Producto pro ){
        productos.set(i, pro);
    }
    
    public void borrarProducto( int i ){
        productos.remove(i);
    }
    
    public Proveedor validarProveedor( long doc ){
        for ( int i=0; i<proveedores.size(); i++ ){
            if ( proveedores.get(i).num_doc == doc ){
                return proveedores.get(i);
            }
        }
        return null;
    }
    
    public void agregarVenta( Venta v ){
        ventas.add( v );
    }
    
    public void borrarVenta( int i ){
        ventas.remove(i);
    }
    
    public Producto validarProducto( String cod ){
        for ( int i=0; i<productos.size(); i++ ){
            if ( productos.get(i).getCodigo().equals(cod) ){
                return productos.get(i);
            }
        }
        return null;
    }
    
    public Cliente validarCliente( long nDoc ){
        for ( int i=0; i<clientes.size(); i++ ){
            if ( clientes.get(i).getNum_doc() == nDoc ){
                return clientes.get(i);
            }
        }
        return null;
    }
    
    public void ajustarCantidadProducto( String cod, int dif ){
        for ( int i=0; i<productos.size(); i++ ){
            if ( productos.get(i).getCodigo() == cod ){
                productos.get(i).setCantidad( productos.get(i).getCantidad() - dif );
            }
        }
    }
}

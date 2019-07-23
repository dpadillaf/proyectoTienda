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
public class Proveedor extends Persona {
    private String nom_empresa;
    private String direccion;
    private long telefono;

    public Proveedor() {
    }

    public Proveedor(String nom_empresa, String direccion, long telefono, long num_doc, String nombre, String apellido) {
        super(num_doc, nombre, apellido);
        this.nom_empresa = nom_empresa;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNom_empresa() {
        return nom_empresa;
    }

    public void setNom_empresa(String nom_empresa) {
        this.nom_empresa = nom_empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "<html>" + nombre + " " + apellido + " ( " + nom_empresa + " )<br>No. doc " + num_doc + " tel: " + telefono + "</html>";
    }
}

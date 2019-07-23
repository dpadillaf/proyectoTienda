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
public abstract class Persona {
    protected long num_doc;
    protected String nombre;
    protected String apellido;

    public Persona() {
    }

    public Persona(long num_doc, String nombre, String apellido) {
        this.num_doc = num_doc;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public long getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(long num_doc) {
        this.num_doc = num_doc;
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

    @Override
    public String toString() {
        return "<html>" + nombre + " " + apellido + "<br>No. doc " + num_doc + "</html>";
    }
}

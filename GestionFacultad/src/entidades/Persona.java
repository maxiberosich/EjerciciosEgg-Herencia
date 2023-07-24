/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Max
 */
public abstract class Persona {
    
    protected String nombre;
    protected String apellido;
    protected Integer nroIdentificacion;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer nroIdentificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroIdentificacion = nroIdentificacion;
        this.estadoCivil = estadoCivil;
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

    public Integer getNroIdentificacion() {
        return nroIdentificacion;
    }

    public void setNroIdentificacion(Integer nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "PersonalDeServicio{" + "nombre=" + nombre + ", apellido=" + apellido + ", nroIdentificacion=" + nroIdentificacion + ", estadoCivil=" + estadoCivil + '}';
    }
    
}

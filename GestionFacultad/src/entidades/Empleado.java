/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Max
 */
public abstract class Empleado extends Persona {
    
    protected Integer anioIncorporacion;
    protected Integer nroDespacho;

    public Empleado() {
    }

    public Empleado(Integer anioIncorporacion, Integer nroDespacho, String nombre, String apellido, Integer nroIdentificacion, String estadoCivil) {
        super(nombre, apellido, nroIdentificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.nroDespacho = nroDespacho;
    }

    public Integer getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(Integer anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public Integer getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(Integer nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "anioIncorporacion=" + anioIncorporacion + ", nroDespacho=" + nroDespacho + '}';
    }
    
}

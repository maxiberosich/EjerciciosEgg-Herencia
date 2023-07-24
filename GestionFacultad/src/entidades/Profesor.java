/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Max
 */
public final class Profesor extends Empleado{
    
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, Integer anioIncorporacion, Integer nroDespacho, String nombre, String apellido, Integer nroIdentificacion, String estadoCivil) {
        super(anioIncorporacion, nroDespacho, nombre, apellido, nroIdentificacion, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" + "departamento=" + departamento + '}';
    }
    
    
    
}

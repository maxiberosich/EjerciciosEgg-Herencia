/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Profesor;

/**
 *
 * @author Max
 */
public final class ProfesorServicio extends EmpleadoServicio{
    
    public Profesor crearProfesor(){
        Profesor profesor = (Profesor) crearEmpleado(new Profesor());
        System.out.println("Ingrese el departamento al que pertenece el profesor");
        profesor.setDepartamento(leer.next());
        return profesor;
    }
    
    
    public void cambioDpto(Profesor profesor){
        System.out.println("Ingrese el nuevo departamento al que se asignara al profesor");
        profesor.setDepartamento(leer.next());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Empleado;
import entidades.Persona;

/**
 *
 * @author Max
 */
public class EmpleadoServicio extends PersonaServicio{
    
    public Empleado crearEmpleado(Empleado empleado){
        empleado = (Empleado) crearPersona(empleado);
        System.out.println("Ingrese el año de incorporacion a la facultad");
        empleado.setAnioIncorporacion(leer.nextInt());
        System.out.println("Ingrese el numero de despacho que se le asignara");
        empleado.setNroDespacho(leer.nextInt());
        return empleado;
    }
    
    public void reasignarDespacho(Empleado empleado){
        System.out.println("Ingrese el nuevo numero de despacho que se le asignara al empleado");
        empleado.setNroDespacho(leer.nextInt());
    }

    @Override
    public void cambiarEstadoCivil(Persona persona) {
        System.out.println("Ingrese el nuevo estado civil de la persona implicada");
        persona.setEstadoCivil(leer.next());
    }
    
}

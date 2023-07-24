/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.PersonalDeServicio;

/**
 *
 * @author Max
 */
public class PersonalDeServicioServicio extends EmpleadoServicio{
    
    public PersonalDeServicio crearPersonalDeServicio(){
        PersonalDeServicio personalDeServicio = (PersonalDeServicio) crearEmpleado(new PersonalDeServicio());
        System.out.println("ingrese la seccion que se le asignara");
        personalDeServicio.setSeccionAsignada(leer.next());
        return personalDeServicio;
    }
    
    public void trasladoSeccion(PersonalDeServicio personalDeServicio){
        System.out.println("Ingrese la nueva seccion a donde se traslada el empleado");
        personalDeServicio.setSeccionAsignada(leer.next());
    }
    
}

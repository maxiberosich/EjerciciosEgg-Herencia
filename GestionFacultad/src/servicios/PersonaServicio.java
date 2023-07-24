/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public abstract class PersonaServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    /*su nombre y apellidos, su número de 
identificación y su estado civil.*/
    public Persona crearPersona(Persona persona){
        System.out.println("Ingrese el nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        persona.setApellido(leer.next());
        System.out.println("Ingrese el numero de identificacion");
        persona.setNroIdentificacion(leer.nextInt());
        System.out.println("Ingrese el estado civil");
        persona.setEstadoCivil(leer.next());
        return persona;
    }
    
    public abstract void cambiarEstadoCivil(Persona persona);
    
}

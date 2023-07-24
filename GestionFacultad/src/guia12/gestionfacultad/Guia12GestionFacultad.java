/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12.gestionfacultad;

import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonalDeServicio;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.EstudianteServicio;
import servicios.PersonalDeServicioServicio;
import servicios.ProfesorServicio;

/**
 *
 * @author Max
 */
public class Guia12GestionFacultad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList<>();

        int opc;
        do {
            System.out.println("Ingrese la opcion que desea ingresar"
                    + "\n 1- Personal de servicio"
                    + "\n 2- Profesor"
                    + "\n 3- Estudiante"
                    + "\n 4- Salir");
            opc = leer.nextInt();
            if(opc != 4){
                switch (opc) {
                    case 1:
                        PersonalDeServicioServicio pdss = new PersonalDeServicioServicio();
                        PersonalDeServicio pds = pdss.crearPersonalDeServicio();
                        personas.add(pds);
                        break;                    
                    case 2:
                        ProfesorServicio profesorServicio = new ProfesorServicio();
                        Profesor profesor = profesorServicio.crearProfesor();
                        personas.add(profesor);
                        break;                    
                    case 3:
                        EstudianteServicio estudianteServicio = new EstudianteServicio();
                        Estudiante estudiante = estudianteServicio.crearEstudiante();
                        personas.add(estudiante);
                        break;              
                }
            }
        } while (opc != 4);

        for(Persona p: personas){
            if(p instanceof PersonalDeServicio){
                System.out.println(p.getNombre() + " trabaja en " + ((PersonalDeServicio) p).getSeccionAsignada());
            }
            
            if(p instanceof Profesor){
                System.out.println(p.getNombre() + " es un profesor de " + ((Profesor) p).getDepartamento());
            }
            
            if(p instanceof Estudiante){
                System.out.println(p.getNombre() + " esta inscripto en:");
                for(String curso: ((Estudiante) p).getCursoRegistrado()){
                    System.out.println("    *" + curso);
                }
            }
        }
        
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Estudiante;
import entidades.Persona;
import java.util.ArrayList;

/**
 *
 * @author Max
 */
public final class EstudianteServicio extends PersonaServicio{
    
    public Estudiante crearEstudiante(){
        Estudiante estudiante = (Estudiante) crearPersona(new Estudiante());        
        boolean opc;
        ArrayList<String> materias = new ArrayList<>();
        do {       
            System.out.println("Ingrese el curso que esta inscripto");
            materias.add(leer.next());
            estudiante.setCursoRegistrado(materias);
            System.out.println("Ingresar otro?");
            if(leer.next().equalsIgnoreCase("s")){
                opc = true;
            }else{
                opc=false;
            }
        } while (opc);
        return estudiante;
    }
    
    public void matriculacion(Estudiante estudiante){
        System.out.println("Ingrese la nueva materia a la que se matricula el estudiante");
        estudiante.getCursoRegistrado().add(leer.next());
       
    }

    @Override
    public void cambiarEstadoCivil(Persona persona) {
        System.out.println("Ingrese el nuevo estado civil del estudiante");
        persona.setEstadoCivil(leer.next());
    }
    
}

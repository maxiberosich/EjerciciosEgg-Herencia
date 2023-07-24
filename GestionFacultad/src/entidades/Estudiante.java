/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Max
 */
public final class Estudiante extends Persona{
    
    private ArrayList<String> cursoRegistrado;

    public Estudiante() {
    }

    public Estudiante(ArrayList<String> cursoRegistrado, String nombre, String apellido, Integer nroIdentificacion, String estadoCivil) {
        super(nombre, apellido, nroIdentificacion, estadoCivil);
        this.cursoRegistrado = cursoRegistrado;
    }

    public ArrayList<String> getCursoRegistrado() {
        return cursoRegistrado;
    }

    public void setCursoRegistrado(ArrayList<String> cursoRegistrado) {
        this.cursoRegistrado = cursoRegistrado;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cursoRegistrado=" + cursoRegistrado + '}';
    }
    
    
    
}

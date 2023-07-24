/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Max
 */
public final class PersonalDeServicio extends Empleado{
    
    private String seccionAsignada;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    public String getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    @Override
    public String toString() {
        return "PersonalDeServicio{" + "seccionAsignada=" + seccionAsignada + '}';
    }
    
       
    
}

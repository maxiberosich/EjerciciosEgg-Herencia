/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Max
 */
public class Hotel4Estrellas extends Hotel{
    
    protected String gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return "Hotel4Estrellas{" + "gimnasio=" + gimnasio 
                + ", nombreRestaurante=" + nombreRestaurante 
                + ", capacidadRestaurante=" + capacidadRestaurante + super.toString() + '}';
    }
    
    
    
}

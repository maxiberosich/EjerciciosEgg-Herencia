/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Comparator;

/**
 *
 * @author Max Cantidad de Habitaciones, Número de Camas, Cantidad de Pisos, Precio de Habitaciones.
 */
public abstract class Hotel extends Alojamiento {

    protected int cantidadHabitaciones;
    protected int numeroCamas;
    protected int cantidadPisos;
    protected double precioHabitaciones;

    public Hotel() {
        this.precioHabitaciones = 50;
    }

    public Hotel(int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public static Comparator<Hotel> compararPrecio = new Comparator<Hotel>(){
    @Override
    public int compare(Hotel h1, Hotel h2){
        Double h1p = h1.getPrecioHabitaciones(), h2p = h2.getPrecioHabitaciones();
        return h2p.compareTo(h1p);
    }
};

    @Override

    public String toString() {
        return "Hotel{" + "cantidadHabitaciones=" + cantidadHabitaciones
                + ", numeroCamas=" + numeroCamas + ", cantidadPisos="
                + cantidadPisos + ", precioHabitaciones=" + precioHabitaciones
                + super.toString() + '}';
    }

}

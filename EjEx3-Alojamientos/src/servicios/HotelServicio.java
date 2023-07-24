/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Hotel;
import java.util.Scanner;


/**
 *
 * @author Max
 */
public abstract class HotelServicio {
    protected Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    /*Los alojamientos se identifican por un nombre, una dirección, 
una localidad y un gerente encargado del lugar 
    Cantidad de Habitaciones, Número de Camas, Cantidad de 
Pisos, Precio de Habitaciones*/
    public Hotel crearHotel(Hotel hotel){
        System.out.println("Ingrese el nombre del hotel");
        hotel.setNombre(leer.next());
        System.out.println("Ingrese la direccion");
        hotel.setDireccion(leer.next());
        System.out.println("Ingrese la localidad");
        hotel.setLocalidad(leer.next());
        System.out.println("Ingrese el nombre del gerente del hotel:");
        hotel.setGerente(leer.next());
        System.out.println("Cantidad de habitaciones del hotel");
        hotel.setCantidadHabitaciones(leer.nextInt());
        System.out.println("Numero de camas por habitacion");
        hotel.setNumeroCamas(leer.nextInt());
        System.out.println("Cantidad de pisos que tiene el hotel");
        hotel.setCantidadPisos(leer.nextInt());
        System.out.println("Precio de las habitaciones");
        hotel.setPrecioHabitaciones(leer.nextDouble());
        return hotel;
    }
    
}

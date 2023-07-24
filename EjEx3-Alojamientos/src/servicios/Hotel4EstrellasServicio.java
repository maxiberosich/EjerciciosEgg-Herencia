/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Hotel4Estrellas;

/**
 *
 * @author Max
 */
public class Hotel4EstrellasServicio extends HotelServicio{
    
    public Hotel4Estrellas crearHotel4Estrellas(){
        Hotel4Estrellas h4 = (Hotel4Estrellas) crearHotel(new Hotel4Estrellas());        
        System.out.println("Nivel del gimnasio. A-B");        
        h4.setGimnasio(leer.next());
        System.out.println("Nombre del restaurante");
        h4.setNombreRestaurante(leer.next());
        System.out.println("Capacidad del restaurante");
        h4.setCapacidadRestaurante(leer.nextInt());
        precioHabitacion(h4);
        return h4;
    }
    
    public Hotel4Estrellas crearHotel4Estrellas(Hotel4Estrellas hotel){
        Hotel4Estrellas h4 = (Hotel4Estrellas) crearHotel(hotel);        
        System.out.println("Nivel del gimnasio. A-B");        
        h4.setGimnasio(leer.next());
        System.out.println("Nombre del restaurante");
        h4.setNombreRestaurante(leer.next());
        System.out.println("Capacidad del restaurante");
        h4.setCapacidadRestaurante(leer.nextInt());
        precioHabitacion(h4);
        return h4;
    }
    
    public double precioHabitacion(Hotel4Estrellas h4){
        //VALOR AGREGADO POR GIMNASIO
        if(h4.getGimnasio().equalsIgnoreCase("a")){
            h4.setPrecioHabitaciones(h4.getPrecioHabitaciones() + 50);
        }else{
            h4.setPrecioHabitaciones(h4.getPrecioHabitaciones() + 30);
        }
        
        //VALOR AGREGADO POR CAPACIDAD DEL HOTEL
        h4.setPrecioHabitaciones(h4.getPrecioHabitaciones() + h4.getCantidadHabitaciones());
        
        //VALOR AGREGADO POR CAPACIDAD RESTAURANTE
        if(h4.getCapacidadRestaurante() < 30){
            h4.setPrecioHabitaciones(h4.getPrecioHabitaciones() + 10);
        }else if(h4.getCapacidadRestaurante() >= 30 || h4.getCapacidadRestaurante() <= 50){
            h4.setPrecioHabitaciones(h4.getPrecioHabitaciones() + 30);
        }else{
            h4.setPrecioHabitaciones(h4.getPrecioHabitaciones() + 50);
        }
        
        return h4.getPrecioHabitaciones();
    }
    
}

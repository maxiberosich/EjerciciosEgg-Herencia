/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Hotel5Estrellas;

/**
 *
 * @author Max
 */
public final class Hotel5EstrellasServicio extends Hotel4EstrellasServicio{
    
   public Hotel5Estrellas crearHotel5(){
       Hotel5Estrellas h5 = (Hotel5Estrellas) crearHotel4Estrellas(new Hotel5Estrellas()) ;       
       System.out.println("Cantidad de suites");
       h5.setCantidadSuites(leer.nextInt());
       System.out.println("Cantidad de Limosinas");
       h5.setCantidadLimosinas(leer.nextInt());
       System.out.println("Salones de conferencias existentes");
       h5.setCantidadSalonesConferencia(leer.nextInt());
       precioHabitacion(h5);
       return h5;
   }
   
   private double precioHabitacion(Hotel5Estrellas h5){
       h5.setPrecioHabitaciones(super.precioHabitacion(h5));
        //VALOR AGREGADO POR CANTIDAD LIMOSINAS
        h5.setPrecioHabitaciones(h5.getPrecioHabitaciones() + (h5.getCantidadLimosinas() * 15));
        
        return h5.getPrecioHabitaciones();
   }
    
}

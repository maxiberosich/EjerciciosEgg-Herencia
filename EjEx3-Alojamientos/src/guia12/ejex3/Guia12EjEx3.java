/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejex3;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hotel;
import entidades.Hotel4Estrellas;
import entidades.Hotel5Estrellas;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.CampingServicio;
import servicios.Hotel4EstrellasServicio;
import servicios.Hotel5EstrellasServicio;
import servicios.ResidenciaServicio;

/**
 *
 * @author Max
 */
public class Guia12EjEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        ArrayList<Hotel> hoteles = new ArrayList();

        //MENU PARA EMPLEADOS
        int opc;
        do {
            System.out.println("Ingrese la opcion que desea cargar:"
                    + "\n 1- Hotel 4 Estrellas"
                    + "\n 2- Hotel 5 Estrellas"
                    + "\n 3- Camping"
                    + "\n 4- Residencia"
                    + "\n 5- Salir");
            opc = leer.nextByte();
            if (opc != 5) {
                switch (opc) {
                    case 1:
                        Hotel4EstrellasServicio hotel4EstrellasServicio = new Hotel4EstrellasServicio();
                        Hotel4Estrellas hotel4Estrellas = hotel4EstrellasServicio.crearHotel4Estrellas();
                        alojamientos.add(hotel4Estrellas);
                        hoteles.add(hotel4Estrellas);
                        break;
                    case 2:
                        Hotel5EstrellasServicio hotel5EstrellasServicio = new Hotel5EstrellasServicio();
                        Hotel5Estrellas hotel5Estrellas = hotel5EstrellasServicio.crearHotel5();
                        alojamientos.add(hotel5Estrellas);
                        hoteles.add(hotel5Estrellas);
                        break;
                    case 3:
                        CampingServicio campingServicio = new CampingServicio();
                        Camping camping = campingServicio.crearCamping();
                        alojamientos.add(camping);
                        break;
                    case 4:
                        ResidenciaServicio residenciaServicio = new ResidenciaServicio();
                        Residencia residencia = residenciaServicio.crearResidencia();
                        alojamientos.add(residencia);
                        break;                       
                }
            }
        } while (opc != 5);
        System.out.println("Todos los alojamientos fueron cargados con exito");

        //MENU PARA CLIENTES        
        do {
            System.out.println("Ingrese la opcion que desee:"
                    + "\n 1- Ver todos los alojamientos disponibles"
                    + "\n 2- Todos los hoteles disponibles, ordenados desde los mas caros a los mas baratos"
                    + "\n 3- Todos los campings con restaurantes"
                    + "\n 4- Todas las residencias que tienen descuentos para gremios"
                    + "\n 5- Salir");
            opc = leer.nextByte();
            if (opc != 5) {
                switch (opc) {
                    case 1:
                        System.out.println("Todos los alojamientos disponibles que tenemos son: \n");
                        for (Alojamiento aloja : alojamientos) {
                            if (aloja instanceof Hotel5Estrellas) {
                                System.out.println(aloja.getNombre() + " es un hotel de 5 estrellas, ubicado en "
                                        + aloja.getLocalidad() + ", el cual cuenta con un gimnasio de clasificacion "
                                        + ((Hotel4Estrellas) aloja).getGimnasio() + " y el restaurante "
                                        + ((Hotel4Estrellas) aloja).getNombreRestaurante() + " con una capacidad de "
                                        + ((Hotel4Estrellas) aloja).getCapacidadRestaurante() + " comensales"
                                        + "\nTambien dispone de " + ((Hotel5Estrellas) aloja).getCantidadLimosinas()
                                        + " limosinas disponibles en todo momento para llevarlo al lugar que desee");
                                System.out.println("El precio de cada habitacion es de " 
                                        + ((Hotel5Estrellas) aloja).getPrecioHabitaciones() + "\n");
                                continue;
                            }
                            if (aloja instanceof Hotel4Estrellas) {
                                System.out.println(aloja.getNombre() + " es un hotel 4 estrellas, ubicado en "
                                        + aloja.getLocalidad() + ", el cual cuenta con un gimnasio de clasificacion "
                                        + ((Hotel4Estrellas) aloja).getGimnasio() + " y el restaurante "
                                        + ((Hotel4Estrellas) aloja).getNombreRestaurante() + " con una capacidad de "
                                        + ((Hotel4Estrellas) aloja).getCapacidadRestaurante() + " comensales");
                                System.out.println("El precio de cada habitacion es de " + ((Hotel4Estrellas) aloja).getPrecioHabitaciones());
                                System.out.println();
                                continue;
                            }
                            if (aloja instanceof Camping) {
                                System.out.println(aloja.getNombre() + " es un camping, ubicado en "
                                        + aloja.getLocalidad() + " que tiene " + ((Camping) aloja).getCantBath()
                                        + " baños y entran en total " + ((Camping) aloja).getCapMaxCarpas() + " carpas");
                                if (((Camping) aloja).isRestaurante()) {
                                    System.out.println("Contamos con restaurante dentro del predio con las mejores comidas");
                                }
                                System.out.println("");
                            }
                            if (aloja instanceof Residencia) {
                                System.out.println(aloja.getNombre() + " es una residencia, ubicado en "
                                        + aloja.getLocalidad() + " que tiene un total de " + ((Residencia) aloja).getCantHabitaciones()
                                        + " habitaciones");
                                if (((Residencia) aloja).isDescuentoGremio()) {
                                    System.out.println("Tambien dispone de un descuento del 30% para gremios");
                                }
                                if (((Residencia) aloja).isCampoDeportivo()) {
                                    System.out.print(" y un campo deportivo para las actividades recreativas");
                                }
                                System.out.println("");
                            }
                        }
                        break;
                    case 2:
                        hoteles.sort(Hotel.compararPrecio);
                        for(Hotel h: hoteles){
                            System.out.println("El " + h.getNombre() + " cuesta " + h.getPrecioHabitaciones());
                        }
                        break;
                    case 3:
                        for(Alojamiento aloja: alojamientos){
                            if(aloja instanceof Camping){
                                if(((Camping) aloja).isRestaurante()){
                                    System.out.println("El camping " + aloja.getNombre() + " tiene restaurante");
                                }
                            }
                        }
                        break;
                    case 4:
                        for(Alojamiento aloja: alojamientos){
                            if(aloja instanceof Residencia){
                                if(((Residencia) aloja).isDescuentoGremio()){
                                    System.out.println("La residencia " + aloja.getNombre() + " tiene descuento para gremios");
                                }
                            }
                        }
                        break;
                }
            }
        } while (opc != 5);

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.AlojamientoExtraHotelero;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public abstract class AlojamientoExtraHoteleroServicio {
    
    protected Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public AlojamientoExtraHotelero crearAlojamientoExtraHotelero(AlojamientoExtraHotelero alojamiento) {
        System.out.println("Ingrese el nombre");
        alojamiento.setNombre(leer.next());
        System.out.println("Es privado. S/N");
        String opc;
        do {
            opc = leer.next();
            if (opc.equalsIgnoreCase("s")) {
                alojamiento.setPrivado(true);
            } else if (opc.equalsIgnoreCase("n")) {
                alojamiento.setPrivado(false);
            } else {
                System.out.println("Seleccion no valida, vuelva ingresar");
            }
        } while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n"));
        System.out.println("Metros cuadrados que tiene");
        alojamiento.setCantidadMetrosCuadrado(leer.nextInt());
        return alojamiento;
    }
    
}

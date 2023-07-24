/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Camping;

/**
 *
 * @author Max
 */
public class CampingServicio extends AlojamientoExtraHoteleroServicio{
    
    public Camping crearCamping(){
        Camping camping = (Camping) crearAlojamientoExtraHotelero(new Camping());
        System.out.println("Capacidad maxima de carpas que pueden ingresar");
        camping.setCapMaxCarpas(leer.nextInt());
        System.out.println("Cantidad de baños disponibles");
        camping.setCantBath(leer.nextInt());
        System.out.println("¿Tiene restaurante?. S/N");
        String opc;
        do {
            opc = leer.next();
            if (opc.equalsIgnoreCase("s")) {
                camping.setRestaurante(true);
            } else if (opc.equalsIgnoreCase("n")) {
                camping.setRestaurante(false);
            } else {
                System.out.println("Seleccion no valida, vuelva ingresar");
            }
        } while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n"));
        return camping;
    }
    
}

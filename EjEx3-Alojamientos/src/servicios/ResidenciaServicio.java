/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Residencia;

/**
 *
 * @author Max
 */
public class ResidenciaServicio extends AlojamientoExtraHoteleroServicio{
    
    public Residencia crearResidencia(){
        Residencia residencia = (Residencia) crearAlojamientoExtraHotelero(new Residencia());
        System.out.println("Cantidad de habitaciones");
        residencia.setCantHabitaciones(leer.nextInt());
        System.out.println("¿Tiene descuento para gremios?. S/N");
        String opc;
        do {
            opc = leer.next();
            if (opc.equalsIgnoreCase("s")) {
                residencia.setDescuentoGremio(true);
            } else if (opc.equalsIgnoreCase("n")) {
                residencia.setDescuentoGremio(false);
            } else {
                System.out.println("Seleccion no valida, vuelva ingresar");
            }
        } while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n"));
        System.out.println("¿Tiene campo deportivo?. S/N");
        do {
            opc = leer.next();
            if (opc.equalsIgnoreCase("s")) {
                residencia.setCampoDeportivo(true);
            } else if (opc.equalsIgnoreCase("n")) {
                residencia.setCampoDeportivo(false);
            } else {
                System.out.println("Seleccion no valida, vuelva ingresar");
            }
        } while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n"));
        return residencia;
    }
    
}

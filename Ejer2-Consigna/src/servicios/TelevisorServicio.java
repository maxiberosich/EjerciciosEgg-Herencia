/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Electrodomestico;
import entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class TelevisorServicio extends ElectrodomesticoServicio {

    public Televisor crearTelevisor() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Electrodomestico electrodomestico = this.crearElectrodomestico();

        System.out.println("Ingrese la resolucion de su televisor");
        int resolucion = leer.nextInt();
        System.out.println("Dispone de sintonizador incluido. S/N");
        String opcion = leer.next();
        boolean sintonizadorTDT;
        if (opcion.equalsIgnoreCase("s")) {
            sintonizadorTDT = true;
        } else {
            sintonizadorTDT = false;
        }
        Televisor televisor = new Televisor(resolucion, sintonizadorTDT, electrodomestico.getPrecio(), electrodomestico.getColor(), electrodomestico.getConsumoEnergetico(), electrodomestico.getPeso());

        precioFinal(televisor);

        return televisor;
    }

    private void precioFinal(Televisor televisor) {
        if (televisor.isSintonizadorTDT()) {
            televisor.setPrecio(televisor.getPrecio() + 500);
        }

        if (televisor.getResolucion() > 40) {
            televisor.setPrecio((int) (televisor.getPrecio() + (televisor.getPrecio() * 1.3)));
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Electrodomestico;
import entidad.Lavadora;
import interfaz.ILavadora;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class LavadoraIMP extends ElectrodomesticoIMP implements ILavadora {

    
    @Override
    public Lavadora crearLavadora(Electrodomestico elec) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        elec = crearElecrodomestico();
        
        System.out.println("Cuanto peso carga el lavarropas");
        int pesoCarga = leer.nextInt();
        Lavadora lav = new Lavadora(pesoCarga, elec.getColor(), elec.getConsumoEnergetico(), elec.getPeso());
        lav.setPrecio(elec.getPrecio());
        precioFinal(lav);
        
        return lav;
    }

    /*este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
    @Override
    public void precioFinal(Lavadora lav) {
        if(lav.getCarga() > 30){
            lav.setPrecio(lav.getPrecio() + 500);
        }
    }

    
}

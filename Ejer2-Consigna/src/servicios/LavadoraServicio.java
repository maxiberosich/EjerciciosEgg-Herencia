/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Electrodomestico;
import entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class LavadoraServicio extends ElectrodomesticoServicio{
    
    public Lavadora crearLavadora(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
//        Electrodomestico electrodomestico = this.crearElectrodomestico();
        
        
        
        System.out.println("Cuanta es la carga maxima que tiene la lavadora");
        int carga = leer.nextInt();
        Lavadora lavadora = new Lavadora(carga); 
        this.cargarDatosElectrodomestico(lavadora);
//        lavadora.setPrecio(electrodomestico.getPrecio());
//        lavadora.setColor(electrodomestico.getColor());
//        lavadora.setConsumoEnergetico(electrodomestico.getConsumoEnergetico());
//        lavadora.setPeso(electrodomestico.getPeso());
        precioFinal(lavadora);
        
        return lavadora;
    }
    
    
    private void precioFinal(Lavadora lavadora){
        if(lavadora.getCarga() > 30){
            lavadora.setPrecio(lavadora.getPrecio() + 500);
        }
    }
    
}

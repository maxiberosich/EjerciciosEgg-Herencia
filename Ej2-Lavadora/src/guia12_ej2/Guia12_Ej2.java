/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_ej2;

import entidad.Electrodomestico;
import entidad.Lavadora;
import interfaz.ILavadora;
import servicio.ElectrodomesticoIMP;
import servicio.LavadoraIMP;

/**
 *
 * @author Max
 */
public class Guia12_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        ElectrodomesticoIMP SerE = new ElectrodomesticoIMP();
        Electrodomestico elec = new Electrodomestico();
        
        LavadoraIMP ilav = new LavadoraIMP() ;
        
        Lavadora lav = ilav.crearLavadora(elec);
        
        //VISUALIZAR EL ELECTRODOMESTICO QUE ES LA CLASE PADRE, YA QUE NO VA A TENER ATRIBUTOS DEL HIJO
        System.out.println("Pinshi electrodomestico " + elec);
        System.out.println("-------------------------------------------");
        //LA LAVADORA VA A TENER CIERTAS CARACTERISTICAS EXTRAS
        System.out.println("Lavadora " + lav);
    }
    
}

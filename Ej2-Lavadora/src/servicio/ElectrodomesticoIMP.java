/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Electrodomestico;
import interfaz.IElectrodomestico;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class ElectrodomesticoIMP implements IElectrodomestico{

    /*comprueba que la letra es correcta, 
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el 
objeto y no será visible.*/
    @Override
    public void comprobarConsumo(char l, Electrodomestico elec) {
        String letra =String.valueOf(l);
        if(!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("b") || letra.equalsIgnoreCase("c")
                || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("d"))){
            elec.setConsumoEnergetico('f');
        }else{
            elec.setConsumoEnergetico(letra.charAt(0));
        }
    }

    /*Los colores disponibles para los electrodomésticos son 
blanco, negro, rojo, azul y gris. N*/
    @Override
    public void comprobarColor(String color, Electrodomestico elec) {
        if(!color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") 
                && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")){
            elec.setColor("blanco");
        }else{
            elec.setColor(color);
        }
    }

    /*le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    @Override
    public Electrodomestico crearElecrodomestico() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        System.out.println("Ingrese el color del electrodomestico");
        String color = leer.next();
        System.out.println("Ingrese consumo energetico");
        char consumo = leer.next().charAt(0);
        System.out.println("Ingrese el peso del producto a vender");
        float peso = leer.nextFloat();
        
        Electrodomestico elec = new Electrodomestico(color, consumo, peso);
        
        comprobarColor(color, elec);
        
        comprobarConsumo(consumo, elec);
        
        precioFinal(elec);
        
        return elec;
    }

    @Override
    public void precioFinal(Electrodomestico elec) {
        //AUMENTO DEL PRECIO DE ACUERDO AL CONSUMO
        switch (elec.getConsumoEnergetico()) {
            case 'a':
                elec.setPrecio(elec.getPrecio() + 1000);
                break;
            case 'b':
                elec.setPrecio(elec.getPrecio() + 800);
                break;
            case 'c':
                elec.setPrecio(elec.getPrecio() + 600);
                break;
            case 'd':
                elec.setPrecio(elec.getPrecio() + 500);
                break;
            case 'e':
                elec.setPrecio(elec.getPrecio() + 300);
                break;
            case 'f':
                elec.setPrecio(elec.getPrecio() + 100);
                break;
        }
        
        //AUMENTO DE PRECIO DE ACUERDO AL PESO DEL ELECTRODOMESTICO
        if(elec.getPeso()<20 && elec.getPeso() >= 1){
            elec.setPrecio(elec.getPrecio() + 100);
        }else if (elec.getPeso() < 50 && elec.getPeso() > 19){
            elec.setPrecio(elec.getPrecio() + 500);
        }else if(elec.getPeso() >= 50 && elec.getPeso() <= 79){
            elec.setPrecio(elec.getPrecio() + 800);
        }else{
            elec.setPrecio(elec.getPrecio() + 1000);
        }
    }


    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Max Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
 * sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el objeto y
 * no será visible. 
 * • Método comprobarColor(String color): comprueba que el color es correcto, y si
 * no lo es, usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
 * blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. 
 * Este método se invocará al crear el objeto y no será visible.
 */
public class ElectrodomesticoServicio  {
    
    private void comprobarConsumoEnergetico(char letra, Electrodomestico electrodomestico) {
        if (letra != 'a' && letra != 'b' && letra != 'c' && letra != 'd' && letra != 'e') {
            electrodomestico.setConsumoEnergetico('f');
            System.out.println("El consumo es f");
        }else{
            electrodomestico.setConsumoEnergetico(letra);
            System.out.println("El consumo es " + letra);
        }
    }
    
    private void comprobarColor(String color, Electrodomestico electrodomestico){
        if(color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") ||
                color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")){
            electrodomestico.setColor(color);
        }else{
            electrodomestico.setColor("blanco");
        }
    }
    
    /*etodo crearElectrodomestico(): le pide la información al usuario y llena el 
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
precio se le da un valor base de $1000*/
    public Electrodomestico crearElectrodomestico(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Electrodomestico electrodomestico = new Electrodomestico();
        
        System.out.println("Ingrese el color del electrodomestico (blanco, negro, rojo, azul, gris)");
        String coulor = leer.next();
        comprobarColor(coulor, electrodomestico);
        System.out.println("Ingrese el consumo energetico (a,b,c,d,e,f)");
        char letra = leer.next().charAt(0);
        comprobarConsumoEnergetico(letra, electrodomestico);
        System.out.println("Ingrese el peso del electrodomestico");
        int peuso = leer.nextInt();
        electrodomestico.setPeso(peuso);
        electrodomestico.setPrecio(1000);
        precioFinal(electrodomestico);
        return electrodomestico;
    }
    
    public Electrodomestico cargarDatosElectrodomestico(Electrodomestico electrodomestico){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        System.out.println("Ingrese el color del electrodomestico (blanco, negro, rojo, azul, gris)");
        String coulor = leer.next();
        comprobarColor(coulor, electrodomestico);
        System.out.println("Ingrese el consumo energetico (a,b,c,d,e,f)");
        char letra = leer.next().charAt(0);
        comprobarConsumoEnergetico(letra, electrodomestico);
        System.out.println("Ingrese el peso del electrodomestico");
        int peuso = leer.nextInt();
        electrodomestico.setPeso(peuso);
        electrodomestico.setPrecio(1000);
        precioFinal(electrodomestico);
        return electrodomestico;
    }
    
    private void precioFinal(Electrodomestico electrodomestico){
        switch(electrodomestico.getConsumoEnergetico()){
            case 'a':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 1000);
                break;
            case 'b':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 800);
                break;
            case 'c':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 600);
                break;
            case 'd':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 500);
                break;
            case 'e':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 300);
                break;
            case 'f':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 100);
                break;
        }
        if(electrodomestico.getPeso() >= 1 && electrodomestico.getPeso() <= 19){
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 100);
        }else if(electrodomestico.getPeso() >= 20 && electrodomestico.getPeso() <= 49){
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 500);
        }else if(electrodomestico.getPeso() >= 50 && electrodomestico.getPeso() <= 79){
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 800);
        }else{
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 1000);
        }           
        
    }
    
}

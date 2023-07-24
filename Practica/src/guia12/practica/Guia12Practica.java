/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.practica;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.AnimalService;
import servicios.CaballoService;
import servicios.GatoService;
import servicios.PerroService;

/**
 *
 * @author Max
 */
public class Guia12Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion del caballo
        Animal cabalio = new Caballo("Tiro al blanco", "Pastas", 25, "Equinos");
        //Creacion del servicio de caballo para llamar a sus metodos
        AnimalService caballo = new CaballoService();
        caballo.alimentacion(cabalio);

        Animal perro = new Perro("Chiquito", "croquetas", 85, "Puddle");
        AnimalService perroSer = new PerroService();
        perroSer.alimentacion(perro);

        Animal perro2 = new Perro("Firulais", "Lomito", 7, "Ovejero Aleman");
        AnimalService perro2S = new PerroService();
        perro2S.alimentacion(perro2);

        Animal gato = new Gato("Garfield", "Lasagna", 14, "Tigre");
        AnimalService gatoSer = new GatoService();
        gatoSer.alimentacion(gato);

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Animal> duenios = new ArrayList();
        int opc;

        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("Seleccione la opcion del animal que tiene");
            System.out.println(" 1- Perro" + "\n 2- Gato" + "\n 3- Caballo" + "\n 4- Salir");
            opc = leer.nextInt();
            if (opc != 4) {
                System.out.println("Ingrese el nombre");
                String nombre = leer.next();
                System.out.println("Comida que consume");
                String comida = leer.next();
                System.out.println("Edad del animal");
                int edad = leer.nextByte();
                System.out.println("Raza del animal");
                String raza = leer.next();
                switch (opc) {
                    case 1:
                        Animal animal = new Perro(nombre, comida, edad, raza);
                        duenios.add(animal);
                        break;
                    case 2:
                        Animal animal2 = new Gato(nombre, comida, edad, raza);
                        duenios.add(animal2);
                        break;
                    case 3:
                        Animal animal3 = new Caballo(nombre, comida, edad, raza);
                        duenios.add(animal3);
                        break;
                }
            }else{
                System.out.println("Gracias por utilizar nuestros servicios");
            }
        } while (opc != 4);

        for(Animal an: duenios){
            System.out.println(an);
        }

    }

}

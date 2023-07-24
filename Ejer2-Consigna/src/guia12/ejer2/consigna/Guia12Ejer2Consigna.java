/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejer2.consigna;

import entidades.Cliente;
import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ClienteServicio;
import servicios.ElectrodomesticoServicio;
import servicios.LavadoraServicio;
import servicios.TelevisorServicio;

/**
 *
 * @author Max
 */
public class Guia12Ejer2Consigna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Electrodomestico electrodomestico = new Electrodomestico();
        ElectrodomesticoServicio electrodomesticoServicio = new ElectrodomesticoServicio();

        LavadoraServicio lavadoraServicio = new LavadoraServicio();
//        Lavadora lavadora = lavadoraServicio.crearLavadora();

        TelevisorServicio televisorServicio = new TelevisorServicio();
//        Televisor televisor = televisorServicio.crearTelevisor();

        System.out.println(lavadoraServicio.crearLavadora());

//        ClienteServicio clienteServicio = new ClienteServicio();
//        ArrayList<Cliente> compradores = new ArrayList();
//
//        System.out.println("Cantidad de clientes que van a venir a comprar");
//        int cantidadClientes = leer.nextInt();
//
//        for (int i = 0; i < cantidadClientes; i++) {
//            System.out.println("Ingrese el cliente nº " + (i + 1));
//            compradores.add(clienteServicio.crearClientes());
//        }
//
//        for (Cliente cliente : compradores) {
//            System.out.println("Bienvenido " + cliente.getNombre() + " que es lo que va a comprar");
//            int opc;
//            ArrayList<Electrodomestico> compras = new ArrayList();
//            do {
//                System.out.println("  1- Lavadora \n  2- Televisor \n  3- salir");
//                opc = leer.nextByte();
//                if (opc != 3) {
////                    compras.add(new Lavadora(25, 2000, "rojo", 'a', 25));
////                    compras.add(new Lavadora(25, 8000, "azul", 'b', 55));
////                    compras.add(new Lavadora(25, 3500, "gris", 'c', 85));
////                    compras.add(new Televisor(25, true, 6850, "blanco", 'd', 5));
//                    switch (opc) {
//                        case 1:
//                            Electrodomestico lavadora = lavadoraServicio.crearLavadora();
//                            compras.add(lavadora);
//                            System.out.println("Esta lavadora le cuesta: " + lavadora.getPrecio());
//                            break;
//                        case 2:
//                            Electrodomestico televisor = televisorServicio.crearTelevisor();
//                            compras.add(televisor);
//                            System.out.println("Este televisor le cuesta: " + televisor.getPrecio());
//                            break;
//                    }
//                    int suma = 0;
//                    for (Electrodomestico e : compras) {
//                        suma += e.getPrecio();
//                    }
//                    System.out.println(cliente.getNombre()
//                            + " el gasto total de tus compras hasta el momento es: " + suma);
//                }
//
//                cliente.setCompras(compras);
//            } while (opc != 3);
//            System.out.println("Gracias por su compra\n\n");
//        }
//
//        int totalCompras = 0;
//        for (Cliente c : compradores) {
//            int suma = 0;
//            for (Electrodomestico e : c.getCompras()) {
//                suma += e.getPrecio();
//            }
//            totalCompras += suma;
//        }
//
//        System.out.println("----------------------------------------------------------------");
//        System.out.println("El total de ingresos para el negocio el dia de hoy es: " + totalCompras);

    }

}

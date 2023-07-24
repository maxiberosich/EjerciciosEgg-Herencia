/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cliente;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class ClienteServicio {
    
    public Cliente crearClientes(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Cliente cliente = new Cliente();
        System.out.println("Ingrese el nombre del cliente");
        cliente.setNombre(leer.next());
        return cliente;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Max
 */
public class Cliente {
    
    private String nombre;
    private ArrayList<Electrodomestico> compras; 

    public Cliente() {
    }

    public Cliente(String nombre, ArrayList<Electrodomestico> clientes) {
        this.nombre = nombre;
        this.compras = clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Electrodomestico> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Electrodomestico> compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", clientes=" + compras + '}';
    }

    
    
    
}

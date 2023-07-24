/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Max
 */
public abstract class AlojamientoExtraHotelero extends Alojamiento{
    
    protected boolean privado;
    protected int cantidadMetrosCuadrado;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(boolean privado, int cantidadMetrosCuadrado, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantidadMetrosCuadrado = cantidadMetrosCuadrado;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getCantidadMetrosCuadrado() {
        return cantidadMetrosCuadrado;
    }

    public void setCantidadMetrosCuadrado(int cantidadMetrosCuadrado) {
        this.cantidadMetrosCuadrado = cantidadMetrosCuadrado;
    }

    @Override
    public String toString() {
        return "AlojamientoExtraHotelero{" + "privado=" + privado 
                + ", cantidadMetrosCuadrado=" + cantidadMetrosCuadrado + super.toString() + '}';
    }
    
    
    
}

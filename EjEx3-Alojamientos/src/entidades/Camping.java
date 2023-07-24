/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Max
 * Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
disponibles y si posee o no un restaurante dentro de las instalaciones
 */
public final class Camping extends AlojamientoExtraHotelero {
    
    private int capMaxCarpas;
    private int cantBath;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int capMaxCarpas, int cantBath, boolean restaurante, boolean privado, int cantidadMetrosCuadrado, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantidadMetrosCuadrado, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBath = cantBath;
        this.restaurante = restaurante;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBath() {
        return cantBath;
    }

    public void setCantBath(int cantBath) {
        this.cantBath = cantBath;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "capMaxCarpas=" + capMaxCarpas 
                + ", cantBath=" + cantBath + ", restaurante=" + restaurante + super.toString() + '}';
    }
    
    
    
}

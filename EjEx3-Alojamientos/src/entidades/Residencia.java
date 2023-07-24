/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Max
 *  las residencias se 
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
campo deportivo
 */
public final class Residencia extends AlojamientoExtraHotelero{
    
    private int cantHabitaciones;
    private boolean descuentoGremio;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuentoGremio, boolean campoDeportivo, boolean privado, int cantidadMetrosCuadrado, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantidadMetrosCuadrado, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantHabitaciones=" + cantHabitaciones 
                + ", descuentoGremio=" + descuentoGremio + ", campoDeportivo="
                + campoDeportivo + super.toString() + '}';
    }
    
    
    
}

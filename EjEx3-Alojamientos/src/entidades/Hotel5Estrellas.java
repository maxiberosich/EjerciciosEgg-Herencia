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
public final class Hotel5Estrellas extends Hotel4Estrellas{
    
    private int cantidadSalonesConferencia;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }    

    public Hotel5Estrellas(int cantidadSalonesConferencia, int cantidadSuites,
            int cantidadLimosinas, String gimnasio, String nombreRestaurante, 
            int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas,
            int cantidadPisos, double precioHabitaciones, String nombre, 
            String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, 
                numeroCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(int cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" + "cantidadSalonesConferencia=" + cantidadSalonesConferencia
                + ", cantidadSuites=" + cantidadSuites + ", cantidadLimosinas=" 
                + cantidadLimosinas + super.toString() + '}';
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Max
 */
public class Lavadora extends Electrodomestico{
    private int carga;
    
    public Lavadora(){        
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, String color, char consumoEnergetico, float peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidad.Electrodomestico;

/**
 *
 * @author Max
 */
public interface IElectrodomestico {
    
    void comprobarConsumo(char letra, Electrodomestico elec);
    
    void comprobarColor(String color, Electrodomestico elec);
    
    Electrodomestico crearElecrodomestico();
    
    void precioFinal(Electrodomestico elec);
    
}

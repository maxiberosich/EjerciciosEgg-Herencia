/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidad.Electrodomestico;
import entidad.Lavadora;

/**
 *
 * @author Max
 */
public interface ILavadora {
    
    Lavadora crearLavadora(Electrodomestico elec);
    
    void precioFinal(Lavadora lav);
    
}

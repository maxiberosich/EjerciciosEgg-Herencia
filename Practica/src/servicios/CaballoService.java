/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Entidad.Animal;

/**
 *
 * @author Max
 */
public class CaballoService extends AnimalService{
    
    @Override
    public void alimentacion(Animal caballo){
        System.out.println("El caballo " + caballo.getNombre() + " se alimenta de " + caballo.getAlimento());
    }
    
}

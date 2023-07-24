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
public class GatoService extends AnimalService{
    @Override
    public void hacerRuido(){
        System.out.println("Meow, meow, meooooowww!!!!!!!!!!!!!");
    }
    
    @Override
    public void alimentacion(Animal gato){
        System.out.println("El gato " + gato.getNombre() + " se alimenta de " + gato.getAlimento());
    }
    
}

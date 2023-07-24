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
public abstract class AnimalService {
    public abstract void alimentacion(Animal animal);
    
    public void hacerRuido(){
        System.out.println("Hola");
    }
}

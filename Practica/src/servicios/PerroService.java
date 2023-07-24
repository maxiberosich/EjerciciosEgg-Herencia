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
public class PerroService extends AnimalService{
    @Override
    public void alimentacion(Animal Perro) {
        System.out.println("El perro " + Perro.getNombre() + " se alimenta de " + Perro.getAlimento());
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("guuauau");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Circulo;
import entidades.FormasGeometricas;
import interfaces.calculosFormas;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class CirculoServicio implements calculosFormas {
    
    public Circulo crearCirculo(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Circulo circulo = new Circulo();
        System.out.println("Ingrese el diametro del circulo a crear");
        circulo.setDiametro(leer.nextFloat());
        System.out.println("Ingrese el radio del circulo");
        circulo.setRadio(leer.nextFloat());
        return circulo;
    }

    @Override
    public void calcularArea(FormasGeometricas formaGeometrica) {
//        if(formaGeometrica instanceof Circulo){
            Circulo circulo = (Circulo) formaGeometrica;
            System.out.println("El area del circulo con radio " + circulo.getRadio() + " es de: " 
                    + (Math.PI * circulo.getRadio() *circulo.getRadio()));
//        }
    }

    @Override
    public void calcularPerimetro(FormasGeometricas formaGeometrica) {
//        if(formaGeometrica instanceof Circulo){
            Circulo circulo = (Circulo) formaGeometrica;
            System.out.println("El perimetro del circulo con diametro " + circulo.getDiametro() 
                    + " es de: " + (Math.PI * circulo.getDiametro()));
//        }
    }

    
    
}

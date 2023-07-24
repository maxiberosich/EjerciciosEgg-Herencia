/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.FormasGeometricas;
import entidades.Rectangulo;
import interfaces.calculosFormas;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class RectanguloServicio implements calculosFormas {
    
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingrese la altura del rectangulo: ");
        int altura = leer.nextInt();
        rectangulo.setAltura(altura);
        System.out.println("Ingrese la base del rectangulo: ");
        int base = leer.nextInt();
        rectangulo.setBase(base);
        return rectangulo;
    }

    @Override
    public void calcularArea(FormasGeometricas formaGeometrica) {
//        if(formaGeometrica instanceof Rectangulo){
            Rectangulo rec = (Rectangulo) formaGeometrica;
            System.out.println("El area del rectangulo de base "
                    + rec.getBase() + " y altura " 
                    + rec.getAltura() + " es de: " + (rec.getBase() * rec.getAltura()));
//        }
    }

    @Override
    public void calcularPerimetro(FormasGeometricas formaGeometrica) {
//        if(formaGeometrica instanceof Rectangulo){
            Rectangulo rec = (Rectangulo) formaGeometrica;
            System.out.println("Perimetro del rectangulo: " + ((rec.getBase() + rec.getAltura()) * 2));
//        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ej4;

import entidades.Circulo;
import entidades.FormasGeometricas;
import entidades.Rectangulo;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.CirculoServicio;
import servicios.RectanguloServicio;

/**
 *
 * @author Max
 */
public class Guia12Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        ArrayList<FormasGeometricas> formasGeometricas = new ArrayList();
        RectanguloServicio rectanguloServicio = new RectanguloServicio();
        CirculoServicio circuloServicio = new CirculoServicio();
        
        int opc;
        
        do {            
            System.out.println("Indique la forma geometrica que desea crear:" 
                    + "\n 1 - Circulo" 
                    + "\n 2 - Rectangulo" 
                    + "\n 3 - Mostrar toda la informacion de las figuras creadas"
                    + "\n 4 - Salir");
            opc = leer.nextByte();
            if(opc != 4){
                switch (opc) {
                    case 1:
                        FormasGeometricas circ = circuloServicio.crearCirculo();
                        formasGeometricas.add(circ);
                        break;
                    case 2:
                        FormasGeometricas rect = rectanguloServicio.crearRectangulo();
                        formasGeometricas.add(rect);
                        break;
                    case 3:
                        for(FormasGeometricas formas: formasGeometricas){
                            if(formas instanceof Circulo){
                                System.out.println("Circulo con radio " + ((Circulo) formas).getRadio() 
                                        + " y diametro " + ((Circulo) formas).getDiametro());
                                circuloServicio.calcularArea(formas);
                                circuloServicio.calcularPerimetro(formas);
                                System.out.println();
                            }
                            if(formas instanceof Rectangulo){
                                System.out.println("Rectangulo con base " + ((Rectangulo) formas).getBase() 
                                        + " y altura " + ((Rectangulo) formas).getAltura());
                                rectanguloServicio.calcularArea(formas);
                                rectanguloServicio.calcularPerimetro(formas);
                                System.out.println();
                            }
                        }
                        break;
                }
            }else{
                System.out.println("Gracias, vuelvas prontos");
            }
        } while (opc != 4);
        
    }
    
}

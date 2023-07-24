/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Max
 */
public class FormasGeometricas {
    
    protected double area;
    protected double perimetro;

    public FormasGeometricas() {
    }

    public FormasGeometricas(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "FormasGeometricas{" + "area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
    
}

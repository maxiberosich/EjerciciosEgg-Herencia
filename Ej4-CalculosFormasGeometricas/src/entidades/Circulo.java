/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Max
 */
public class Circulo extends FormasGeometricas{
    private float radio;
    private float diametro;

    public Circulo() {
    }

    public Circulo(float radio, float diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo(float radio, float diametro, double area, double perimetro) {
        super(area, perimetro);
        this.radio = radio;
        this.diametro = diametro;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

    
}

/*
precio, color, 
consumo energético (letras entre A y F) y peso.
 */
package entidad;

/**
 *
 * @author Max
 */
public class Electrodomestico {
    protected float precio;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;

    public Electrodomestico() {
        this.precio = 1000;
    }

    public Electrodomestico(String color, char consumoEnergetico, float peso) {
        this.precio = 1000;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
    
}

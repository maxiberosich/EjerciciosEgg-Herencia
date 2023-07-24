/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.FormasGeometricas;

/**
 *
 * @author Max
 */
public interface calculosFormas<T extends FormasGeometricas> {
    
    public void calcularArea(FormasGeometricas formaGeometrica);
    
    public void calcularPerimetro(FormasGeometricas formaGeometrica);
    
}

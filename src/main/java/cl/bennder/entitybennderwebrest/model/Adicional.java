/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author dyanez
 */
public class Adicional extends Beneficio{
    private List<String> descripciones;

    public Adicional() {
    }

    public Adicional(List<String> descripciones) {
        this.descripciones = descripciones;
    }

    public Adicional(List<String> descripciones, Integer idBeneficio, String titulo, String descripcion, Date fechaCreacion, Date fechaExpiracion, String condicion, Boolean habilitado, Integer calificacion, Integer stock, Integer idProveedor, Integer idCategoria, TipoBeneficio tipoBeneficio, Integer limiteStock, Integer visitasGeneral,boolean tieneImagenGenerica) {
        super(idBeneficio, titulo, descripcion, fechaCreacion, fechaExpiracion, condicion, habilitado, calificacion, stock, idProveedor, idCategoria, tipoBeneficio, limiteStock, visitasGeneral,tieneImagenGenerica);
        this.descripciones = descripciones;
    }

    public List<String> getDescripciones() {
        return descripciones;
    }

    public void setDescripciones(List<String> descripciones) {
        this.descripciones = descripciones;
    }
    
}

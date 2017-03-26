/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.model;

import java.io.Serializable;

/**
 *
 * @author dyanez
 */
public class BeneficioImagen implements Serializable{
    private Integer idBeneficio;
    private String nombre;
    private byte[] imagen;
    private Integer orden;//1 es considerado como imagen principal

    public BeneficioImagen() {
    }

    public BeneficioImagen(Integer idBeneficio, String nombre, byte[] imagen, Integer orden) {
        this.idBeneficio = idBeneficio;
        this.nombre = nombre;
        this.imagen = imagen;
        this.orden = orden;
    }

    public Integer getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(Integer idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "BeneficioImagen{" + "idBeneficio=" + idBeneficio + ", nombre=" + nombre + ", orden=" + orden + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.model;

/**
 * Clase que contiene imagenes que se deben escalar proporcionala  dimensiones maximas permitidas
 * @since 09-08-2017
 * @author ext_dayanez
 */
public class ImagenEscalable {
    private String nombre;
    private Integer anchoEscalable;
    private Integer altoEscalable;

    public ImagenEscalable() {
    }

    public ImagenEscalable(String nombre, Integer anchoEscalable, Integer altoEscalable) {
        this.nombre = nombre;
        this.anchoEscalable = anchoEscalable;
        this.altoEscalable = altoEscalable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnchoEscalable() {
        return anchoEscalable;
    }

    public void setAnchoEscalable(Integer anchoEscalable) {
        this.anchoEscalable = anchoEscalable;
    }

    public Integer getAltoEscalable() {
        return altoEscalable;
    }

    public void setAltoEscalable(Integer altoEscalable) {
        this.altoEscalable = altoEscalable;
    }

    @Override
    public String toString() {
        return "ImagenEscalable{" + "nombre=" + nombre + ", anchoEscalable=" + anchoEscalable + ", altoEscalable=" + altoEscalable + '}';
    }
    
    
}

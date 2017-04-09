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
    private Integer idImagen;
    private String nombre;
    private byte[] imagen;
    private Integer orden;//1 es considerado como imagen principal
    private String imagenBase64;
    private String path;

    public BeneficioImagen() {
    }

    public BeneficioImagen(Integer idBeneficio, Integer idImagen, String nombre, byte[] imagen, Integer orden, String imagenBase64, String path) {
        this.idBeneficio = idBeneficio;
        this.idImagen = idImagen;
        this.nombre = nombre;
        this.imagen = imagen;
        this.orden = orden;
        this.imagenBase64 = imagenBase64;
        this.path = path;
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

    public String getImagenBase64() {
        return imagenBase64;
    }

    public void setImagenBase64(String imagenBase64) {
        this.imagenBase64 = imagenBase64;
    }

    public Integer getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "BeneficioImagen{" + "idBeneficio=" + idBeneficio + ", idImagen=" + idImagen + ", nombre=" + nombre + ", orden=" + orden + ", path=" + path + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.model;

/**
 *
 * @author dyanez
 */
public class Proveedor {
    private Integer idProveedor;
    private String nombre;
    private Integer rut;

    public Proveedor() {
    }

    public Proveedor(Integer idProveedor, String nombre, Integer rut) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.rut = rut;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nombre=" + nombre + ", rut=" + rut + '}';
    }
    
    
}

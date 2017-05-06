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
public class SucursalProveedor{
    private Integer idSucursal;
    private Integer idDireccion;
    private String nombreSucursal;

    public SucursalProveedor(Integer idSucursal, Integer idDireccion, String nombreSucursal) {
        this.idSucursal = idSucursal;
        this.idDireccion = idDireccion;
        this.nombreSucursal = nombreSucursal;
    }
    
    public SucursalProveedor(Integer idDireccion, String nombreSucursal) {
        this.idDireccion = idDireccion;
        this.nombreSucursal = nombreSucursal;
    }

    public SucursalProveedor() {
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.model;

/**
 *
 * @author ext_dayanez
 */
public class Sucursal {
    private Integer idSucursal;
    private String nombre;
    private String horarioAtencion;
    private String oficina;
    private String passwordPOS;
    private Direccion direccion;

    public Sucursal() {
    }

    public Sucursal(Integer idSucursal, String nombre, String horarioAtencion, String oficina, String passwordPOS, Direccion direccion) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.horarioAtencion = horarioAtencion;
        this.oficina = oficina;
        this.passwordPOS = passwordPOS;
        this.direccion = direccion;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getPasswordPOS() {
        return passwordPOS;
    }

    public void setPasswordPOS(String passwordPOS) {
        this.passwordPOS = passwordPOS;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
}

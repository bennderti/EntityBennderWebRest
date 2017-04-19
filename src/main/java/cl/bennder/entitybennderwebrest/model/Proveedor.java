/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.model;

import cl.bennder.entitybennderwebrest.utils.UtilsBennder;

/**
 *
 * @author dyanez
 */
public class Proveedor {
    private Integer idProveedor;
    private String nombre;
    private Integer rut;
    private String rutDv;
    private byte[] logo;
    private String pathLogo;//path servidor
    public Proveedor() {
    }


    public Proveedor(Integer idProveedor, String nombre, Integer rut, String rutDv, String pathLogo) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.rut = rut;
        this.rutDv = rutDv;
        this.pathLogo = pathLogo;
    }

    public String getPathLogo() {
        return pathLogo;
    }

    public void setPathLogo(String pathLogo) {
        this.pathLogo = pathLogo;
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

    public String getRutDv() {
        rutDv = ""+this.rut;
        if(this.rut!=null){
            String dv = UtilsBennder.generaDigitoVerificador(""+this.rut);
            if(dv!=null && !"".equals(dv)){
               rutDv =  this.rut +"-"+dv;
            }
        }
        return rutDv;
    }

    public void setRutDv(String rutDv) {
        this.rutDv = rutDv;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nombre=" + nombre + ", rut=" + rut + ", rutDv=" + rutDv + ", pathLogo=" + pathLogo + '}';
    }
    
   
    
    
}

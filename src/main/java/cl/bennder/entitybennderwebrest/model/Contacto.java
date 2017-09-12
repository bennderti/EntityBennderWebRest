/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.model;

/**
 *
 * @author Marcos
 */
public class Contacto {
    
    private Integer idContacto;
    private Integer celular;
    private Integer fonoFijo;
    private String correo;
    
    public Contacto(){
        
    }

    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public Integer getFonoFijo() {
        return fonoFijo;
    }

    public void setFonoFijo(Integer fonoFijo) {
        this.fonoFijo = fonoFijo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Contacto{" + "idContacto=" + idContacto + ", celular=" + celular + ", fonoFijo=" + fonoFijo + ", correo=" + correo + '}';
    }

    
}

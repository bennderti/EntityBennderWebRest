/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Comuna;
import cl.bennder.entitybennderwebrest.model.Region;
import cl.bennder.entitybennderwebrest.model.Usuario;
import java.util.List;

/**
 *
 * @author ext_dayanez
 */
public class DatosPerfilResponse extends ValidacionResponse{
    private Usuario usuario;
    private List<Region> regiones;
    private List<Comuna> comunas;

    public DatosPerfilResponse() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Region> getRegiones() {
        return regiones;
    }

    public void setRegiones(List<Region> regiones) {
        this.regiones = regiones;
    }

    public List<Comuna> getComunas() {
        return comunas;
    }

    public void setComunas(List<Comuna> comunas) {
        this.comunas = comunas;
    }

    @Override
    public String toString() {
        return "DatosPerfilResponse{" + "usuario=" + usuario + ", regiones=" + regiones + ", comunas=" + comunas + '}';
    }
    
    
}

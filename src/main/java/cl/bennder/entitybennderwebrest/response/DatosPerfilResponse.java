/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Comuna;
import cl.bennder.entitybennderwebrest.model.DatosPerfil;
import cl.bennder.entitybennderwebrest.model.Region;
import cl.bennder.entitybennderwebrest.model.Validacion;
import java.util.List;

/**
 *
 * @author ext_dayanez
 */
public class DatosPerfilResponse extends ValidacionResponse{
    private DatosPerfil datosPerfil;
    private List<Region> regiones;
    private List<Comuna> comunas;

    public DatosPerfilResponse() {
    }

    public DatosPerfilResponse(DatosPerfil datosPerfil, List<Region> regiones, List<Comuna> comunas) {
        this.datosPerfil = datosPerfil;
        this.regiones = regiones;
        this.comunas = comunas;
    }

    public DatosPerfilResponse(DatosPerfil datosPerfil, List<Region> regiones, List<Comuna> comunas, Validacion validacion) {
        super(validacion);
        this.datosPerfil = datosPerfil;
        this.regiones = regiones;
        this.comunas = comunas;
    }

    public DatosPerfil getDatosPerfil() {
        return datosPerfil;
    }

    public void setDatosPerfil(DatosPerfil datosPerfil) {
        this.datosPerfil = datosPerfil;
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
        return "DatosPerfilResponse{" + "datosPerfil=" + datosPerfil + ", regiones=" + regiones + ", comunas=" + comunas + '}';
    }

    
}

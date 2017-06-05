/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Comuna;
import cl.bennder.entitybennderwebrest.model.Region;
import cl.bennder.entitybennderwebrest.model.Sucursal;
import cl.bennder.entitybennderwebrest.model.Validacion;
import java.util.List;

/**
 *
 * @author ext_dayanez
 */
public class InfoInicioSucursalResponse extends ValidacionResponse{
    private List<Region> regiones;
    private List<Comuna> comunas;
    private Sucursal sucursal;

    public InfoInicioSucursalResponse() {
    }

    public InfoInicioSucursalResponse(List<Region> regiones, List<Comuna> comunas, Sucursal sucursal) {
        this.regiones = regiones;
        this.comunas = comunas;
        this.sucursal = sucursal;
    }

    public InfoInicioSucursalResponse(List<Region> regiones, List<Comuna> comunas, Sucursal sucursal, Validacion validacion) {
        super(validacion);
        this.regiones = regiones;
        this.comunas = comunas;
        this.sucursal = sucursal;
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

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
}

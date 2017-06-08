/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Sucursal;
import cl.bennder.entitybennderwebrest.model.Validacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ext_dayanez
 */
public class SucursalesResponse extends ValidacionResponse{
    private List<Sucursal> sucursales;

    public SucursalesResponse() {
    }

    public SucursalesResponse(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public SucursalesResponse(List<Sucursal> sucursales, Validacion validacion) {
        super(validacion);
        this.sucursales = sucursales;
    }

    public List<Sucursal> getSucursales() {
        if(sucursales == null){
            sucursales = new ArrayList<>();
        }
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
    
}

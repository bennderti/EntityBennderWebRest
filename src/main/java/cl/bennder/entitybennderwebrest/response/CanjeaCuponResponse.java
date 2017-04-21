/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.SucursalProveedor;
import java.util.List;

/**
 *
 * @author dyanez
 */
public class CanjeaCuponResponse extends ValidacionResponse{
    private List<SucursalProveedor> sucursales;
    private String urlLogoProveedor;
    public CanjeaCuponResponse() {
    }

    public CanjeaCuponResponse(List<SucursalProveedor> sucursales) {
        this.sucursales = sucursales;
    }

    public List<SucursalProveedor> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<SucursalProveedor> sucursales) {
        this.sucursales = sucursales;
    }

    public String getUrlLogoProveedor() {
        return urlLogoProveedor;
    }

    public void setUrlLogoProveedor(String urlLogoProveedor) {
        this.urlLogoProveedor = urlLogoProveedor;
    }
    
    
}

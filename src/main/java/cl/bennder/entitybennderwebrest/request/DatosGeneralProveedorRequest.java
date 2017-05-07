/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.model.Proveedor;

import java.io.Serializable;

/**
 *
 * @author dyanez
 */
public class DatosGeneralProveedorRequest extends UserRequest {
    private Proveedor proveedor;

    public DatosGeneralProveedorRequest() {
    }

    public DatosGeneralProveedorRequest(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public DatosGeneralProveedorRequest(String token, Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "DatosGeneralProveedorRequest{" + "proveedor=" + proveedor + '}';
    }
    
}

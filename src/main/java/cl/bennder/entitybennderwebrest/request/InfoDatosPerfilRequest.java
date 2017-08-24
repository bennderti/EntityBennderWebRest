/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.model.DatosPerfil;

/**
 *
 * @author ext_dayanez
 */
public class InfoDatosPerfilRequest extends UserRequest{
    private DatosPerfil datosPerfil;

    public InfoDatosPerfilRequest() {
    }

    public InfoDatosPerfilRequest(DatosPerfil datosPerfil) {
        this.datosPerfil = datosPerfil;
    }

    public DatosPerfil getDatosPerfil() {
        return datosPerfil;
    }

    public void setDatosPerfil(DatosPerfil datosPerfil) {
        this.datosPerfil = datosPerfil;
    }
    
}

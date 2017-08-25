/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.model.Usuario;


/**
 *
 * @author ext_dayanez
 */
public class InfoDatosPerfilRequest extends UserRequest{
    private Usuario usuario;
    private String tenantId;

    public InfoDatosPerfilRequest() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "InfoDatosPerfilRequest{" + "usuario=" + usuario + ", tenantId=" + tenantId + '}';
    }

    
}

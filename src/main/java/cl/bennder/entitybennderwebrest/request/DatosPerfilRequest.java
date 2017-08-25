/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

/**
 *
 * @author ext_dayanez
 */
public class DatosPerfilRequest extends UserRequest{
    private String usuario;
    private String tenantId;
    
    public DatosPerfilRequest() {
    }

    public DatosPerfilRequest(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
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
        return "DatosPerfilRequest{" + "usuario=" + usuario + ", tenantId=" + tenantId + '}';
    }

    
    
}

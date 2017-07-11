/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;


/**
 *
 * @author dyanez
 */
public class RecuperacionPasswordRequest extends UserRequest {
    private String usuarioCorreo;// correo de destino al que se envia la contraseña
    private String index;
    private String tenantId;

    public RecuperacionPasswordRequest(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }
    public RecuperacionPasswordRequest(String usuarioCorreo, String index) {
        this.usuarioCorreo = usuarioCorreo;
        this.index = index;
    }
    

    public RecuperacionPasswordRequest() {
    }

    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "RecuperacionPasswordRequest{" + "usuarioCorreo=" + usuarioCorreo + ", index=" + index + ", tenantId=" + tenantId + '}';
    }

    
    

    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

/**
 *
 * @author Usuario
 */
public class CambioPasswordRequest extends UserRequest{
   
    private String newPassword;
    private String repeatPassword;
    private String usuarioCorreo;
    private String tenantId;

    public CambioPasswordRequest() {
    }

    public CambioPasswordRequest(String newPassword, String usuarioCorreo) {
        this.newPassword = newPassword;
        this.usuarioCorreo = usuarioCorreo;
    }
    
    public CambioPasswordRequest(String newPassword, String usuarioCorreo, String tenantId) {
        this.newPassword = newPassword;
        this.usuarioCorreo = usuarioCorreo;
        this.tenantId = tenantId;
    }
    

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    
    
    
}

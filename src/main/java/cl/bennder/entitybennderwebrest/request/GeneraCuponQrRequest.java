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
public class GeneraCuponQrRequest extends UserRequest {
    private String codigoBeneficioEncriptado;
    private String tenantId;
    public GeneraCuponQrRequest() {
    }

    public GeneraCuponQrRequest(String codigoBeneficioEncriptado,String tenantId) {
        this.codigoBeneficioEncriptado = codigoBeneficioEncriptado;
        this.tenantId = tenantId;
    }

//    public GeneraCuponQrRequest(String token, String codigoBeneficioEncriptado) {
//        this.codigoBeneficioEncriptado = codigoBeneficioEncriptado;
//    }

    public String getCodigoBeneficioEncriptado() {
        return codigoBeneficioEncriptado;
    }

    public void setCodigoBeneficioEncriptado(String codigoBeneficioEncriptado) {
        this.codigoBeneficioEncriptado = codigoBeneficioEncriptado;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    
    
}

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
public class ValidacionCuponPOSRequest extends UserRequest {
    private String codigoCuponEncriptado;
    private Integer idVendedor;
    private Integer idDireccionSucursal;//id direccion de sucursal
    private String passwordSucursal;//contraseña sucusal
    private String tenantId;

    public ValidacionCuponPOSRequest() {
    }

    public ValidacionCuponPOSRequest(String codigoCuponEncriptado, Integer idVendedor, Integer idDireccionSucursal, String passwordSucursal,String tenantId) {
        this.codigoCuponEncriptado = codigoCuponEncriptado;
        this.idVendedor = idVendedor;
        this.idDireccionSucursal = idDireccionSucursal;
        this.passwordSucursal = passwordSucursal;
        this.tenantId = tenantId;
    }

    public String getCodigoCuponEncriptado() {
        return codigoCuponEncriptado;
    }

    public void setCodigoCuponEncriptado(String codigoCuponEncriptado) {
        this.codigoCuponEncriptado = codigoCuponEncriptado;
    }

    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Integer getIdDireccionSucursal() {
        return idDireccionSucursal;
    }

    public void setIdDireccionSucursal(Integer idDireccionSucursal) {
        this.idDireccionSucursal = idDireccionSucursal;
    }

    public String getPasswordSucursal() {
        return passwordSucursal;
    }

    public void setPasswordSucursal(String passwordSucursal) {
        this.passwordSucursal = passwordSucursal;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "ValidacionCuponPOSRequest{" + "codigoCuponEncriptado=" + codigoCuponEncriptado + ", idVendedor=" + idVendedor + ", idDireccionSucursal=" + idDireccionSucursal + ", tenantId=" + tenantId + '}';
    }
    
    
}

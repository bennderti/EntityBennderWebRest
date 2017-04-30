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
public class GetCuponBeneficioRequest extends UserRequest{
    private Integer idBeneficio;
    private Integer cantidad;

    public GetCuponBeneficioRequest() {
        this.cantidad = 1;
    }

    public GetCuponBeneficioRequest(Integer idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    public GetCuponBeneficioRequest(String token, Integer idBeneficio) {
        super(token);
        this.idBeneficio = idBeneficio;
    }

    public Integer getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(Integer idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    public Integer getCantidad() {
        if(cantidad == null){
            this.cantidad = 1;
        }
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "GetCuponBeneficioRequest{" + "idBeneficio=" + idBeneficio + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
}

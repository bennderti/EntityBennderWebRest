/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

/**
 * Clase que tiene los datos necesarios para la creación o edición de beneficios
 * @author dyanez
 */
public class InfoInicioBeneficioRequest extends UserRequest{
    private Integer idBeneficio;
    public InfoInicioBeneficioRequest() {
    }

    public Integer getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(Integer idBeneficio) {
        this.idBeneficio = idBeneficio;
    }
    
    
}

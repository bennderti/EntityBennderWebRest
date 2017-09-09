/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.model.Paginador;

/**
 *
 * @author ext_dayanez
 */
public class PaginadorBeneficioRequest  extends UserRequest{
    private Paginador paginador;

    public PaginadorBeneficioRequest() {
    }

    public PaginadorBeneficioRequest(Paginador paginador) {
        this.paginador = paginador;
    }

    public Paginador getPaginador() {
        return paginador;
    }

    public void setPaginador(Paginador paginador) {
        this.paginador = paginador;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.response;


import cl.bennder.entitybennderwebrest.model.Validacion;
import java.io.Serializable;

/**
 *
 * @author dyanez
 */
public class ValidacionResponse implements Serializable{
    private Validacion validacion;

    public ValidacionResponse() {
        validacion = new Validacion();
    }

    public ValidacionResponse(Validacion validacion) {
        this.validacion = validacion;
    }
    //evitamos crear objetos sino se utiliza, solo on demand
    public Validacion getValidacion() {
        if(this.validacion == null){
            this.validacion = new Validacion();
        }
        return validacion;
    }

    public void setValidacion(Validacion validacion) {
        this.validacion = validacion;
    }

    @Override
    public String toString() {
        return "ValidacionResponse{" + "validacion=" + validacion + '}';
    }
    
    
}

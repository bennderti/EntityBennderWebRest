package cl.bennder.entitybennderwebrest.response;

import cl.bennder.entitybennderwebrest.model.Beneficio;

import java.io.Serializable;

/**
 * Created by Diego on 26-03-2017.
 */
public class BeneficioResponse extends ValidacionResponse implements Serializable{

    private Beneficio beneficio;

    public Beneficio getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }
}

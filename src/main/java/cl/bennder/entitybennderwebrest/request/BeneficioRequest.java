package cl.bennder.entitybennderwebrest.request;

/**
 * Created by Diego on 26-03-2017.
 */
public class BeneficioRequest extends UserRequest {

    private Integer idBeneficio;

    public BeneficioRequest() {
    }

    public BeneficioRequest(Integer idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    public Integer getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(Integer idBeneficio) {
        this.idBeneficio = idBeneficio;
    }
}

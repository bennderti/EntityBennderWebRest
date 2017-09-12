package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.response.ValidacionResponse;

/**
 * Created by Diego on 02-09-2017.
 */
public class FiltrarBeneficiosRangoRequest extends ValidacionResponse {

    private Integer idCategoria;
    private Integer rangoMin;
    private Integer rangoMax;

    public FiltrarBeneficiosRangoRequest() {
    }

    public Integer getRangoMin() {
        return rangoMin;
    }

    public void setRangoMin(Integer rangoMin) {
        this.rangoMin = rangoMin;
    }

    public Integer getRangoMax() {
        return rangoMax;
    }

    public void setRangoMax(Integer rangoMax) {
        this.rangoMax = rangoMax;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
}

package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.response.ValidacionResponse;

/**
 * Created by Diego on 02-09-2017.
 */
public class FiltrarBeneficiosRequest extends ValidacionResponse {

    private Integer idCategoria;
    private String campoAFiltrar;

    public FiltrarBeneficiosRequest() {
    }

    public String getCampoAFiltrar() {
        return campoAFiltrar;
    }

    public void setCampoAFiltrar(String campoAFiltrar) {
        this.campoAFiltrar = campoAFiltrar;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
}

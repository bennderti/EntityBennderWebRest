package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.response.ValidacionResponse;

/**
 * Created by Diego on 02-09-2017.
 */
public class FiltrarBeneficiosRequest extends ValidacionResponse {

    private String nombreCategoria;
    private String campoAFiltrar;

    public FiltrarBeneficiosRequest() {
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getCampoAFiltrar() {
        return campoAFiltrar;
    }

    public void setCampoAFiltrar(String campoAFiltrar) {
        this.campoAFiltrar = campoAFiltrar;
    }
}

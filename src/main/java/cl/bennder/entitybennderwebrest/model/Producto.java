package cl.bennder.entitybennderwebrest.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Diego on 15-03-2017.
 */
public class Producto extends Beneficio implements Serializable{

    private Integer precioNormal;
    private Integer precioOferta;

    public Producto() {
    }

    public Producto(Integer precioNormal, Integer precioOferta) {
        this.precioNormal = precioNormal;
        this.precioOferta = precioOferta;
    }

    public Producto(Integer precioNormal, Integer precioOferta, Integer idBeneficio, String titulo, String descripcion, Date fechaCreacion, Date fechaExpiracion, String condicion, Boolean habilitado, Integer calificacion, Integer stock, Integer idProveedor, Integer idCategoria, TipoBeneficio tipoBeneficio, Integer limiteStock, Integer visitasGeneral,boolean tieneImagenGenerica) {
        super(idBeneficio, titulo, descripcion, fechaCreacion, fechaExpiracion, condicion, habilitado, calificacion, stock, idProveedor, idCategoria, tipoBeneficio, limiteStock, visitasGeneral,tieneImagenGenerica);
        this.precioNormal = precioNormal;
        this.precioOferta = precioOferta;
    }
    

    public Integer getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(Integer precioNormal) {
        this.precioNormal = precioNormal;
    }

    public Integer getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(Integer precioOferta) {
        this.precioOferta = precioOferta;
    }
}

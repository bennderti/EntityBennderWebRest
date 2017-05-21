package cl.bennder.entitybennderwebrest.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Diego on 03-03-2017.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Descuento.class, name = "Descuento"),
        @JsonSubTypes.Type(value = Producto.class, name = "Producto")
})
public class Beneficio implements Serializable{

    private Integer idBeneficio;
    private String titulo;
    private String descripcion;
    private Date fechaCreacion;
    private Date fechaInicial;
    private Date fechaExpiracion;
    private String condicion;
    private Boolean habilitado;
    private Integer calificacion;
    private Integer stock;
    private Integer idProveedor;
    private String nombreProveedor;
    private Integer idCategoria;
    private String nombreCategoria;
    private TipoBeneficio tipoBeneficio;
    private Integer limiteStock;
    private Integer visitasGeneral;
    private List<BeneficioImagen> imagenesBeneficio;
    private List<String> condiciones;

    public Beneficio() {
    }

    public Beneficio(Integer idBeneficio, String titulo, String descripcion, Date fechaCreacion, Date fechaExpiracion, String condicion, Boolean habilitado, Integer calificacion, Integer stock, Integer idProveedor, Integer idCategoria, TipoBeneficio tipoBeneficio, Integer limiteStock, Integer visitasGeneral) {
        this.idBeneficio = idBeneficio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.fechaExpiracion = fechaExpiracion;
        this.condicion = condicion;
        this.habilitado = habilitado;
        this.calificacion = calificacion;
        this.stock = stock;
        this.idProveedor = idProveedor;
        this.idCategoria = idCategoria;
        this.tipoBeneficio = tipoBeneficio;
        this.limiteStock = limiteStock;
        this.visitasGeneral = visitasGeneral;
    }

    public Integer getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(Integer idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public TipoBeneficio getTipoBeneficio() {
        return tipoBeneficio;
    }

    public void setTipoBeneficio(TipoBeneficio tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;
    }

    public Integer getLimiteStock() {
        return limiteStock;
    }

    public void setLimiteStock(Integer limiteStock) {
        this.limiteStock = limiteStock;
    }

    public Integer getVisitasGeneral() {
        return visitasGeneral;
    }

    public void setVisitasGeneral(Integer visitasGeneral) {
        this.visitasGeneral = visitasGeneral;
    }

    public List<BeneficioImagen> getImagenesBeneficio() {
        return imagenesBeneficio;
    }

    public void setImagenesBeneficio(List<BeneficioImagen> imagenesBeneficio) {
        this.imagenesBeneficio = imagenesBeneficio;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public List<String> getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(List<String> condiciones) {
        this.condiciones = condiciones;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }
    
    @Override
    public String toString() {
        return "Beneficio{" + "idBeneficio=" + idBeneficio + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fechaCreacion=" + fechaCreacion + ", fechaExpiracion=" + fechaExpiracion + ", condicion=" + condicion + ", habilitado=" + habilitado + ", calificacion=" + calificacion + ", stock=" + stock + ", idProveedor=" + idProveedor + ", nombreProveedor=" + nombreProveedor + ", idCategoria=" + idCategoria + ", nombreCategoria=" + nombreCategoria + ", tipoBeneficio=" + tipoBeneficio + ", limiteStock=" + limiteStock + ", visitasGeneral=" + visitasGeneral + ", imagenesBeneficio=" + imagenesBeneficio + ", condiciones=" + condiciones + '}';
    }
    
    
}

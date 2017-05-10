/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.request;

import cl.bennder.entitybennderwebrest.model.BeneficioImagen;
import cl.bennder.entitybennderwebrest.model.ImagenGenerica;
import cl.bennder.entitybennderwebrest.model.TipoBeneficio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dyanez
 */
public class InfoBeneficioRequest extends UserRequest {
    private Integer idBeneficio;
    private String titulo;
    private String descripcion;
    private Date fechaCreacion;
    private Date fechaExpiracion;
    private Boolean habilitado;
    private Integer calificacion;
    private Integer stock;
    private Integer idProveedor;
    private String nombreProveedor;
    private Integer idCategoria;
    private TipoBeneficio tipoBeneficio;
    private Integer limiteStock;
    private Integer visitasGeneral;
    private List<BeneficioImagen> imagenesBeneficio;
    private List<ImagenGenerica> imagenesGenericas;
    private Integer precioNormal;
    private Integer precioOferta;
    private Integer porcentajeDescuento;
    private List<String> adicionales;
    private List<String> condiciones; 
    private List<Integer> sucursales;

    public InfoBeneficioRequest(Integer idBeneficio, String titulo, String descripcion, Date fechaCreacion, Date fechaExpiracion, Boolean habilitado, Integer calificacion, Integer stock, Integer idProveedor, String nombreProveedor, Integer idCategoria, TipoBeneficio tipoBeneficio, Integer limiteStock, Integer visitasGeneral, List<BeneficioImagen> imagenesBeneficio, Integer precioNormal, Integer precioOferta, Integer porcentajeDescuento, List<String> adicionales, List<String> condiciones, List<Integer> sucursales) {
        this.idBeneficio = idBeneficio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.fechaExpiracion = fechaExpiracion;
        this.habilitado = habilitado;
        this.calificacion = calificacion;
        this.stock = stock;
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.idCategoria = idCategoria;
        this.tipoBeneficio = tipoBeneficio;
        this.limiteStock = limiteStock;
        this.visitasGeneral = visitasGeneral;
        this.imagenesBeneficio = imagenesBeneficio;
        this.precioNormal = precioNormal;
        this.precioOferta = precioOferta;
        this.porcentajeDescuento = porcentajeDescuento;
        this.adicionales = adicionales;
        this.condiciones = condiciones;
        this.sucursales = sucursales;
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

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public TipoBeneficio getTipoBeneficio() {
        if(tipoBeneficio == null){
            tipoBeneficio = new TipoBeneficio();
        }
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
        if(imagenesBeneficio == null){
            imagenesBeneficio = new ArrayList<>();
        }
        return imagenesBeneficio;
    }

    public void setImagenesBeneficio(List<BeneficioImagen> imagenesBeneficio) {
        this.imagenesBeneficio = imagenesBeneficio;
    }
    
    
//    private Beneficio beneficio;
//
//    public InfoBeneficioRequest() {
//        this.beneficio = new Beneficio();
//    }
//
//    public InfoBeneficioRequest(Beneficio beneficio) {
//        this.beneficio = beneficio;
//    }
//
//    public InfoBeneficioRequest(Beneficio beneficio, Integer idUsuario) {
//        super(idUsuario);
//        this.beneficio = beneficio;
//    }
//
//    public Beneficio getBeneficio() {
//        return beneficio;
//    }
//
//    public void setBeneficio(Beneficio beneficio) {
//        this.beneficio = beneficio;
//    }
//
//    @Override
//    public String toString() {
//        return "InfoBeneficioRequest{" + "beneficio=" + beneficio + '}';
//    }

    public InfoBeneficioRequest() {
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

    public Integer getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Integer porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public List<String> getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(List<String> adicionales) {
        this.adicionales = adicionales;
    }

    public List<String> getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(List<String> condiciones) {
        this.condiciones = condiciones;
    }

    public List<Integer> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Integer> sucursales) {
        this.sucursales = sucursales;
    }

    public List<ImagenGenerica> getImagenesGenericas() {
        if(imagenesGenericas == null){
            imagenesGenericas = new ArrayList<>();
        }
        return imagenesGenericas;
    }

    public void setImagenesGenericas(List<ImagenGenerica> imagenesGenericas) {
        this.imagenesGenericas = imagenesGenericas;
    }

    @Override
    public String toString() {
        return "InfoBeneficioRequest{" + "idBeneficio=" + idBeneficio + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fechaCreacion=" + fechaCreacion + ", fechaExpiracion=" + fechaExpiracion + ", habilitado=" + habilitado + ", calificacion=" + calificacion + ", stock=" + stock + ", idProveedor=" + idProveedor + ", nombreProveedor=" + nombreProveedor + ", idCategoria=" + idCategoria + ", tipoBeneficio=" + tipoBeneficio + ", limiteStock=" + limiteStock + ", visitasGeneral=" + visitasGeneral + ", imagenesBeneficio=" + imagenesBeneficio + ", imagenesGenericas=" + imagenesGenericas + ", precioNormal=" + precioNormal + ", precioOferta=" + precioOferta + ", porcentajeDescuento=" + porcentajeDescuento + ", adicionales=" + adicionales + ", condiciones=" + condiciones + ", sucursales=" + sucursales + '}';
    }
    
    
    
}

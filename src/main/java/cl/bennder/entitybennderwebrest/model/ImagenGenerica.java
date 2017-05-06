/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.bennder.entitybennderwebrest.model;

/**
 *
 * @author dyanez
 */
public class ImagenGenerica {
    private Integer idCategoria;
    private Integer idSubCategoria;
    private String nombre;
    private byte[] imagen;
    private String path;// ruta de la imagen en servidor de aplicaciones publica via http
    private String urlImagen;

    public ImagenGenerica() {
    }

    public ImagenGenerica(Integer idCategoria, Integer idSubCategoria, String nombre, byte[] imagen, String path, String urlImagen) {
        this.idCategoria = idCategoria;
        this.idSubCategoria = idSubCategoria;
        this.nombre = nombre;
        this.imagen = imagen;
        this.path = path;
        this.urlImagen = urlImagen;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdSubCategoria() {
        return idSubCategoria;
    }

    public void setIdSubCategoria(Integer idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    @Override
    public String toString() {
        return "ImagenGenerica{" + "idCategoria=" + idCategoria + ", idSubCategoria=" + idSubCategoria + ", nombre=" + nombre + ", path=" + path + ", urlImagen=" + urlImagen + '}';
    }
    
    
    
}

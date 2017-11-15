
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain;

import java.io.Serializable;
import java.util.Date;


public class DetalleAlquiler implements Serializable {
    
    private Integer idDetalleAlquiler;
private Integer IdAlquiler;
private String pelicula;
private double precioAlquiler;
private String fechaEntrega;
private Integer cantidad;


    public DetalleAlquiler(){
        
    }
    public DetalleAlquiler(Integer idDetalleAlquiler, Integer IdAlquiler, String pelicula, double precioAlquiler,  String fechaEntrega, Integer cantidad) {
        this.idDetalleAlquiler = idDetalleAlquiler;
        this.IdAlquiler = IdAlquiler;
        this.pelicula = pelicula;
        this.precioAlquiler = precioAlquiler;
        
        this.fechaEntrega = fechaEntrega;
        this.cantidad = cantidad;
    }

    
    public Integer getIdDetalleAlquiler() {
        return idDetalleAlquiler;
    }

    
    public void setIdDetalleAlquiler(Integer idDetalleAlquiler) {
        this.idDetalleAlquiler = idDetalleAlquiler;
    }

    
    public Integer getIdAlquiler() {
        return IdAlquiler;
    }

    
    public void setIdAlquiler(Integer IdAlquiler) {
        this.IdAlquiler = IdAlquiler;
    }

    
    public String getPelicula() {
        return pelicula;
    }

    
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    
    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    
    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }


    
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    
    public Integer getCantidad() {
        return cantidad;
    }

    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    
    
}




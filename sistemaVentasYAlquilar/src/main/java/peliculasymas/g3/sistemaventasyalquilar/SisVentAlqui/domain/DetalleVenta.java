
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain;

import java.io.Serializable;


public class DetalleVenta implements Serializable {
   
    
private Integer idDetalleVenta;
private Integer IdVenta;
private String Pelicula;
private double precioVenta;
private Integer cantidad;


    public DetalleVenta(){
        
    }
    
    public DetalleVenta(Integer idDetalleVenta, Integer IdVenta, String Pelicula, double precioVenta, Integer cantidad) {
        this.idDetalleVenta = idDetalleVenta;
        this.IdVenta = IdVenta;
        this.Pelicula = Pelicula;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
    }

    /**
     * @return the idDetalleVenta
     */
    public Integer getIdDetalleVenta() {
        return idDetalleVenta;
    }

    /**
     * @param idDetalleVenta the idDetalleVenta to set
     */
    public void setIdDetalleVenta(Integer idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    /**
     * @return the IdVenta
     */
    public Integer getIdVenta() {
        return IdVenta;
    }

    /**
     * @param IdVenta the IdVenta to set
     */
    public void setIdVenta(Integer IdVenta) {
        this.IdVenta = IdVenta;
    }

    /**
     * @return the Pelicula
     */
    public String getPelicula() {
        return Pelicula;
    }

    /**
     * @param Pelicula the Pelicula to set
     */
    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    /**
     * @return the precioVenta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    
    public Integer getCantidad() {
        return cantidad;
    }

    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}

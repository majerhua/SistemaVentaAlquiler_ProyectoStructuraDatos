
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain;

import java.io.Serializable;
import java.util.*;


public class AlquilerPelicula implements Serializable{
    
    
    private Integer idAlquiler;
    private String cliente;
    private String vendedor;
    private String fecha;

    public AlquilerPelicula(){
        
    }
    
    public AlquilerPelicula(Integer idAlquiler, String cliente, String vendedor, String fecha) {
        this.idAlquiler = idAlquiler;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.fecha = fecha;
    }

    
    public Integer getIdAlquiler() {
        return idAlquiler;
    }

    
    public void setIdAlquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    
    public String getCliente() {
        return cliente;
    }

   
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

   
    public String getVendedor() {
        return vendedor;
    }

   
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    
    public String getFecha() {
        return fecha;
    }

    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}

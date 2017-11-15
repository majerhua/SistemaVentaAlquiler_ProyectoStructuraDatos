/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain;

import java.io.Serializable;
import java.util.*;


public class VentaPelicula implements Serializable {
    
    
    private Integer idVenta;
    private String cliente;
     private String vendedor;
     private String fecha;

     
    public VentaPelicula(){
        
    } 
    
    public VentaPelicula(Integer idVenta, String cliente, String vendedor, String fecha) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.fecha = fecha;
    }

    
    public Integer getIdVenta() {
        return idVenta;
    }

    
    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
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

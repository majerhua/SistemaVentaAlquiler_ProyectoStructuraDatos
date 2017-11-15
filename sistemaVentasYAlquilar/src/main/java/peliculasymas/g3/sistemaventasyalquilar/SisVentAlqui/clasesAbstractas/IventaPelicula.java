/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas;

import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.VentaPelicula;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;

/**
 *
 * @author JOSE
 */
public interface IventaPelicula {
    
     public abstract Lista<VentaPelicula> listarVenta();
    public abstract String insertarVenta(VentaPelicula vent,Integer idCliente,Integer idVendedor);
    public abstract String actualizarVenta(VentaPelicula vent,Integer idCliente,Integer idVendedor);
    public abstract String eliminarVenta(VentaPelicula vent);
}

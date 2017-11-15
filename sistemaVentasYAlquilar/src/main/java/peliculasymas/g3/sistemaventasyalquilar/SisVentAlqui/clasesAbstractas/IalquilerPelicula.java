/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas;

import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.AlquilerPelicula;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;


public interface IalquilerPelicula {
    
    public abstract Lista<AlquilerPelicula> listarAlquiler();
    public abstract String insertarAlquiler(AlquilerPelicula alqPel,Integer idCliente,Integer idVendedor);
    public abstract String actualizarAlquiler(AlquilerPelicula alqPel,Integer idCliente,Integer idVendedor);
    public abstract String eliminarAlquiler(AlquilerPelicula vent);
     
}

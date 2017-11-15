
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas;

import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.DetalleVenta;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;


public interface IdetalleVenta {
       
    public abstract Lista<DetalleVenta> listarDetalleVenta();
    public abstract String insertarDetalleVenta(DetalleVenta detVent,Integer idPelicula);
    public abstract String actualizarDetalleVenta(DetalleVenta detVent,Integer idPelicula);
    public abstract String eliminarDetalleVenta(DetalleVenta detVent);
       
}

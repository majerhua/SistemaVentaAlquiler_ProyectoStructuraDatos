
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas;

import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.DetalleAlquiler;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;


public interface IdetalleAlquiler {
    
    public abstract Lista<DetalleAlquiler> listarDetalleAlquiler();
    public abstract String insertarDetalleAlquiler(DetalleAlquiler detAlq,Integer idPelicula);
    public abstract String actualizarDetalleAlquiler(DetalleAlquiler detAlq,Integer idPelicula);
    public abstract String eliminarDetalleAlquiler(DetalleAlquiler detAlq);
    
}

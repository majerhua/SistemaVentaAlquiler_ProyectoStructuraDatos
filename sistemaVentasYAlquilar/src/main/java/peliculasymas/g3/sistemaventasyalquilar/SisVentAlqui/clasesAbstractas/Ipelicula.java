
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas;

import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.Pelicula;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;



public interface Ipelicula {
    
    public abstract Lista<Pelicula> listarPelicula();
    public abstract String insertarPelicula(Pelicula pel,Integer idCategoria);
    public abstract String actualizarPelicula(Pelicula pel,Integer idCategoria);
    public abstract String eliminarPelicula(Pelicula pel);
       
}

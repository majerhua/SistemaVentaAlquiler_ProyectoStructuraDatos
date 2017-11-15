

package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas;

import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.Categoria;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;


public interface Icategoria {
  
    public abstract Lista<Categoria> listarCategoria();
    public abstract String insertarCategoria(Categoria cat);
    public abstract String actualizarCategoria(Categoria cat);
    public abstract String eliminarCategoria(Categoria cat);
    
}

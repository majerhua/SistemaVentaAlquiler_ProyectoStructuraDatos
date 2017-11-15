
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas;

import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.Vendedor;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;


public interface Ivendedor {
    
    
    public abstract Lista<Vendedor> listarVendedor();
    public abstract String insertarVendedor(Vendedor user);
    public abstract String actualizarVendedor(Vendedor user);
    public abstract String eliminarVendedor(Vendedor user);
    
             
}


package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas;

import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.Cliente;


public interface Icliente {
  
    public abstract Lista<Cliente> listarCliente();
    public abstract String insertarCliente(Cliente cli);
    public abstract String actualizarCliente(Cliente cli);
    public abstract String eliminarCliente(Cliente cli);
    
}

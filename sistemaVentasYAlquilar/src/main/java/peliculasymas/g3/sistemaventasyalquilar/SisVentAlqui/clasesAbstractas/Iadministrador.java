
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas;

import java.util.*;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.Administrador;

public interface Iadministrador {
    
    
    public abstract Lista<Administrador> listarAdministrador();
    public abstract String insertarAdministrador(Administrador admin);
    public abstract String actualizarAdministrador(Administrador admin);
    public abstract String eliminarAdministrador(Administrador admin);
    
}

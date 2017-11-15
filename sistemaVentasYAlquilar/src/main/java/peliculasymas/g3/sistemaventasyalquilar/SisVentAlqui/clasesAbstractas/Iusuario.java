
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas;
import java.util.*;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.Usuario;


public interface Iusuario {
    
    
    public abstract Lista<Usuario> listarUsuario();
    public abstract String insertarUsuario(Usuario user);
    public abstract String actualizarUsuario(Usuario user);
    public abstract String eliminarUsuario(Usuario user);
}



package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos;


public class Nodo<E> {
    
    
    public E dato;
    public Nodo<E> sgte;
    
    public Nodo(E d){
        this.dato=d;
        sgte=null;
    }
            
}

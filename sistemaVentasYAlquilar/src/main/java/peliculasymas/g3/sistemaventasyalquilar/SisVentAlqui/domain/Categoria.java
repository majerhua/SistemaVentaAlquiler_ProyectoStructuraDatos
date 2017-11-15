
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain;


public class Categoria {
    
    
    private Integer idCategoria;
    private String nombre;
    private String descripcion;
    
    public Categoria(){
        
    }
    public Categoria(Integer idCategoria, String nombre, String descripcion) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

   
    public Integer getIdCategoria() {
        return idCategoria;
    }

    
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

   
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
}

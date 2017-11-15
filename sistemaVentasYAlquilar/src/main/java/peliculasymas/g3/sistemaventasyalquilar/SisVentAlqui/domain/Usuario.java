
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain;

import java.io.*;


public class Usuario implements Serializable{
    
    private Integer idUsuario;
    private String username;
    private String password;
    private String descripcion;
    
    public Usuario(){
        
    }

    public Usuario(Integer idUsuario, String username, String password, String descripcion) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.descripcion = descripcion;
    }
    
    

    
    public Integer getIdUsuario() {
        return idUsuario;
    }

    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

   
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
           
}

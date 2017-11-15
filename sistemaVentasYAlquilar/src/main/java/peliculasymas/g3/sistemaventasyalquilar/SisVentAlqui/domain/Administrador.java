
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain;

import java.io.Serializable;


public class Administrador implements Serializable{
    
    
    private Integer idAdministrador;
    private String username;
    private String password;

    
    public Administrador(){
        
    }
    public Administrador(Integer idAdministrador, String username, String password) {
        this.idAdministrador = idAdministrador;
        this.username = username;
        this.password = password;
    }

    
    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    
    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
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
    
    
       
}

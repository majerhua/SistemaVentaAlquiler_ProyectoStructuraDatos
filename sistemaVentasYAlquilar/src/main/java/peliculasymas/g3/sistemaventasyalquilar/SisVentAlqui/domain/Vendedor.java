
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain;

import java.io.Serializable;


public class Vendedor implements Serializable{
    
    
    
    
    
    private Integer idVendedor;
    private String codigo;
    private String nombre;
    private String dni;
    private String telefono;
    private String direccion;
    
    public Vendedor(){
        
    }
    
    
    public Vendedor(Integer idVendedor, String codigo, String nombre, String dni, String telefono, String direccion) {
        this.idVendedor = idVendedor;
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    
    public Integer getIdVendedor() {
        return idVendedor;
    }

   
    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    
    public String getCodigo() {
        return codigo;
    }

    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getDni() {
        return dni;
    }

    
    public void setDni(String dni) {
        this.dni = dni;
    }

    
    public String getTelefono() {
        return telefono;
    }

  
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public String getDireccion() {
        return direccion;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
    
}


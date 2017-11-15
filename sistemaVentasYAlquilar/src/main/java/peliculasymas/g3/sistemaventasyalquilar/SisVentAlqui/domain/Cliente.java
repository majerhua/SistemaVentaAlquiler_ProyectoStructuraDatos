/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain;

import java.io.Serializable;


public class Cliente implements Serializable  {
    
    
    private Integer idCliente;
    private String nombre;
    private String dni;
    private String telefono;
    private String correo;
    private String direccion;

    
    public Cliente(){
        
    }
    
    public Cliente(Integer idCliente, String nombre, String dni, String telefono, String correo, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    

    
    public Integer getIdCliente() {
        return idCliente;
    }

    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
        
    }
    
    

    
}

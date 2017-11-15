/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas.Ivendedor;


import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.Vendedor;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;

/**
 *
 * @author JOSE
 */
public class vendedorDao implements Ivendedor{
    
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    public  Lista<Vendedor> listarVendedor(){
        
        Lista<Vendedor> lista = new Lista<Vendedor>();
        Connection cn= conexion.getConnection();
        try {
            
            Statement st = cn.createStatement();                   
            ResultSet rs= st.executeQuery("SELECT *FROM vendedor");
            
            while(rs.next()){
                
                Vendedor vend = new Vendedor();
                
                vend.setIdVendedor(rs.getInt("idVendedor"));
                vend.setCodigo(rs.getString("codigo"));
                vend.setNombre(rs.getString("nombre"));
                vend.setDni(rs.getString("dni"));
                vend.setTelefono(rs.getString("telefono"));
                
                vend.setDireccion(rs.getString("direccion"));
               
                lista.addNodoFinal(vend);
            }
                                           
        }catch(Exception e){
         
           JOptionPane.showMessageDialog(null, e);
        }
        
        
        return lista;
    }
    
    public String insertarVendedor(Vendedor vend){
        
        int res=0;
        String rpta="Vendedor Guardado Correctamente!";
        connection = conexion.getConnection();
        try{
            
            preparedStatement = connection.prepareStatement("INSERT INTO vendedor(codigo,nombre,dni,telefono,direccion) VALUES(?,?,?,?,?)");
            
            preparedStatement.setString(1,vend.getCodigo());
            preparedStatement.setString(2, vend.getNombre());
            preparedStatement.setString(3,vend.getDni());
            preparedStatement.setString(4,vend.getTelefono());  
            preparedStatement.setString(5,vend.getDireccion());
            
            
            res= preparedStatement.executeUpdate();
            
            if(res==0){
                rpta = "Error";
            }
            
            
            
        }catch(Exception ex){
         
            rpta=ex.getMessage();
        }
        
        
        return rpta;
    }
    
    public String actualizarVendedor(Vendedor vend){
        
        int actualizo =0;
        String rpta = "Vendedor Modificado Correctamente!";
        connection = conexion.getConnection();
        
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
            
                try{
                    preparedStatement = connection.prepareStatement("UPDATE vendedor SET codigo=?,nombre=? ,dni=? ,telefono=?,direccion=?  WHERE idVendedor=?");
               
                    preparedStatement.setString(1,vend.getCodigo());
                    preparedStatement.setString(2,vend.getNombre());
                    preparedStatement.setString(3,vend.getDni()); 
                    preparedStatement.setString(4,vend.getTelefono());
                     preparedStatement.setString(5,vend.getDireccion());
                    preparedStatement.setInt(6,vend.getIdVendedor());
                    
                    actualizo = preparedStatement.executeUpdate();
                
                    if(actualizo == 0){
                        rpta="Error";
                    }
                
                }catch(Exception ex){
             
                    rpta=ex.getMessage();
                }
                                
            }
        
            else{
                rpta="No se conecto!";
            }
                     
        }
    
    return rpta;
    
    }
    
    public String eliminarVendedor(Vendedor vend){
        
        int eliminar =0;
        String rpta = "Vendedor Eliminado Correctamente!";
        connection = conexion.getConnection();
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar Vendedor?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
                
                
                try{
                    
                    preparedStatement = connection.prepareStatement("Delete from vendedor WHERE idVendedor=?");
                     preparedStatement.setInt(1,vend.getIdVendedor());
                    
                    eliminar = preparedStatement.executeUpdate();
                    
                    if(eliminar == 0){
                        rpta="Error";
                    }
                    
                    
                }catch(Exception ex){
                    rpta=ex.getMessage();
                }
                
                
            }
        }
        
        return rpta;
        
    }
}

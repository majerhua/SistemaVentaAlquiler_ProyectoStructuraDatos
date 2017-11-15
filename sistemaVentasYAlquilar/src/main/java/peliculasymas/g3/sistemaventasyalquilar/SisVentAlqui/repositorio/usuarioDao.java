/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.repositorio;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas.Iusuario;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.Usuario;


public class usuarioDao implements Iusuario {
    
   
    
    
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
   
    
    public  Lista<Usuario> listarUsuario(){
        
        Lista<Usuario> lista = new Lista<Usuario>();
        Connection cn= conexion.getConnection();
        try {
            
            Statement st = cn.createStatement();                   
            ResultSet rs= st.executeQuery("SELECT *FROM usuario");
            
            while(rs.next()){
                
                Usuario user = new Usuario();
                
                user.setIdUsuario(rs.getInt("idUsuario"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setDescripcion(rs.getString("descripcion"));
               
                lista.addNodoFinal(user);
            }
                                           
        }catch(Exception e){
         
           JOptionPane.showMessageDialog(null, e);
        }
        
        
        return lista;
    }
            
    @Override
    public String insertarUsuario(Usuario user){
        
        int res=0;
        String rpta="Usuario Guardado Correctamente!";
        connection = conexion.getConnection();
        try{
            
            preparedStatement = connection.prepareStatement("INSERT INTO usuario(username,password,descripcion) VALUES(?,?,?)");
            
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setString(3,user.getDescripcion());
            
            res= preparedStatement.executeUpdate();
            
            if(res==0){
                rpta = "Error";
            }
            
            
            
        }catch(Exception ex){
         
            rpta=ex.getMessage();
        }
        
        
        return rpta;
    }
    
    public String actualizarUsuario(Usuario user){
        
        int actualizo =0;
        String rpta = "Usuario Modificado Correctamente!";
        connection = conexion.getConnection();
        
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
            
                try{
                    preparedStatement = connection.prepareStatement("UPDATE usuario SET username=? ,password=? ,descripcion=? WHERE idUsuario=?");
               
                    preparedStatement.setString(1,user.getUsername());
                    preparedStatement.setString(2,user.getPassword());
                    preparedStatement.setString(3,user.getDescripcion()); 
                    preparedStatement.setInt(4,user.getIdUsuario());
                     
                    
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
    
    public String eliminarUsuario(Usuario user){
        
        int eliminar =0;
        String rpta = "Usuario Eliminado Correctamente!";
        connection = conexion.getConnection();
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar Usuario?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
                
                
                try{
                    
                    preparedStatement = connection.prepareStatement("Delete from usuario WHERE idUsuario=?");
                     preparedStatement.setInt(1,user.getIdUsuario());
                    
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

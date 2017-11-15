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
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas.Icategoria;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.Categoria;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;


public class categoriaDao implements Icategoria{
    
     Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
   
    
    public  Lista<Categoria> listarCategoria(){
        
        Lista<Categoria> lista = new Lista<Categoria>();
        Connection cn= conexion.getConnection();
        try {
            
            Statement st = cn.createStatement();                   
            ResultSet rs= st.executeQuery("SELECT *FROM categoria");
            
            while(rs.next()){
                
                Categoria cat = new Categoria();
                
                cat.setIdCategoria(rs.getInt("idCategoria"));
                cat.setNombre(rs.getString("nombre"));
                cat.setDescripcion(rs.getString("descripcion"));
                
               
                lista.addNodoFinal(cat);
            }
                                           
        }catch(Exception e){
         
           JOptionPane.showMessageDialog(null, e);
        }
        
        
        return lista;
    }
    
    public String insertarCategoria(Categoria cat){
        
        int res=0;
        String rpta="Usuario Guardado Correctamente!";
        connection = conexion.getConnection();
        try{
            
            preparedStatement = connection.prepareStatement("INSERT INTO categoria(nombre,descripcion) VALUES(?,?)");
            
           
            preparedStatement.setString(1,cat.getNombre());
            preparedStatement.setString(2,cat.getDescripcion());
            
            res= preparedStatement.executeUpdate();
            
            if(res==0){
                rpta = "Error";
            }
            
            
            
        }catch(Exception ex){
         
            rpta=ex.getMessage();
        }
        
        
        return rpta;
    }
    
    public String actualizarCategoria(Categoria cat){
        
        int actualizo =0;
        String rpta = "Categoria Modificado Correctamente!";
        connection = conexion.getConnection();
        
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
            
                try{
                    preparedStatement = connection.prepareStatement("UPDATE categoria SET nombre=? ,descripcion=?  WHERE idCategoria=?");
               
                    preparedStatement.setString(1,cat.getNombre());
                    preparedStatement.setString(2,cat.getDescripcion());

                    preparedStatement.setInt(3,cat.getIdCategoria());
                     
                    
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
    
     public String eliminarCategoria(Categoria cat){
        
        int eliminar =0;
        String rpta = "Categoria Eliminado Correctamente!";
        connection = conexion.getConnection();
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar Categoria?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
                
                
                try{
                    
                    preparedStatement = connection.prepareStatement("Delete from categoria WHERE idCategoria=?");
                     preparedStatement.setInt(1,cat.getIdCategoria());
                    
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

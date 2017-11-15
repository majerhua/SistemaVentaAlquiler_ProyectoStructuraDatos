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
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas.IalquilerPelicula;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.AlquilerPelicula;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;


public class AlquilerPeliculaDao implements IalquilerPelicula {
    
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
     public  Lista<AlquilerPelicula> listarAlquiler(){
        
        Lista<AlquilerPelicula> lista = new Lista<AlquilerPelicula>();
        Connection cn= conexion.getConnection();
        try {
            
            Statement st = cn.createStatement();                   
            ResultSet rs= st.executeQuery("SELECT idAlquiler,cliente.nombre,vendedor.nombre, fecha FROM alquiler,vendedor,cliente WHERE alquiler.idCliente=cliente.idCliente AND alquiler.idVendedor=vendedor.idVendedor");
            
            while(rs.next()){
                
                AlquilerPelicula  alqPel = new AlquilerPelicula();
                
                alqPel.setIdAlquiler(rs.getInt("idAlquiler"));
                alqPel.setCliente(rs.getString("cliente.nombre"));
                alqPel.setVendedor(rs.getString("vendedor.nombre"));
                alqPel.setFecha(rs.getString("fecha"));
               
                lista.addNodoFinal(alqPel);
            }
                                           
        }catch(Exception e){
         
           JOptionPane.showMessageDialog(null, e);
        }
        
        
        return lista;
    }
     
      public String insertarAlquiler(AlquilerPelicula alqPel,Integer idCliente,Integer idVendedor){
        
        int res=0;
        String rpta="Alquiler Guardado Correctamente!";
        connection = conexion.getConnection();
        try{
            
            preparedStatement = connection.prepareStatement("INSERT INTO alquiler(idCliente,idVendedor,fecha) VALUES(?,?,?)");
            
            preparedStatement.setInt(1, idCliente);
            preparedStatement.setInt(2,idVendedor);
            preparedStatement.setString(3,alqPel.getFecha());
            
            res= preparedStatement.executeUpdate();
            
            if(res==0){
                rpta = "Error";
            }
            
            
            
        }catch(Exception ex){
         
            rpta=ex.getMessage();
        }
        
        
        return rpta;
    }
      
      public String actualizarAlquiler(AlquilerPelicula alqPel,Integer idCliente,Integer idVendedor){
        
        int actualizo =0;
        String rpta = "Alquiler Modificado Correctamente!";
        connection = conexion.getConnection();
        
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
            
                try{
                    preparedStatement = connection.prepareStatement("UPDATE alquiler SET idCliente=? ,idVendedor=? ,fecha=? WHERE idAlquiler=?");
               
                    preparedStatement.setInt(1,idCliente);
                    preparedStatement.setInt(2,idVendedor);
                    preparedStatement.setString(3,alqPel.getFecha()); 
                    preparedStatement.setInt(4,alqPel.getIdAlquiler());
                     
                    
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
    
    public String eliminarAlquiler(AlquilerPelicula alqPel){
        
        int eliminar =0;
        String rpta = "Alquiler Eliminado Correctamente!";
        connection = conexion.getConnection();
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar Alquiler?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
                
                
                try{
                    
                    preparedStatement = connection.prepareStatement("Delete from alquiler WHERE idAlquiler=?");
                     preparedStatement.setInt(1,alqPel.getIdAlquiler());
                    
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

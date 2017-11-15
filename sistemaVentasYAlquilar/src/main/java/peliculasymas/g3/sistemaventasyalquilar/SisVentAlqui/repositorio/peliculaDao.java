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
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas.Ipelicula;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.Pelicula;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;


public class peliculaDao implements Ipelicula {
    
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
   
    
    public  Lista<Pelicula> listarPelicula(){
        
        Lista<Pelicula> lista = new Lista<Pelicula>();
        Connection cn= conexion.getConnection();
        try {
            
            Statement st = cn.createStatement();                   
            ResultSet rs= st.executeQuery("SELECT idPelicula,categoria.nombre,titulo,precioCompra,duracion,idioma FROM pelicula,categoria WHERE pelicula.idCategoria=categoria.idCategoria");
            
            while(rs.next()){
                
                Pelicula pel = new Pelicula();
                
                pel.setIdPelicula(rs.getInt("idPelicula"));
                pel.setCategoria(rs.getString("categoria.nombre"));
                pel.setTitulo(rs.getString("titulo"));
                pel.setPrecioCompra(rs.getDouble("precioCompra")); 
                pel.setDuracion(rs.getString("duracion"));
                pel.setIdioma(rs.getString("idioma"));
                lista.addNodoFinal(pel);
            }
                                           
        }catch(Exception e){
         
           JOptionPane.showMessageDialog(null, e);
        }
        
        
        return lista;
    }
            
    
    public String insertarPelicula(Pelicula pel,Integer idCategoria){
        
        int res=0;
        String rpta="Usuario Guardado Correctamente!";
        connection = conexion.getConnection();
        try{
            
            preparedStatement = connection.prepareStatement("INSERT INTO pelicula(idCategoria,precioCompra,titulo,duracion,idioma) VALUES(?,?,?,?,?)");
            
            preparedStatement.setInt(1,idCategoria);
            preparedStatement.setDouble(2,pel.getPrecioCompra());
            preparedStatement.setString(3,pel.getTitulo());
            preparedStatement.setString(4,pel.getDuracion());
            preparedStatement.setString(5,pel.getIdioma());
            
            res= preparedStatement.executeUpdate();
            
            if(res==0){
                rpta = "Error";
            }
            
            
            
        }catch(Exception ex){
         
            rpta=ex.getMessage();
        }
        
        
        return rpta;
    }
    
    public String actualizarPelicula(Pelicula pel,Integer idCategoria){
        
        int actualizo =0;
        String rpta = "Pelicula Modificado Correctamente!";
        connection = conexion.getConnection();
        
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
            
                try{
                    preparedStatement = connection.prepareStatement("UPDATE pelicula SET idCategoria=? ,precioCompra=? ,titulo=?,duracion=?,idioma=? WHERE idPelicula=?");
               
                    preparedStatement.setInt(1,idCategoria);
                    preparedStatement.setDouble(2,pel.getPrecioCompra());
                    preparedStatement.setString(3,pel.getTitulo()); 
                    preparedStatement.setString(4,pel.getDuracion());
                    preparedStatement.setString(5,pel.getIdioma());
                    preparedStatement.setInt(6,pel.getIdPelicula());
                     
                    
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
    
    public String eliminarPelicula(Pelicula pel){
        
        int eliminar =0;
        String rpta = "Pelicula Eliminado Correctamente!";
        connection = conexion.getConnection();
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar Usuario?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
                
                
                try{
                    
                    preparedStatement = connection.prepareStatement("Delete from pelicula WHERE idPelicula=?");
                     preparedStatement.setInt(1,pel.getIdPelicula());
                    
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

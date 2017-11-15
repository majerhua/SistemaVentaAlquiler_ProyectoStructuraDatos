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
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas.IdetalleVenta;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.DetalleVenta;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;

public class DetalleVentaDao implements IdetalleVenta {
    
    
     Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
   
    
    public  Lista<DetalleVenta> listarDetalleVenta(){
        
        Lista<DetalleVenta> lista = new Lista<DetalleVenta>();
        Connection cn= conexion.getConnection();
        try {
            
            Statement st = cn.createStatement();                   
            ResultSet rs= st.executeQuery(" SELECT idDetalleVenta,idVenta,pelicula.titulo,precioVenta,cantidad  FROM detalleVenta,pelicula WHERE detalleVenta.idPelicula=pelicula.idPelicula ");
            
            while(rs.next()){
                
                DetalleVenta detVent = new DetalleVenta();
                
                detVent.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                detVent.setIdVenta(rs.getInt("idVenta"));
                detVent.setPelicula(rs.getString("pelicula.titulo"));
                detVent.setPrecioVenta(rs.getDouble("precioVenta"));
               detVent.setCantidad(rs.getInt("cantidad"));
                lista.addNodoFinal(detVent);
            }
                                           
        }catch(Exception e){
         
           JOptionPane.showMessageDialog(null, e);
        }
        
        
        return lista;
    }
            
    
    public String insertarDetalleVenta(DetalleVenta detVent,Integer idPelicula){
        
        int res=0;
        String rpta="Detalle Venta Guardado Correctamente!";
        connection = conexion.getConnection();
        try{
            
            preparedStatement = connection.prepareStatement("INSERT INTO detalleVenta(idVenta,idPelicula,precioVenta,cantidad) VALUES(?,?,?,?)");
            
            preparedStatement.setInt(1, detVent.getIdVenta());
            preparedStatement.setInt(2,idPelicula);
            preparedStatement.setDouble(3,detVent.getPrecioVenta());
            preparedStatement.setInt(4,detVent.getCantidad());
            res= preparedStatement.executeUpdate();
            
            if(res==0){
                rpta = "Error";
            }
            
            
            
        }catch(Exception ex){
         
            rpta=ex.getMessage();
        }
        
        
        return rpta;
    }
    
    public String actualizarDetalleVenta(DetalleVenta detVent,Integer idPelicula){
        
        int actualizo =0;
        String rpta = "Detalle Venta Modificado Correctamente!";
        connection = conexion.getConnection();
        
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
            
                try{
                    preparedStatement = connection.prepareStatement("UPDATE detalleVenta SET idPelicula=? ,precioVenta=?, cantidad=? WHERE idDetalleVenta=?");
                    
                    
                    preparedStatement.setInt(1,idPelicula);
                    preparedStatement.setDouble(2,detVent.getPrecioVenta()); 
                    preparedStatement.setInt(3,detVent.getCantidad());
                    preparedStatement.setInt(4,detVent.getIdDetalleVenta());                
                    
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
    
    public String eliminarDetalleVenta(DetalleVenta detVent){
        
        int eliminar =0;
        String rpta = "Detalle Venta Eliminado Correctamente!";
        connection = conexion.getConnection();
              
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar Detalle Venta?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
                
                
                try{
                    
                    preparedStatement = connection.prepareStatement("Delete from detalleVenta WHERE idDetalleVenta=?");
                     preparedStatement.setInt(1,detVent.getIdDetalleVenta());
                    
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

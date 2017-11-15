
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas.IdetalleAlquiler;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.DetalleAlquiler;

import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;

public class DetalleAlquilerDao implements IdetalleAlquiler{
    
    
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    public  Lista<DetalleAlquiler> listarDetalleAlquiler(){
        
        Lista<DetalleAlquiler> lista = new Lista<DetalleAlquiler>();
        Connection cn= conexion.getConnection();
        try {
            
            Statement st = cn.createStatement();                   
            ResultSet rs= st.executeQuery(" SELECT idDetalleAlquiler,idAlquiler,pelicula.titulo,precioAlquiler,fechaEntrega,cantidad  FROM detalleAlquiler,pelicula WHERE detalleAlquiler.idPelicula=pelicula.idPelicula ");
            
            while(rs.next()){
                
                DetalleAlquiler detAlq = new DetalleAlquiler();
                
                detAlq.setIdDetalleAlquiler(rs.getInt("idDetalleAlquiler"));
                detAlq.setIdAlquiler(rs.getInt("idAlquiler"));
                detAlq.setPelicula(rs.getString("pelicula.titulo"));
                detAlq.setPrecioAlquiler(rs.getDouble("precioAlquiler"));               
                 detAlq.setFechaEntrega(rs.getString("fechaEntrega"));
               detAlq.setCantidad(rs.getInt("cantidad"));
                lista.addNodoFinal(detAlq);
            }
                                           
        }catch(Exception e){
         
           JOptionPane.showMessageDialog(null, e);
        }
        
        
        return lista;
    }
            
    
    public String insertarDetalleAlquiler(DetalleAlquiler detAlq,Integer idPelicula){
        
        int res=0;
        String rpta="Detalle Alquiler Guardado Correctamente!";
        connection = conexion.getConnection();
        try{
            
            preparedStatement = connection.prepareStatement("INSERT INTO detalleAlquiler(idAlquiler,idPelicula,precioAlquiler,fechaEntrega,cantidad) VALUES(?,?,?,?,?)");
            
            preparedStatement.setInt(1, detAlq.getIdAlquiler());
            preparedStatement.setInt(2,idPelicula);
            preparedStatement.setDouble(3,detAlq.getPrecioAlquiler());
           
            preparedStatement.setString(4,detAlq.getFechaEntrega());
            preparedStatement.setInt(5,detAlq.getCantidad());
            
            res= preparedStatement.executeUpdate();
            
            if(res==0){
                rpta = "Error";
            }
            
            
            
        }catch(Exception ex){
         
            rpta=ex.getMessage();
        }
        
        
        return rpta;
    }
    
    public String actualizarDetalleAlquiler(DetalleAlquiler detAlq,Integer idPelicula){
        
        int actualizo =0;
        String rpta = "Detalle Alquiler Modificado Correctamente!";
        connection = conexion.getConnection();
        
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
            
                try{
                    preparedStatement = connection.prepareStatement("UPDATE detalleAlquiler SET idPelicula=? ,precioAlquiler=?,fechaEntrega=? ,cantidad=? WHERE idDetalleAlquiler=?");
                    
                    
                    preparedStatement.setInt(1,idPelicula);
                    preparedStatement.setDouble(2,detAlq.getPrecioAlquiler()); 
                
                    preparedStatement.setString(4,detAlq.getFechaEntrega());                
                    preparedStatement.setInt(5,detAlq.getCantidad());
                    preparedStatement.setInt(6,detAlq.getIdDetalleAlquiler());
                    
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
    
    public String eliminarDetalleAlquiler(DetalleAlquiler detAlq){
        
        int eliminar =0;
        String rpta = "Detalle Alquiler Eliminado Correctamente!";
        connection = conexion.getConnection();
              
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar Detalle Alquiler?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
                
                
                try{
                    
                    preparedStatement = connection.prepareStatement("Delete from detalleAlquiler WHERE idDetalleAlquiler=?");
                     preparedStatement.setInt(1,detAlq.getIdDetalleAlquiler());
                    
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

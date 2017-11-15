
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.repositorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas.IventaPelicula;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.VentaPelicula;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;


public class ventaPeliculaDao implements IventaPelicula {
    
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
     public  Lista<VentaPelicula> listarVenta(){
        
        Lista<VentaPelicula> lista = new Lista<VentaPelicula>();
        Connection cn= conexion.getConnection();
        try {
            
            Statement st = cn.createStatement();                   
            ResultSet rs= st.executeQuery("SELECT idVenta,cliente.nombre,vendedor.nombre, fecha FROM venta,vendedor,cliente WHERE venta.idCliente=cliente.idCliente AND venta.idVendedor=vendedor.idVendedor");
            
            while(rs.next()){
                
                VentaPelicula  ventPel = new VentaPelicula();
                
                ventPel.setIdVenta(rs.getInt("idVenta"));
                ventPel.setCliente(rs.getString("cliente.nombre"));
                ventPel.setVendedor(rs.getString("vendedor.nombre"));
                ventPel.setFecha(rs.getString("fecha"));
               
                lista.addNodoFinal(ventPel);
            }
                                           
        }catch(Exception e){
         
           JOptionPane.showMessageDialog(null, e);
        }
        
        
        return lista;
    }
     
      public String insertarVenta(VentaPelicula ventPel,Integer idCliente,Integer idVendedor){
        
        int res=0;
        String rpta="Venta Guardado Correctamente!";
        connection = conexion.getConnection();
        try{
            
            preparedStatement = connection.prepareStatement("INSERT INTO venta(idCliente,idVendedor,fecha) VALUES(?,?,?)");
            
            preparedStatement.setInt(1, idCliente);
            preparedStatement.setInt(2,idVendedor);
            preparedStatement.setString(3,ventPel.getFecha());
            
            res= preparedStatement.executeUpdate();
            
            if(res==0){
                rpta = "Error";
            }
            
            
            
        }catch(Exception ex){
         
            rpta=ex.getMessage();
        }
        
        
        return rpta;
    }
      
      public String actualizarVenta(VentaPelicula ventPel,Integer idCliente,Integer idVendedor){
        
        int actualizo =0;
        String rpta = "Venta Modificado Correctamente!";
        connection = conexion.getConnection();
        
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
            
                try{
                    preparedStatement = connection.prepareStatement("UPDATE venta SET idCliente=? ,idVendedor=? ,fecha=? WHERE idVenta=?");
               
                    preparedStatement.setInt(1,idCliente);
                    preparedStatement.setInt(2,idVendedor);
                    preparedStatement.setString(3,ventPel.getFecha()); 
                    preparedStatement.setInt(4,ventPel.getIdVenta());
                     
                    
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
    
    public String eliminarVenta(VentaPelicula ventPel){
        
        int eliminar =0;
        String rpta = "Venta Eliminado Correctamente!";
        connection = conexion.getConnection();
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar Venta?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
                
                
                try{
                    
                    preparedStatement = connection.prepareStatement("Delete from venta WHERE idVenta=?");
                     preparedStatement.setInt(1,ventPel.getIdVenta());
                    
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

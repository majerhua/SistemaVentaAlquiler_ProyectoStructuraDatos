
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.repositorio;


import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.clasesAbstractas.Iadministrador;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.Administrador;


public class administradorDao implements Iadministrador{
   
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    DefaultTableModel dfm = new DefaultTableModel();
    
    public  Lista<Administrador> listarAdministrador(){
        
        Lista<Administrador> lista = new Lista<Administrador>();
        Connection cn= conexion.getConnection();
        try {
            
            Statement st = cn.createStatement();                   
            ResultSet rs= st.executeQuery("SELECT *FROM administrador");
            
            while(rs.next()){
                
                Administrador admin = new Administrador();
                
                admin.setIdAdministrador(rs.getInt("idAdministrador"));
                admin.setUsername(rs.getString("username"));
                admin.setPassword(rs.getString("password"));
                
               
                lista.addNodoFinal(admin);
            }
                                           
        }catch(Exception e){
         
           JOptionPane.showMessageDialog(null, e);
        }
        
        
        return lista;
    }
            
    @Override
    public String insertarAdministrador(Administrador user){
        
        int res=0;
        String rpta="Administrador Guardado Correctamente!";
        connection = conexion.getConnection();
        try{
            
            preparedStatement = connection.prepareStatement("INSERT INTO administrador(username,password) VALUES(?,?)");
            
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            
            res= preparedStatement.executeUpdate();
            
            if(res==0){
                rpta = "Error";
            }
            
            
            
        }catch(Exception ex){
         
            rpta=ex.getMessage();
        }
        
        
        return rpta;
    }
    
    public String actualizarAdministrador(Administrador user){
        
        int actualizo =0;
        String rpta = "Administrador Modificado Correctamente!";
        connection = conexion.getConnection();
        
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
            
                try{
                    preparedStatement = connection.prepareStatement("UPDATE administrador SET username=? ,password=? WHERE idAdministrador=?");
               
                    preparedStatement.setString(1,user.getUsername());
                    preparedStatement.setString(2,user.getPassword());
                    preparedStatement.setInt(3,user.getIdAdministrador());
                 
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
    
    public String eliminarAdministrador(Administrador admin){
        
        int eliminar =0;
        String rpta = "Administrador Eliminado Correctamente!";
        connection = conexion.getConnection();
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar Administrador?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
                
                
                try{
                    
                    preparedStatement = connection.prepareStatement("Delete from administrador WHERE idAdministrador=?");
                     preparedStatement.setInt(1,admin.getIdAdministrador());
                    
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

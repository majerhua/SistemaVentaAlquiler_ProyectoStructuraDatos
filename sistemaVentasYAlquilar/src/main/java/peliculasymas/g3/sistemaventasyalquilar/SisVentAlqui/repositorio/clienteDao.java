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
import javax.swing.table.DefaultTableModel;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos.Lista;
import peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.domain.Cliente;




public class clienteDao {
    
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    DefaultTableModel dfm = new DefaultTableModel();
    
     public  Lista<Cliente> listarUsuario(){
        
        Lista<Cliente> lista = new Lista<Cliente>();
        Connection cn= conexion.getConnection();
        try {
            
            Statement st = cn.createStatement();                   
            ResultSet rs= st.executeQuery("SELECT *FROM cliente");
            
            while(rs.next()){
                
                Cliente cli = new Cliente();
                
                cli.setIdCliente(rs.getInt("idCliente"));
                cli.setNombre(rs.getString("nombre"));
                cli.setDni(rs.getString("dni"));
                cli.setTelefono(rs.getString("telefono"));
                cli.setCorreo(rs.getString("correo"));
                cli.setDireccion(rs.getString("direccion"));
               
                lista.addNodoFinal(cli);
            }
                                           
        }catch(Exception e){
         
           JOptionPane.showMessageDialog(null, e);
        }
        
        
        return lista;
    }
     
     public String insertarUsuario(Cliente cli){
        
        int res=0;
        String rpta="Usuario Guardado Correctamente!";
        connection = conexion.getConnection();
        try{
            
            preparedStatement = connection.prepareStatement("INSERT INTO cliente(nombre,dni,telefono,correo,direccion) VALUES(?,?,?,?,?)");
            
            preparedStatement.setString(1, cli.getNombre());
            preparedStatement.setString(2,cli.getDni());
            preparedStatement.setString(3,cli.getTelefono());
            preparedStatement.setString(4,cli.getCorreo());
            preparedStatement.setString(5,cli.getDireccion());
            
            
            res= preparedStatement.executeUpdate();
            
            if(res==0){
                rpta = "Error";
            }
            
            
            
        }catch(Exception ex){
         
            rpta=ex.getMessage();
        }
        
        
        return rpta;
    }
     
     
    public String actualizarCliente(Cliente cli){
        
        int actualizo =0;
        String rpta = "Usuario Modificado Correctamente!";
        connection = conexion.getConnection();
        
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
            
                try{
                    preparedStatement = connection.prepareStatement("UPDATE cliente SET nombre=? ,dni=? ,telefono=?,correo=?,direccion=?  WHERE idCliente=?");
               
                    preparedStatement.setString(1,cli.getNombre());
                    preparedStatement.setString(2,cli.getDni());
                    preparedStatement.setString(3,cli.getTelefono()); 
                    preparedStatement.setString(4,cli.getCorreo());
                     preparedStatement.setString(5,cli.getDireccion());
                    preparedStatement.setInt(6,cli.getIdCliente());
                    
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
    
    public String eliminarCliente(Cliente cli){
        
        int eliminar =0;
        String rpta = "Cliente Eliminado Correctamente!";
        connection = conexion.getConnection();
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar Cliente?");
        
        if(confirmar == JOptionPane.YES_OPTION){
        
            if(connection!=null){
                
                
                try{
                    
                    preparedStatement = connection.prepareStatement("Delete from cliente WHERE idCliente=?");
                     preparedStatement.setInt(1,cli.getIdCliente());
                    
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

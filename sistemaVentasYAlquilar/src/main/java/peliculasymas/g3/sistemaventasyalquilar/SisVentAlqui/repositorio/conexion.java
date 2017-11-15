/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion {
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/sistemaVentasAlquiler";
      
    public conexion(){
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            
            if(conn!=null){
                JOptionPane.showMessageDialog(null,"Logueate :) ==> ");
            }
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro al conectar"+e.getMessage());
        }
    }
     
    public static Connection getConnection(){
        return conn;
    }
    public static void desconectar(){
        conn = null;
        if(conn == null){
            System.out.println("Conexion terminada");
        }
    }
}


package modelo;

import javax.swing.JOptionPane;
import java.sql.*;

//Establecemos conexión con nuestra base de datos localhost
public class conexion {
    //Variables para establecer la conexión
    private String db="banco";
    private String url="jdbc:mysql://localhost/" + db;
    private String user="root";
    private String pass="";
    private Connection con;

    public conexion() {
        this.con=null;
    }
    //método para conectar
    public Connection getConectar(){
        try{
            if(con==null){
                con=DriverManager.getConnection(url,user,pass);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        return con;
    }
    //método para desconectar
    public void getDesconectar(){
        try{
            if(con!=null && !con.isClosed()){
                con.close();
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
}

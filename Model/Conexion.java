package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alevante
 */

// Conexion a BD

public class Conexion {
    
    private final String nombreBD = "sena_store";
    private final String userName = "root";
    private final String password = "";
    private final String URL = "jdbc:mysql://localhost:3306/" + nombreBD;
    private Connection con = null;
    
    
    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.URL, this.userName, this.password);
            
        } catch(SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
               
}

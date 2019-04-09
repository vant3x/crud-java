package Model;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author alevante
 */
public class ConsultasPC extends Conexion {
    
    // registrar
    public boolean registrarComputadora(Computadora Pc) {
      PreparedStatement ps = null;
      Connection con = getConexion();
      

      String sql = "INSERT INTO producto (codigo_producto, nombre, precio, cantidad_actual, procesador, disco_duro, memoria_ram, sistema_operativo, marca)  VALUES(?,?,?,?,?,?,?,?,?)";
        
      
      try {
        ps = con.prepareStatement(sql);
            ps.setString(1, Pc.getCodigo_producto());
            ps.setString(2, Pc.getNombre());
            ps.setDouble(3, Pc.getPrecio());
            ps.setInt(4, Pc.getCantidad_actual());
            ps.setString(5, Pc.getProcesador());
            ps.setString(6, Pc.getDisco_duro());
            ps.setInt(7, Pc.getMemoria_ram());
            ps.setString(8, Pc.getSistema_operativo());
            ps.setString(9, Pc.getMarca());
            ps.execute();
            return true;
            
         } catch(SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch(SQLException e) {
                System.err.println(e);
            }
        }
                    
    }
    
}

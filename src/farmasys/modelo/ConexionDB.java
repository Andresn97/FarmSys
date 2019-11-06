
package farmasys.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
    
    private Connection ct; 
    private Statement st; 
    private ResultSet rs;

    public ConexionDB() {
        
        try {
            //Cargamos el driver  
            Class.forName("org.postgresql.Driver"); 
            //Nos conectamos  
            ct = DriverManager.getConnection(Config.BD_URL, Config.getUser(), Config.BD_PASS); 
            System.out.println("Nos conectamos.");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No pudimos conectarnos DB. "+ e.getMessage());
        }
        
    }
    
    public SQLException nosql(String noSql){
        try {
            //Variable para las transacciones  
            st = ct.createStatement(); 
            //Ejecutamos la sentencia SQL  
            st.execute(noSql);
            //Cerramos la consulta  
            st.close();
            //Si todo salio bienn retornamos nulo
            return null; 
        } catch (SQLException e) {
            System.out.println("No pudimos realizar la accion "+e.getMessage());
            return e; 
        }
    }
    
    public ResultSet sql(String sql){ 
        try {
            //Iniciamos la variable para las transacciones  
            st = ct.createStatement(); 
            //Ejecutamos la consulta
            rs = st.executeQuery(sql);
            //Si todo salio bien retornamos los resultados.
            return rs; 
        } catch (SQLException e) {
            System.out.println("No pudimos realizar la consulta. "+e.getMessage());
            return null; 
        }
        
    }
    
}

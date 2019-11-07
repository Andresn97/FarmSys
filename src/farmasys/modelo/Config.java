
package farmasys.modelo;

import farmasys.modelo.person.rol.RolBD;
import farmasys.modelo.person.usuario.UsuarioBD;
import java.awt.Color;
import java.util.concurrent.ForkJoinPool;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Config {
    
    public static final boolean M_DESARROLLO = true;
    
    public static final String BD_DATABASE = "database", BD_IP = "ip", BD_PUERTO = "port";
    //Direccion de las propiedades de base de datos
    public static final String BD_DIRECCION = "configuracion.properties";
    //Nombre de las propiedades la version
//    public static final String V_AUTOR = "Autor", V_NOMBRE = "Nombre", V_VERSION = "Version",
//            V_NOTAS = "Notas", V_FECHA = "Fecha";
    //Direccion de las propiedades de version  
//    public static final String V_DIR = "version.properties";

    public static Color ERROR_COLOR = new Color(159, 53, 39);
    public static Color SUCCESS_COLOR = new Color(10, 186, 52);
////
////    public static Border ERR_BORDER = new LineBorder(ERROR_COLOR, 1);
////    public static Border DEFAULT_BORDER = UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border");
    
    public static RolBD ROL;
    public static ForkJoinPool THREAD_POOL;
    public static UsuarioBD USUARIO;

    /*
        Base de datos
     */
    public static String BD_PASS = "farmsys123";
    public static String BD_URL = "jdbc:postgresql://localhost:5433/FarmSys";
    //public static String BD_URL = "jdbc:postgresql://35.192.7.211:5432/BDnotas";
    public static final String DB_IP = "localhost:5432";
    
    public static String getUser() {
        
        if (ROL != null) {
            if (ROL.getRol_nombre().equalsIgnoreCase("admin")) {
                return ROL.getRol_nombre().toUpperCase();
            } else if (ROL.getRol_nombre().equalsIgnoreCase("empleado")) {
                return ROL.getRol_nombre().toUpperCase();
            }            
        }
        
        return null;
        
    }
    
    public static void setUser( UsuarioBD usuario ){
        Config.USUARIO = usuario;
    }
    
    public static void setRol( RolBD rol ){
        
        Config.ROL = rol;
        
    }

    public static ForkJoinPool getPool(Integer threads) {
        if (threads == null) {
            if (THREAD_POOL == null) {
                THREAD_POOL = new ForkJoinPool(4);
            } else {
                if (THREAD_POOL.isShutdown()) {
                }
            }
        } else {
            THREAD_POOL = new ForkJoinPool(threads);
        }
        return THREAD_POOL;
    }

}

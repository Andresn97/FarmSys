
package farmasys.modelo;

import java.awt.Color;
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

    public static Border ERR_BORDER = new LineBorder(ERROR_COLOR, 1);
    public static Border DEFAULT_BORDER = UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border");

    /*
        Base de datos
     */
    public static String BD_PASS = "NuEvOsErVeR1997";
    public static String BD_URL = "jdbc:postgresql://localhost:5433/FarmSys";
    //public static String BD_URL = "jdbc:postgresql://35.192.7.211:5432/BDnotas";
    public static final String DB_IP = "localhost:5432";

}

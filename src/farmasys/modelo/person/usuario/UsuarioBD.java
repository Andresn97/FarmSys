
package farmasys.modelo.person.usuario;

import farmasys.modelo.ConexDBHikari;
import farmasys.modelo.person.PersonaMD;
import farmasys.modelo.person.rol.RolMD;
import java.sql.Connection;
import java.sql.ResultSet;

public class UsuarioBD extends UsuarioMD{
    
    private final ConexDBHikari conexion;
    private Connection conn;
    private ResultSet rs;
    
    {
        conexion = new ConexDBHikari();
    }

    public UsuarioBD() {
    }

    public UsuarioBD(Long id_usuario, PersonaMD persona, RolMD rol, String usuario_nombre, String usuario_contrasena, String usuario_tipo, boolean usuario_activo) {
        super(id_usuario, persona, rol, usuario_nombre, usuario_contrasena, usuario_tipo, usuario_activo);
    }
    
    public UsuarioBD(UsuarioMD obj){
        setRol(obj.getRol());
        setPersona(obj.getPersona());
        setUsuario_nombre(obj.getUsuario_nombre());
        setUsuario_contrasena(obj.getUsuario_contrasena());
        setUsuario_tipo(obj.getUsuario_tipo());
        setUsuario_activo(obj.isUsuario_activo());
    }
    
}

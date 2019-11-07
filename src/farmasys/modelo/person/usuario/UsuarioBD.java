
package farmasys.modelo.person.usuario;

import farmasys.modelo.ConexDBHikari;
import farmasys.modelo.person.PersonaMD;
import farmasys.modelo.person.rol.RolMD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

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
    
    public Map<String, Object> insertar() {
        Map context = new HashMap();
        Map<Integer, Object> parametros = new HashMap<>();

        String INSERT = ""
                + "INSERT INTO \"Usuarios\" \n"
                + " (id_persona, usuario_nombre, usuario_tipo, id_rol, usuario_contrasena )\n"
                + " VALUES (?, ?, ?, ?, set_byte( MD5( ? ) :: bytea, 4, 64 ) );\n";

        parametros.put(1, getPersona().getId_persona());
        parametros.put(2, getUsuario_nombre());
        parametros.put(3, getUsuario_tipo());
        parametros.put(3, getRol().getId_rol());
        parametros.put(3, getUsuario_contrasena());
        conn = conexion.getConnection();

        SQLException error = conexion.ejecutar(INSERT, conn, parametros);
        context.put("value", (error == null));
        context.put("error", error);

        return context;

    }
    
    public UsuarioBD seleccionarUserYCon() {
        String SELECT = "SELECT u.id_persona, per.persona_identificacion, per.persona_primer_nombre,\n" +
                        "per.persona_segundo_nombre, per.persona_primer_apellido,\n" +
                        "per.persona_segundo_apellido, per.persona_edad\n" +
                        "FROM person.\"usuario\" u JOIN person.\"persona\" per USING(id_persona)\n" +
                        "WHERE u.usuario_nombre = ? \n" +
                        "AND u.usuario_contrasena = set_byte( MD5( ? ) :: bytea, 4, 64 )\n" +
                        "AND u.usuario_activo = true;";
        UsuarioBD usuario = null;
        try {

            Map<Integer, Object> parametros = new HashMap<>();

            parametros.put(1, getUsuario_nombre());
            parametros.put(2, getUsuario_contrasena());
            conn = conexion.getConnection();
            rs = conexion.ejecutarQuery(SELECT, conn, parametros);

            while (rs.next()) {

                usuario = new UsuarioBD();
                usuario.setUsuario_nombre(getUsuario_nombre());

                PersonaMD persona = new PersonaMD();

                persona.setId_persona(rs.getLong("id_persona"));
                persona.setPersona_identificacion(rs.getString("persona_identificacion"));
                persona.setPersona_primer_apellido(rs.getString("persona_primer_apellido"));
                persona.setPersona_segundo_apellido(rs.getString("persona_segundo_apellido"));
                persona.setPersona_primer_nombre(rs.getString("persona_primer_nombre"));
                persona.setPersona_segundo_nombre(rs.getString("persona_segundo_nombre"));

                usuario.setPersona(persona);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            conexion.closeStmt().close(rs).close(conn);
        }

        return usuario;
    }
    
}

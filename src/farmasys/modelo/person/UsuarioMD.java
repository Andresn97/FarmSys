
package farmasys.modelo.person;

public class UsuarioMD {
    
    private Long id_usuario;
    //Llave foránea
    private PersonaMD persona;
    //Llave foránea
    private RolMD rol;
    private String usuario_nombre;
    private String usuario_contrasena;
    private String usuario_tipo;
    private boolean usuario_activo;

    public UsuarioMD() {
    }

    public UsuarioMD(Long id_usuario, PersonaMD persona, RolMD rol, String usuario_nombre, String usuario_contrasena, String usuario_tipo, boolean usuario_activo) {
        this.id_usuario = id_usuario;
        this.persona = persona;
        this.rol = rol;
        this.usuario_nombre = usuario_nombre;
        this.usuario_contrasena = usuario_contrasena;
        this.usuario_tipo = usuario_tipo;
        this.usuario_activo = usuario_activo;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public PersonaMD getPersona() {
        return persona;
    }

    public void setPersona(PersonaMD persona) {
        this.persona = persona;
    }

    public RolMD getRol() {
        return rol;
    }

    public void setRol(RolMD rol) {
        this.rol = rol;
    }

    public String getUsuario_nombre() {
        return usuario_nombre;
    }

    public void setUsuario_nombre(String usuario_nombre) {
        this.usuario_nombre = usuario_nombre;
    }

    public String getUsuario_contrasena() {
        return usuario_contrasena;
    }

    public void setUsuario_contrasena(String usuario_contrasena) {
        this.usuario_contrasena = usuario_contrasena;
    }

    public String getUsuario_tipo() {
        return usuario_tipo;
    }

    public void setUsuario_tipo(String usuario_tipo) {
        this.usuario_tipo = usuario_tipo;
    }

    public boolean isUsuario_activo() {
        return usuario_activo;
    }

    public void setUsuario_activo(boolean usuario_activo) {
        this.usuario_activo = usuario_activo;
    }
    
    
    
}

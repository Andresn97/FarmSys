
package farmasys.modelo.person;

public class RolMD {
    
    private Long id_rol;
    private String rol_nombre;
    private boolean rol_activo;

    public RolMD() {
    }

    public RolMD(Long id_rol, String rol_nombre, boolean rol_activo) {
        this.id_rol = id_rol;
        this.rol_nombre = rol_nombre;
        this.rol_activo = rol_activo;
    }

    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol_nombre() {
        return rol_nombre;
    }

    public void setRol_nombre(String rol_nombre) {
        this.rol_nombre = rol_nombre;
    }

    public boolean isRol_activo() {
        return rol_activo;
    }

    public void setRol_activo(boolean rol_activo) {
        this.rol_activo = rol_activo;
    }
    
    
    
}

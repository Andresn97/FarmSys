
package farmasys.modelo.auditory;

import farmasys.modelo.person.usuario.UsuarioMD;
import java.util.Date;

public class UsuarioBloqueadoMD {
    
    private Long id_usuario_bloqueado;
    //Llave foránea
    private UsuarioMD usuario;
    private String usuario_motivo_bloqueo;
    private Date usuario_fecha_bloqueo;
    private boolean usuario_bloqueo_activo;

    public UsuarioBloqueadoMD() {
    }

    public UsuarioBloqueadoMD(Long id_usuario_bloqueado, UsuarioMD usuario, String usuario_motivo_bloqueo, Date usuario_fecha_bloqueo, boolean usuario_bloqueo_activo) {
        this.id_usuario_bloqueado = id_usuario_bloqueado;
        this.usuario = usuario;
        this.usuario_motivo_bloqueo = usuario_motivo_bloqueo;
        this.usuario_fecha_bloqueo = usuario_fecha_bloqueo;
        this.usuario_bloqueo_activo = usuario_bloqueo_activo;
    }

    public Long getId_usuario_bloqueado() {
        return id_usuario_bloqueado;
    }

    public void setId_usuario_bloqueado(Long id_usuario_bloqueado) {
        this.id_usuario_bloqueado = id_usuario_bloqueado;
    }

    public UsuarioMD getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioMD usuario) {
        this.usuario = usuario;
    }

    public String getUsuario_motivo_bloqueo() {
        return usuario_motivo_bloqueo;
    }

    public void setUsuario_motivo_bloqueo(String usuario_motivo_bloqueo) {
        this.usuario_motivo_bloqueo = usuario_motivo_bloqueo;
    }

    public Date getUsuario_fecha_bloqueo() {
        return usuario_fecha_bloqueo;
    }

    public void setUsuario_fecha_bloqueo(Date usuario_fecha_bloqueo) {
        this.usuario_fecha_bloqueo = usuario_fecha_bloqueo;
    }

    public boolean isUsuario_bloqueo_activo() {
        return usuario_bloqueo_activo;
    }

    public void setUsuario_bloqueo_activo(boolean usuario_bloqueo_activo) {
        this.usuario_bloqueo_activo = usuario_bloqueo_activo;
    }
    
    
    
}


package farmasys.modelo.auditory;

import farmasys.modelo.person.UsuarioMD;
import java.util.Date;

public class HistorialUsuarioMD {
    
    private Long id_historial_usuario;
    private UsuarioMD usuario;
    private Date historial_usuario_fecha;
    private boolean historial_usuario_activo;

    public HistorialUsuarioMD() {
    }

    public HistorialUsuarioMD(Long id_historial_usuario, UsuarioMD usuario, Date historial_usuario_fecha, boolean historial_usuario_activo) {
        this.id_historial_usuario = id_historial_usuario;
        this.usuario = usuario;
        this.historial_usuario_fecha = historial_usuario_fecha;
        this.historial_usuario_activo = historial_usuario_activo;
    }

    public Long getId_historial_usuario() {
        return id_historial_usuario;
    }

    public void setId_historial_usuario(Long id_historial_usuario) {
        this.id_historial_usuario = id_historial_usuario;
    }

    public UsuarioMD getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioMD usuario) {
        this.usuario = usuario;
    }

    public Date getHistorial_usuario_fecha() {
        return historial_usuario_fecha;
    }

    public void setHistorial_usuario_fecha(Date historial_usuario_fecha) {
        this.historial_usuario_fecha = historial_usuario_fecha;
    }

    public boolean isHistorial_usuario_activo() {
        return historial_usuario_activo;
    }

    public void setHistorial_usuario_activo(boolean historial_usuario_activo) {
        this.historial_usuario_activo = historial_usuario_activo;
    }
    
    
    
}

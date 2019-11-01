
package farmasys.modelo.auditory;

import farmasys.modelo.person.ClienteMD;
import java.util.Date;

public class ClienteBloqueadoMD {
    
    private Long id_cliente_bloqueado;
    //Llave foránea
    private ClienteMD cliente;
    private String cliente_bloqueado_motivo;
    private Date cliente_fecha_bloqueado;
    private boolean cliente_bloqueado_activo;

    public ClienteBloqueadoMD() {
    }

    public ClienteBloqueadoMD(Long id_cliente_bloqueado, ClienteMD cliente, String cliente_bloqueado_motivo, Date cliente_fecha_bloqueado, boolean cliente_bloqueado_activo) {
        this.id_cliente_bloqueado = id_cliente_bloqueado;
        this.cliente = cliente;
        this.cliente_bloqueado_motivo = cliente_bloqueado_motivo;
        this.cliente_fecha_bloqueado = cliente_fecha_bloqueado;
        this.cliente_bloqueado_activo = cliente_bloqueado_activo;
    }

    public Long getId_cliente_bloqueado() {
        return id_cliente_bloqueado;
    }

    public void setId_cliente_bloqueado(Long id_cliente_bloqueado) {
        this.id_cliente_bloqueado = id_cliente_bloqueado;
    }

    public ClienteMD getCliente() {
        return cliente;
    }

    public void setCliente(ClienteMD cliente) {
        this.cliente = cliente;
    }

    public String getCliente_bloqueado_motivo() {
        return cliente_bloqueado_motivo;
    }

    public void setCliente_bloqueado_motivo(String cliente_bloqueado_motivo) {
        this.cliente_bloqueado_motivo = cliente_bloqueado_motivo;
    }

    public Date getCliente_fecha_bloqueado() {
        return cliente_fecha_bloqueado;
    }

    public void setCliente_fecha_bloqueado(Date cliente_fecha_bloqueado) {
        this.cliente_fecha_bloqueado = cliente_fecha_bloqueado;
    }

    public boolean isCliente_bloqueado_activo() {
        return cliente_bloqueado_activo;
    }

    public void setCliente_bloqueado_activo(boolean cliente_bloqueado_activo) {
        this.cliente_bloqueado_activo = cliente_bloqueado_activo;
    }
    
    
    
}

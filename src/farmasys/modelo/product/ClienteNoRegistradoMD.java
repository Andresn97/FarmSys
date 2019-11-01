
package farmasys.modelo.product;

import java.util.Date;

public class ClienteNoRegistradoMD {
    
    private Long id_cliente_no_registrado;
    private String cliente_no_registrado_referencia;
    private Date cliente_no_registrado_fecha;
    private boolean cliente_no_registrado_activo;

    public ClienteNoRegistradoMD() {
    }

    public ClienteNoRegistradoMD(Long id_cliente_no_registrado, String cliente_no_registrado_referencia, Date cliente_no_registrado_fecha, boolean cliente_no_registrado_activo) {
        this.id_cliente_no_registrado = id_cliente_no_registrado;
        this.cliente_no_registrado_referencia = cliente_no_registrado_referencia;
        this.cliente_no_registrado_fecha = cliente_no_registrado_fecha;
        this.cliente_no_registrado_activo = cliente_no_registrado_activo;
    }

    public Long getId_cliente_no_registrado() {
        return id_cliente_no_registrado;
    }

    public void setId_cliente_no_registrado(Long id_cliente_no_registrado) {
        this.id_cliente_no_registrado = id_cliente_no_registrado;
    }

    public String getCliente_no_registrado_referencia() {
        return cliente_no_registrado_referencia;
    }

    public void setCliente_no_registrado_referencia(String cliente_no_registrado_referencia) {
        this.cliente_no_registrado_referencia = cliente_no_registrado_referencia;
    }

    public Date getCliente_no_registrado_fecha() {
        return cliente_no_registrado_fecha;
    }

    public void setCliente_no_registrado_fecha(Date cliente_no_registrado_fecha) {
        this.cliente_no_registrado_fecha = cliente_no_registrado_fecha;
    }

    public boolean isCliente_no_registrado_activo() {
        return cliente_no_registrado_activo;
    }

    public void setCliente_no_registrado_activo(boolean cliente_no_registrado_activo) {
        this.cliente_no_registrado_activo = cliente_no_registrado_activo;
    }
    
    
    
}

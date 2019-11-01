
package farmasys.modelo.auditory;

import farmasys.modelo.person.FacturaMD;
import java.util.Date;

public class FacturaBloqueadaMD {
    
    private Long id_factura_bloqueada;
    private FacturaMD factura;
    private String factura_motivo_bloqueo;
    private Date factura_fecha_bloqueo;
    private boolean factura_bloqueada_activa;

    public FacturaBloqueadaMD() {
    }

    public FacturaBloqueadaMD(Long id_factura_bloqueada, FacturaMD factura, String factura_motivo_bloqueo, Date factura_fecha_bloqueo, boolean factura_bloqueada_activa) {
        this.id_factura_bloqueada = id_factura_bloqueada;
        this.factura = factura;
        this.factura_motivo_bloqueo = factura_motivo_bloqueo;
        this.factura_fecha_bloqueo = factura_fecha_bloqueo;
        this.factura_bloqueada_activa = factura_bloqueada_activa;
    }

    public Long getId_factura_bloqueada() {
        return id_factura_bloqueada;
    }

    public void setId_factura_bloqueada(Long id_factura_bloqueada) {
        this.id_factura_bloqueada = id_factura_bloqueada;
    }

    public FacturaMD getFactura() {
        return factura;
    }

    public void setFactura(FacturaMD factura) {
        this.factura = factura;
    }

    public String getFactura_motivo_bloqueo() {
        return factura_motivo_bloqueo;
    }

    public void setFactura_motivo_bloqueo(String factura_motivo_bloqueo) {
        this.factura_motivo_bloqueo = factura_motivo_bloqueo;
    }

    public Date getFactura_fecha_bloqueo() {
        return factura_fecha_bloqueo;
    }

    public void setFactura_fecha_bloqueo(Date factura_fecha_bloqueo) {
        this.factura_fecha_bloqueo = factura_fecha_bloqueo;
    }

    public boolean isFactura_bloqueada_activa() {
        return factura_bloqueada_activa;
    }

    public void setFactura_bloqueada_activa(boolean factura_bloqueada_activa) {
        this.factura_bloqueada_activa = factura_bloqueada_activa;
    }
 
    
    
}

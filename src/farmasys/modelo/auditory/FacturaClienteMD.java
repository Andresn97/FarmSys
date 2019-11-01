
package farmasys.modelo.auditory;

import farmasys.modelo.person.ClienteMD;
import farmasys.modelo.person.FacturaMD;
import java.util.Date;

public class FacturaClienteMD {
    
    private Long id_factura_cliente;
    private ClienteMD cliente;
    private FacturaMD factura;
    private Date factura_cliente_fecha;
    private boolean factura_cliente_activo;

    public FacturaClienteMD() {
    }

    public FacturaClienteMD(Long id_factura_cliente, ClienteMD cliente, FacturaMD factura, Date factura_cliente_fecha, boolean factura_cliente_activo) {
        this.id_factura_cliente = id_factura_cliente;
        this.cliente = cliente;
        this.factura = factura;
        this.factura_cliente_fecha = factura_cliente_fecha;
        this.factura_cliente_activo = factura_cliente_activo;
    }

    public Long getId_factura_cliente() {
        return id_factura_cliente;
    }

    public void setId_factura_cliente(Long id_factura_cliente) {
        this.id_factura_cliente = id_factura_cliente;
    }

    public ClienteMD getCliente() {
        return cliente;
    }

    public void setCliente(ClienteMD cliente) {
        this.cliente = cliente;
    }

    public FacturaMD getFactura() {
        return factura;
    }

    public void setFactura(FacturaMD factura) {
        this.factura = factura;
    }

    public Date getFactura_cliente_fecha() {
        return factura_cliente_fecha;
    }

    public void setFactura_cliente_fecha(Date factura_cliente_fecha) {
        this.factura_cliente_fecha = factura_cliente_fecha;
    }

    public boolean isFactura_cliente_activo() {
        return factura_cliente_activo;
    }

    public void setFactura_cliente_activo(boolean factura_cliente_activo) {
        this.factura_cliente_activo = factura_cliente_activo;
    }
    
    
    
}

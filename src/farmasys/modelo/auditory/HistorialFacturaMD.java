
package farmasys.modelo.auditory;

import farmasys.modelo.person.FacturaMD;
import farmasys.modelo.person.FarmaceuticoMD;
import java.util.Date;

public class HistorialFacturaMD {
    
    private Long id_historial_factura;
    private FacturaMD factura;
    private FarmaceuticoMD farmaceutico;
    private Date historial_factura_fecha;
    private boolean historial_factura_activo;

    public HistorialFacturaMD() {
    }

    public HistorialFacturaMD(Long id_historial_factura, FacturaMD factura, FarmaceuticoMD farmaceutico, Date historial_factura_fecha, boolean historial_factura_activo) {
        this.id_historial_factura = id_historial_factura;
        this.factura = factura;
        this.farmaceutico = farmaceutico;
        this.historial_factura_fecha = historial_factura_fecha;
        this.historial_factura_activo = historial_factura_activo;
    }

    public Long getId_historial_factura() {
        return id_historial_factura;
    }

    public void setId_historial_factura(Long id_historial_factura) {
        this.id_historial_factura = id_historial_factura;
    }

    public FacturaMD getFactura() {
        return factura;
    }

    public void setFactura(FacturaMD factura) {
        this.factura = factura;
    }

    public FarmaceuticoMD getFarmaceutico() {
        return farmaceutico;
    }

    public void setFarmaceutico(FarmaceuticoMD farmaceutico) {
        this.farmaceutico = farmaceutico;
    }

    public Date getHistorial_factura_fecha() {
        return historial_factura_fecha;
    }

    public void setHistorial_factura_fecha(Date historial_factura_fecha) {
        this.historial_factura_fecha = historial_factura_fecha;
    }

    public boolean isHistorial_factura_activo() {
        return historial_factura_activo;
    }

    public void setHistorial_factura_activo(boolean historial_factura_activo) {
        this.historial_factura_activo = historial_factura_activo;
    }
    
    
    
}

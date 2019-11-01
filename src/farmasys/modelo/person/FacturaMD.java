
package farmasys.modelo.person;

import farmasys.modelo.product.SucursalMD;
import java.util.Date;

public class FacturaMD {
    
    private Long id_factura;
    //Llave foránea
    private SucursalMD sucursal;
    //Llave foránea
    private FarmaceuticoMD farmacuetico;
    private int factura_cantidad_unidades;
    private int factura_cantidad;
    private double factura_subtotal;
    private double factura_iva;
    private Date factura_fecha_ingreso;
    private double factura_total;
    private boolean factura_tiene_cliente;
    private boolean factura_activa;

    public FacturaMD() {
    }

    public FacturaMD(Long id_factura, SucursalMD sucursal, FarmaceuticoMD farmacuetico, int factura_cantidad_unidades, int factura_cantidad, double factura_subtotal, double factura_iva, Date factura_fecha_ingreso, double factura_total, boolean factura_tiene_cliente, boolean factura_activa) {
        this.id_factura = id_factura;
        this.sucursal = sucursal;
        this.farmacuetico = farmacuetico;
        this.factura_cantidad_unidades = factura_cantidad_unidades;
        this.factura_cantidad = factura_cantidad;
        this.factura_subtotal = factura_subtotal;
        this.factura_iva = factura_iva;
        this.factura_fecha_ingreso = factura_fecha_ingreso;
        this.factura_total = factura_total;
        this.factura_tiene_cliente = factura_tiene_cliente;
        this.factura_activa = factura_activa;
    }

    public Long getId_factura() {
        return id_factura;
    }

    public void setId_factura(Long id_factura) {
        this.id_factura = id_factura;
    }

    public SucursalMD getSucursal() {
        return sucursal;
    }

    public void setSucursal(SucursalMD sucursal) {
        this.sucursal = sucursal;
    }

    public FarmaceuticoMD getFarmacuetico() {
        return farmacuetico;
    }

    public void setFarmacuetico(FarmaceuticoMD farmacuetico) {
        this.farmacuetico = farmacuetico;
    }

    public int getFactura_cantidad_unidades() {
        return factura_cantidad_unidades;
    }

    public void setFactura_cantidad_unidades(int factura_cantidad_unidades) {
        this.factura_cantidad_unidades = factura_cantidad_unidades;
    }

    public int getFactura_cantidad() {
        return factura_cantidad;
    }

    public void setFactura_cantidad(int factura_cantidad) {
        this.factura_cantidad = factura_cantidad;
    }

    public double getFactura_subtotal() {
        return factura_subtotal;
    }

    public void setFactura_subtotal(double factura_subtotal) {
        this.factura_subtotal = factura_subtotal;
    }

    public double getFactura_iva() {
        return factura_iva;
    }

    public void setFactura_iva(double factura_iva) {
        this.factura_iva = factura_iva;
    }

    public Date getFactura_fecha_ingreso() {
        return factura_fecha_ingreso;
    }

    public void setFactura_fecha_ingreso(Date factura_fecha_ingreso) {
        this.factura_fecha_ingreso = factura_fecha_ingreso;
    }

    public double getFactura_total() {
        return factura_total;
    }

    public void setFactura_total(double factura_total) {
        this.factura_total = factura_total;
    }

    public boolean isFactura_tiene_cliente() {
        return factura_tiene_cliente;
    }

    public void setFactura_tiene_cliente(boolean factura_tiene_cliente) {
        this.factura_tiene_cliente = factura_tiene_cliente;
    }

    public boolean isFactura_activa() {
        return factura_activa;
    }

    public void setFactura_activa(boolean factura_activa) {
        this.factura_activa = factura_activa;
    }
    
    
    
}

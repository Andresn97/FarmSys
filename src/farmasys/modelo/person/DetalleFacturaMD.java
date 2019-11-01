
package farmasys.modelo.person;

import farmasys.modelo.product.ProductoMD;

public class DetalleFacturaMD {
    
    private Long id_detalle_factura;
    private FacturaMD factura;
    private ProductoMD producto;
    private int cantidad_producto;
    private int cantidad_unidades;
    private double total_detalle_factura;
    private boolean detalle_factura_activo;

    public DetalleFacturaMD() {
    }

    public DetalleFacturaMD(Long id_detalle_factura, FacturaMD factura, ProductoMD producto, int cantidad_producto, int cantidad_unidades, double total_detalle_factura, boolean detalle_factura_activo) {
        this.id_detalle_factura = id_detalle_factura;
        this.factura = factura;
        this.producto = producto;
        this.cantidad_producto = cantidad_producto;
        this.cantidad_unidades = cantidad_unidades;
        this.total_detalle_factura = total_detalle_factura;
        this.detalle_factura_activo = detalle_factura_activo;
    }

    public Long getId_detalle_factura() {
        return id_detalle_factura;
    }

    public void setId_detalle_factura(Long id_detalle_factura) {
        this.id_detalle_factura = id_detalle_factura;
    }

    public FacturaMD getFactura() {
        return factura;
    }

    public void setFactura(FacturaMD factura) {
        this.factura = factura;
    }

    public ProductoMD getProducto() {
        return producto;
    }

    public void setProducto(ProductoMD producto) {
        this.producto = producto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public int getCantidad_unidades() {
        return cantidad_unidades;
    }

    public void setCantidad_unidades(int cantidad_unidades) {
        this.cantidad_unidades = cantidad_unidades;
    }

    public double getTotal_detalle_factura() {
        return total_detalle_factura;
    }

    public void setTotal_detalle_factura(double total_detalle_factura) {
        this.total_detalle_factura = total_detalle_factura;
    }

    public boolean isDetalle_factura_activo() {
        return detalle_factura_activo;
    }

    public void setDetalle_factura_activo(boolean detalle_factura_activo) {
        this.detalle_factura_activo = detalle_factura_activo;
    }
    
    
    
}


package farmasys.modelo.auditory;

import farmasys.modelo.product.ProductoMD;
import java.util.Date;

public class HistorialProductoMD {
    
    private Long id_historial_producto;
    //Llave foránea
    private ProductoMD producto;
    private Date historial_producto_fecha;
    private boolean historial_producto_activo;

    public HistorialProductoMD() {
    }

    public HistorialProductoMD(Long id_historial_producto, ProductoMD producto, Date historial_producto_fecha, boolean historial_producto_activo) {
        this.id_historial_producto = id_historial_producto;
        this.producto = producto;
        this.historial_producto_fecha = historial_producto_fecha;
        this.historial_producto_activo = historial_producto_activo;
    }

    public Long getId_historial_producto() {
        return id_historial_producto;
    }

    public void setId_historial_producto(Long id_historial_producto) {
        this.id_historial_producto = id_historial_producto;
    }

    public ProductoMD getProducto() {
        return producto;
    }

    public void setProducto(ProductoMD producto) {
        this.producto = producto;
    }

    public Date getHistorial_producto_fecha() {
        return historial_producto_fecha;
    }

    public void setHistorial_producto_fecha(Date historial_producto_fecha) {
        this.historial_producto_fecha = historial_producto_fecha;
    }

    public boolean isHistorial_producto_activo() {
        return historial_producto_activo;
    }

    public void setHistorial_producto_activo(boolean historial_producto_activo) {
        this.historial_producto_activo = historial_producto_activo;
    }
    
    
    
}

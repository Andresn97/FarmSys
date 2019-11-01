
package farmasys.modelo.person;

import farmasys.modelo.product.ProductoMD;
import java.util.Date;

public class PreferenciaClienteMD {
    
    private Long id_preferencia_cliente;
    private ClienteMD cliente;
    private ProductoMD producto;
    private int producto_cantidad;
    private int producto_cantidad_unidades;
    private Date preferencia_fecha_ingreso;
    private boolean preferencia_activa;

    public PreferenciaClienteMD() {
    }

    public PreferenciaClienteMD(Long id_preferencia_cliente, ClienteMD cliente, ProductoMD producto, int producto_cantidad, int producto_cantidad_unidades, Date preferencia_fecha_ingreso, boolean preferencia_activa) {
        this.id_preferencia_cliente = id_preferencia_cliente;
        this.cliente = cliente;
        this.producto = producto;
        this.producto_cantidad = producto_cantidad;
        this.producto_cantidad_unidades = producto_cantidad_unidades;
        this.preferencia_fecha_ingreso = preferencia_fecha_ingreso;
        this.preferencia_activa = preferencia_activa;
    }

    public Long getId_preferencia_cliente() {
        return id_preferencia_cliente;
    }

    public void setId_preferencia_cliente(Long id_preferencia_cliente) {
        this.id_preferencia_cliente = id_preferencia_cliente;
    }

    public ClienteMD getCliente() {
        return cliente;
    }

    public void setCliente(ClienteMD cliente) {
        this.cliente = cliente;
    }

    public ProductoMD getProducto() {
        return producto;
    }

    public void setProducto(ProductoMD producto) {
        this.producto = producto;
    }

    public int getProducto_cantidad() {
        return producto_cantidad;
    }

    public void setProducto_cantidad(int producto_cantidad) {
        this.producto_cantidad = producto_cantidad;
    }

    public int getProducto_cantidad_unidades() {
        return producto_cantidad_unidades;
    }

    public void setProducto_cantidad_unidades(int producto_cantidad_unidades) {
        this.producto_cantidad_unidades = producto_cantidad_unidades;
    }

    public Date getPreferencia_fecha_ingreso() {
        return preferencia_fecha_ingreso;
    }

    public void setPreferencia_fecha_ingreso(Date preferencia_fecha_ingreso) {
        this.preferencia_fecha_ingreso = preferencia_fecha_ingreso;
    }

    public boolean isPreferencia_activa() {
        return preferencia_activa;
    }

    public void setPreferencia_activa(boolean preferencia_activa) {
        this.preferencia_activa = preferencia_activa;
    }
    
    
    
}

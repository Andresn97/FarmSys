
package farmasys.modelo.product;

import java.util.Date;

public class PreferenciaNoRegistradoMD {
    
    private Long id_no_registrado_preferencia;
    private ProductoMD producto;
    private ClienteNoRegistradoMD cliente_no_registrado;
    private int producto_cantidad;
    private int producto_cantidad_unidades;
    private Date fecha_registro;
    private boolean no_registrado_preferencia_activo;

    public PreferenciaNoRegistradoMD() {
    }

    public PreferenciaNoRegistradoMD(Long id_no_registrado_preferencia, ProductoMD producto, ClienteNoRegistradoMD cliente_no_registrado, int producto_cantidad, int producto_cantidad_unidades, Date fecha_registro, boolean no_registrado_preferencia_activo) {
        this.id_no_registrado_preferencia = id_no_registrado_preferencia;
        this.producto = producto;
        this.cliente_no_registrado = cliente_no_registrado;
        this.producto_cantidad = producto_cantidad;
        this.producto_cantidad_unidades = producto_cantidad_unidades;
        this.fecha_registro = fecha_registro;
        this.no_registrado_preferencia_activo = no_registrado_preferencia_activo;
    }

    public Long getId_no_registrado_preferencia() {
        return id_no_registrado_preferencia;
    }

    public void setId_no_registrado_preferencia(Long id_no_registrado_preferencia) {
        this.id_no_registrado_preferencia = id_no_registrado_preferencia;
    }

    public ProductoMD getProducto() {
        return producto;
    }

    public void setProducto(ProductoMD producto) {
        this.producto = producto;
    }

    public ClienteNoRegistradoMD getCliente_no_registrado() {
        return cliente_no_registrado;
    }

    public void setCliente_no_registrado(ClienteNoRegistradoMD cliente_no_registrado) {
        this.cliente_no_registrado = cliente_no_registrado;
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

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public boolean isNo_registrado_preferencia_activo() {
        return no_registrado_preferencia_activo;
    }

    public void setNo_registrado_preferencia_activo(boolean no_registrado_preferencia_activo) {
        this.no_registrado_preferencia_activo = no_registrado_preferencia_activo;
    }
    
    
    
}

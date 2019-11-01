
package farmasys.modelo.product;

public class UsoProductoMD {
    
    private Long id_uso_producto;
    private ProductoMD producto;
    private String uso_nombre;
    private boolean uso_producto_activo;

    public UsoProductoMD() {
    }

    public UsoProductoMD(Long id_uso_producto, ProductoMD producto, String uso_nombre, boolean uso_producto_activo) {
        this.id_uso_producto = id_uso_producto;
        this.producto = producto;
        this.uso_nombre = uso_nombre;
        this.uso_producto_activo = uso_producto_activo;
    }

    public Long getId_uso_producto() {
        return id_uso_producto;
    }

    public void setId_uso_producto(Long id_uso_producto) {
        this.id_uso_producto = id_uso_producto;
    }

    public ProductoMD getProducto() {
        return producto;
    }

    public void setProducto(ProductoMD producto) {
        this.producto = producto;
    }

    public String getUso_nombre() {
        return uso_nombre;
    }

    public void setUso_nombre(String uso_nombre) {
        this.uso_nombre = uso_nombre;
    }

    public boolean isUso_producto_activo() {
        return uso_producto_activo;
    }

    public void setUso_producto_activo(boolean uso_producto_activo) {
        this.uso_producto_activo = uso_producto_activo;
    }
    
    
    
}

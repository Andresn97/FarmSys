
package farmasys.modelo.product;

import java.util.Date;

public class ProductoCategoriaMD {
    
    private Long id_producto_categoria;
    private ProductoMD producto;
    private CategoriaMD categoria;
    private Date producto_categoria_fecha;
    private boolean producto_categoria_activo;

    public ProductoCategoriaMD() {
    }

    public ProductoCategoriaMD(Long id_producto_categoria, ProductoMD producto, CategoriaMD categoria, Date producto_categoria_fecha, boolean producto_categoria_activo) {
        this.id_producto_categoria = id_producto_categoria;
        this.producto = producto;
        this.categoria = categoria;
        this.producto_categoria_fecha = producto_categoria_fecha;
        this.producto_categoria_activo = producto_categoria_activo;
    }

    public Long getId_producto_categoria() {
        return id_producto_categoria;
    }

    public void setId_producto_categoria(Long id_producto_categoria) {
        this.id_producto_categoria = id_producto_categoria;
    }

    public ProductoMD getProducto() {
        return producto;
    }

    public void setProducto(ProductoMD producto) {
        this.producto = producto;
    }

    public CategoriaMD getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaMD categoria) {
        this.categoria = categoria;
    }

    public Date getProducto_categoria_fecha() {
        return producto_categoria_fecha;
    }

    public void setProducto_categoria_fecha(Date producto_categoria_fecha) {
        this.producto_categoria_fecha = producto_categoria_fecha;
    }

    public boolean isProducto_categoria_activo() {
        return producto_categoria_activo;
    }

    public void setProducto_categoria_activo(boolean producto_categoria_activo) {
        this.producto_categoria_activo = producto_categoria_activo;
    }
    
    
    
}

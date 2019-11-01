
package farmasys.modelo.product;

public class ImagenProductoMD {
    
    private Long id_imagen_producto;
    private ProductoMD producto;
    private String imagen_direccion;
    private boolean imagen_principal;
    private boolean imagen_activa;

    public ImagenProductoMD() {
    }

    public ImagenProductoMD(Long id_imagen_producto, ProductoMD producto, String imagen_direccion, boolean imagen_principal, boolean imagen_activa) {
        this.id_imagen_producto = id_imagen_producto;
        this.producto = producto;
        this.imagen_direccion = imagen_direccion;
        this.imagen_principal = imagen_principal;
        this.imagen_activa = imagen_activa;
    }

    public Long getId_imagen_producto() {
        return id_imagen_producto;
    }

    public void setId_imagen_producto(Long id_imagen_producto) {
        this.id_imagen_producto = id_imagen_producto;
    }

    public ProductoMD getProducto() {
        return producto;
    }

    public void setProducto(ProductoMD producto) {
        this.producto = producto;
    }

    public String getImagen_direccion() {
        return imagen_direccion;
    }

    public void setImagen_direccion(String imagen_direccion) {
        this.imagen_direccion = imagen_direccion;
    }

    public boolean isImagen_principal() {
        return imagen_principal;
    }

    public void setImagen_principal(boolean imagen_principal) {
        this.imagen_principal = imagen_principal;
    }

    public boolean isImagen_activa() {
        return imagen_activa;
    }

    public void setImagen_activa(boolean imagen_activa) {
        this.imagen_activa = imagen_activa;
    }
    
    
    
}


package farmasys.modelo.product;

public class InventarioMD {
    
    private Long id_inventario;
    private SucursalMD sucursal;
    private ProductoMD producto;
    private double producto_iva;
    private boolean inventario_activo;

    public InventarioMD() {
    }

    public InventarioMD(Long id_inventario, SucursalMD sucursal, ProductoMD producto, double producto_iva, boolean inventario_activo) {
        this.id_inventario = id_inventario;
        this.sucursal = sucursal;
        this.producto = producto;
        this.producto_iva = producto_iva;
        this.inventario_activo = inventario_activo;
    }

    public Long getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(Long id_inventario) {
        this.id_inventario = id_inventario;
    }

    public SucursalMD getSucursal() {
        return sucursal;
    }

    public void setSucursal(SucursalMD sucursal) {
        this.sucursal = sucursal;
    }

    public ProductoMD getProducto() {
        return producto;
    }

    public void setProducto(ProductoMD producto) {
        this.producto = producto;
    }

    public double getProducto_iva() {
        return producto_iva;
    }

    public void setProducto_iva(double producto_iva) {
        this.producto_iva = producto_iva;
    }

    public boolean isInventario_activo() {
        return inventario_activo;
    }

    public void setInventario_activo(boolean inventario_activo) {
        this.inventario_activo = inventario_activo;
    }
    
    
    
}

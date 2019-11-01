
package farmasys.modelo.product;

public class StockUnidadesMD {
    
    private Long id_stock_unidades;
    private InventarioStockMD inventario_stock;
    private int cantidad_unidades;
    private boolean stock_unidades_activo;

    public StockUnidadesMD() {
    }

    public StockUnidadesMD(Long id_stock_unidades, InventarioStockMD inventario_stock, int cantidad_unidades, boolean stock_unidades_activo) {
        this.id_stock_unidades = id_stock_unidades;
        this.inventario_stock = inventario_stock;
        this.cantidad_unidades = cantidad_unidades;
        this.stock_unidades_activo = stock_unidades_activo;
    }

    public Long getId_stock_unidades() {
        return id_stock_unidades;
    }

    public void setId_stock_unidades(Long id_stock_unidades) {
        this.id_stock_unidades = id_stock_unidades;
    }

    public InventarioStockMD getInventario_stock() {
        return inventario_stock;
    }

    public void setInventario_stock(InventarioStockMD inventario_stock) {
        this.inventario_stock = inventario_stock;
    }

    public int getCantidad_unidades() {
        return cantidad_unidades;
    }

    public void setCantidad_unidades(int cantidad_unidades) {
        this.cantidad_unidades = cantidad_unidades;
    }

    public boolean isStock_unidades_activo() {
        return stock_unidades_activo;
    }

    public void setStock_unidades_activo(boolean stock_unidades_activo) {
        this.stock_unidades_activo = stock_unidades_activo;
    }
    
    
    
}

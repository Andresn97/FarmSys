
package farmasys.modelo.product;

import java.util.Date;

public class InventarioStockMD {
    
    private Long id_inventario_stock;
    private InventarioMD inventario;
    private int cantidad_stock;
    private Date stock_fecha_ingreso;
    private Date stock_fecha_caducidad;
    private double stock_costo_producto;
    private double stock_total_costo;
    private boolean stock_activo;

    public InventarioStockMD() {
    }

    public InventarioStockMD(Long id_inventario_stock, InventarioMD inventario, int cantidad_stock, Date stock_fecha_ingreso, Date stock_fecha_caducidad, double stock_costo_producto, double stock_total_costo, boolean stock_activo) {
        this.id_inventario_stock = id_inventario_stock;
        this.inventario = inventario;
        this.cantidad_stock = cantidad_stock;
        this.stock_fecha_ingreso = stock_fecha_ingreso;
        this.stock_fecha_caducidad = stock_fecha_caducidad;
        this.stock_costo_producto = stock_costo_producto;
        this.stock_total_costo = stock_total_costo;
        this.stock_activo = stock_activo;
    }

    public Long getId_inventario_stock() {
        return id_inventario_stock;
    }

    public void setId_inventario_stock(Long id_inventario_stock) {
        this.id_inventario_stock = id_inventario_stock;
    }

    public InventarioMD getInventario() {
        return inventario;
    }

    public void setInventario(InventarioMD inventario) {
        this.inventario = inventario;
    }

    public int getCantidad_stock() {
        return cantidad_stock;
    }

    public void setCantidad_stock(int cantidad_stock) {
        this.cantidad_stock = cantidad_stock;
    }

    public Date getStock_fecha_ingreso() {
        return stock_fecha_ingreso;
    }

    public void setStock_fecha_ingreso(Date stock_fecha_ingreso) {
        this.stock_fecha_ingreso = stock_fecha_ingreso;
    }

    public Date getStock_fecha_caducidad() {
        return stock_fecha_caducidad;
    }

    public void setStock_fecha_caducidad(Date stock_fecha_caducidad) {
        this.stock_fecha_caducidad = stock_fecha_caducidad;
    }

    public double getStock_costo_producto() {
        return stock_costo_producto;
    }

    public void setStock_costo_producto(double stock_costo_producto) {
        this.stock_costo_producto = stock_costo_producto;
    }

    public double getStock_total_costo() {
        return stock_total_costo;
    }

    public void setStock_total_costo(double stock_total_costo) {
        this.stock_total_costo = stock_total_costo;
    }

    public boolean isStock_activo() {
        return stock_activo;
    }

    public void setStock_activo(boolean stock_activo) {
        this.stock_activo = stock_activo;
    }
    
    
    
}

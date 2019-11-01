
package farmasys.modelo.person;

import java.util.Date;

public class ProductoRecomendadoMD {
    
    private Long id_producto_recomendado;
    //Llave foránea
    private FarmaceuticoMD farmaceutico;
    private String nombre_producto;
    private String descripcion_producto;
    private Date recomendado_fecha_ingreso;
    private boolean producto_recomendado_activo;

    public ProductoRecomendadoMD() {
    }

    public ProductoRecomendadoMD(Long id_producto_recomendado, FarmaceuticoMD farmaceutico, String nombre_producto, String descripcion_producto, Date recomendado_fecha_ingreso, boolean producto_recomendado_activo) {
        this.id_producto_recomendado = id_producto_recomendado;
        this.farmaceutico = farmaceutico;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.recomendado_fecha_ingreso = recomendado_fecha_ingreso;
        this.producto_recomendado_activo = producto_recomendado_activo;
    }

    public Long getId_producto_recomendado() {
        return id_producto_recomendado;
    }

    public void setId_producto_recomendado(Long id_producto_recomendado) {
        this.id_producto_recomendado = id_producto_recomendado;
    }

    public FarmaceuticoMD getFarmaceutico() {
        return farmaceutico;
    }

    public void setFarmaceutico(FarmaceuticoMD farmaceutico) {
        this.farmaceutico = farmaceutico;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public Date getRecomendado_fecha_ingreso() {
        return recomendado_fecha_ingreso;
    }

    public void setRecomendado_fecha_ingreso(Date recomendado_fecha_ingreso) {
        this.recomendado_fecha_ingreso = recomendado_fecha_ingreso;
    }

    public boolean isProducto_recomendado_activo() {
        return producto_recomendado_activo;
    }

    public void setProducto_recomendado_activo(boolean producto_recomendado_activo) {
        this.producto_recomendado_activo = producto_recomendado_activo;
    }
    
    
    
}

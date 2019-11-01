
package farmasys.modelo.product;

public class ProductoMD {
    
    private Long id_producto;
    private MarcaMD marca;
    private String producto_nombre;
    private int producto_codigo_barras;
    private double producto_precio;
    private double producto_precio_individual;
    private String producto_descripcion;
    private int producto_num_unidades;
    private int cantidad_minima;
    private int cantidad_maxima;
    private int producto_calificacion;
    private boolean producto_tiene_iva;
    private boolean producto_activo;

    public ProductoMD() {
    }

    public ProductoMD(Long id_producto, MarcaMD marca, String producto_nombre, int producto_codigo_barras, double producto_precio, double producto_precio_individual, String producto_descripcion, int producto_num_unidades, int cantidad_minima, int cantidad_maxima, int producto_calificacion, boolean producto_tiene_iva, boolean producto_activo) {
        this.id_producto = id_producto;
        this.marca = marca;
        this.producto_nombre = producto_nombre;
        this.producto_codigo_barras = producto_codigo_barras;
        this.producto_precio = producto_precio;
        this.producto_precio_individual = producto_precio_individual;
        this.producto_descripcion = producto_descripcion;
        this.producto_num_unidades = producto_num_unidades;
        this.cantidad_minima = cantidad_minima;
        this.cantidad_maxima = cantidad_maxima;
        this.producto_calificacion = producto_calificacion;
        this.producto_tiene_iva = producto_tiene_iva;
        this.producto_activo = producto_activo;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public MarcaMD getMarca() {
        return marca;
    }

    public void setMarca(MarcaMD marca) {
        this.marca = marca;
    }

    public String getProducto_nombre() {
        return producto_nombre;
    }

    public void setProducto_nombre(String producto_nombre) {
        this.producto_nombre = producto_nombre;
    }

    public int getProducto_codigo_barras() {
        return producto_codigo_barras;
    }

    public void setProducto_codigo_barras(int producto_codigo_barras) {
        this.producto_codigo_barras = producto_codigo_barras;
    }

    public double getProducto_precio() {
        return producto_precio;
    }

    public void setProducto_precio(double producto_precio) {
        this.producto_precio = producto_precio;
    }

    public double getProducto_precio_individual() {
        return producto_precio_individual;
    }

    public void setProducto_precio_individual(double producto_precio_individual) {
        this.producto_precio_individual = producto_precio_individual;
    }

    public String getProducto_descripcion() {
        return producto_descripcion;
    }

    public void setProducto_descripcion(String producto_descripcion) {
        this.producto_descripcion = producto_descripcion;
    }

    public int getProducto_num_unidades() {
        return producto_num_unidades;
    }

    public void setProducto_num_unidades(int producto_num_unidades) {
        this.producto_num_unidades = producto_num_unidades;
    }

    public int getCantidad_minima() {
        return cantidad_minima;
    }

    public void setCantidad_minima(int cantidad_minima) {
        this.cantidad_minima = cantidad_minima;
    }

    public int getCantidad_maxima() {
        return cantidad_maxima;
    }

    public void setCantidad_maxima(int cantidad_maxima) {
        this.cantidad_maxima = cantidad_maxima;
    }

    public int getProducto_calificacion() {
        return producto_calificacion;
    }

    public void setProducto_calificacion(int producto_calificacion) {
        this.producto_calificacion = producto_calificacion;
    }

    public boolean isProducto_tiene_iva() {
        return producto_tiene_iva;
    }

    public void setProducto_tiene_iva(boolean producto_tiene_iva) {
        this.producto_tiene_iva = producto_tiene_iva;
    }

    public boolean isProducto_activo() {
        return producto_activo;
    }

    public void setProducto_activo(boolean producto_activo) {
        this.producto_activo = producto_activo;
    }
    
    
    
}

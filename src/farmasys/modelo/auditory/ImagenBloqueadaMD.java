
package farmasys.modelo.auditory;

import farmasys.modelo.product.ImagenProductoMD;
import java.util.Date;

public class ImagenBloqueadaMD {
    
    private Long id_imagen_bloqueada;
    //Llave foránea
    private ImagenProductoMD imagen_producto;
    private String imagen_bloqueada_motivo;
    private Date imagen_fecha_bloqueo;
    private boolean imagen_bloqueada_activa;

    public ImagenBloqueadaMD() {
    }

    public ImagenBloqueadaMD(Long id_imagen_bloqueada, ImagenProductoMD imagen_producto, String imagen_bloqueada_motivo, Date imagen_fecha_bloqueo, boolean imagen_bloqueada_activa) {
        this.id_imagen_bloqueada = id_imagen_bloqueada;
        this.imagen_producto = imagen_producto;
        this.imagen_bloqueada_motivo = imagen_bloqueada_motivo;
        this.imagen_fecha_bloqueo = imagen_fecha_bloqueo;
        this.imagen_bloqueada_activa = imagen_bloqueada_activa;
    }

    public Long getId_imagen_bloqueada() {
        return id_imagen_bloqueada;
    }

    public void setId_imagen_bloqueada(Long id_imagen_bloqueada) {
        this.id_imagen_bloqueada = id_imagen_bloqueada;
    }

    public ImagenProductoMD getImagen_producto() {
        return imagen_producto;
    }

    public void setImagen_producto(ImagenProductoMD imagen_producto) {
        this.imagen_producto = imagen_producto;
    }

    public String getImagen_bloqueada_motivo() {
        return imagen_bloqueada_motivo;
    }

    public void setImagen_bloqueada_motivo(String imagen_bloqueada_motivo) {
        this.imagen_bloqueada_motivo = imagen_bloqueada_motivo;
    }

    public Date getImagen_fecha_bloqueo() {
        return imagen_fecha_bloqueo;
    }

    public void setImagen_fecha_bloqueo(Date imagen_fecha_bloqueo) {
        this.imagen_fecha_bloqueo = imagen_fecha_bloqueo;
    }

    public boolean isImagen_bloqueada_activa() {
        return imagen_bloqueada_activa;
    }

    public void setImagen_bloqueada_activa(boolean imagen_bloqueada_activa) {
        this.imagen_bloqueada_activa = imagen_bloqueada_activa;
    }
    
    
    
}

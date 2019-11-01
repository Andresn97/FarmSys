
package farmasys.modelo.auditory;

import java.util.Date;

public class FarmaceuticoBloqueadoMD {
    
    private Long id_farmac_bloqueado;
    //Llave foránea
    private FarmaceuticoBloqueadoMD farmaceutico;
    private String farmac_motivo_bloqueo;
    private Date farmac_fecha_bloqueo;
    private boolean farmac_bloqueo_activo;

    public FarmaceuticoBloqueadoMD() {
    }

    public FarmaceuticoBloqueadoMD(Long id_farmac_bloqueado, FarmaceuticoBloqueadoMD farmaceutico, String farmac_motivo_bloqueo, Date farmac_fecha_bloqueo, boolean farmac_bloqueo_activo) {
        this.id_farmac_bloqueado = id_farmac_bloqueado;
        this.farmaceutico = farmaceutico;
        this.farmac_motivo_bloqueo = farmac_motivo_bloqueo;
        this.farmac_fecha_bloqueo = farmac_fecha_bloqueo;
        this.farmac_bloqueo_activo = farmac_bloqueo_activo;
    }

    public Long getId_farmac_bloqueado() {
        return id_farmac_bloqueado;
    }

    public void setId_farmac_bloqueado(Long id_farmac_bloqueado) {
        this.id_farmac_bloqueado = id_farmac_bloqueado;
    }

    public FarmaceuticoBloqueadoMD getFarmaceutico() {
        return farmaceutico;
    }

    public void setFarmaceutico(FarmaceuticoBloqueadoMD farmaceutico) {
        this.farmaceutico = farmaceutico;
    }

    public String getFarmac_motivo_bloqueo() {
        return farmac_motivo_bloqueo;
    }

    public void setFarmac_motivo_bloqueo(String farmac_motivo_bloqueo) {
        this.farmac_motivo_bloqueo = farmac_motivo_bloqueo;
    }

    public Date getFarmac_fecha_bloqueo() {
        return farmac_fecha_bloqueo;
    }

    public void setFarmac_fecha_bloqueo(Date farmac_fecha_bloqueo) {
        this.farmac_fecha_bloqueo = farmac_fecha_bloqueo;
    }

    public boolean isFarmac_bloqueo_activo() {
        return farmac_bloqueo_activo;
    }

    public void setFarmac_bloqueo_activo(boolean farmac_bloqueo_activo) {
        this.farmac_bloqueo_activo = farmac_bloqueo_activo;
    }
    
    
    
}


package farmasys.modelo.product;

public class MarcaMD {
    
    private Long id_marca;
    private String marca_nombre;
    private String marca_pais_origen;
    private String marca_sitio_web;
    private boolean marca_activa;

    public MarcaMD() {
    }

    public MarcaMD(Long id_marca, String marca_nombre, String marca_pais_origen, String marca_sitio_web, boolean marca_activa) {
        this.id_marca = id_marca;
        this.marca_nombre = marca_nombre;
        this.marca_pais_origen = marca_pais_origen;
        this.marca_sitio_web = marca_sitio_web;
        this.marca_activa = marca_activa;
    }

    public Long getId_marca() {
        return id_marca;
    }

    public void setId_marca(Long id_marca) {
        this.id_marca = id_marca;
    }

    public String getMarca_nombre() {
        return marca_nombre;
    }

    public void setMarca_nombre(String marca_nombre) {
        this.marca_nombre = marca_nombre;
    }

    public String getMarca_pais_origen() {
        return marca_pais_origen;
    }

    public void setMarca_pais_origen(String marca_pais_origen) {
        this.marca_pais_origen = marca_pais_origen;
    }

    public String getMarca_sitio_web() {
        return marca_sitio_web;
    }

    public void setMarca_sitio_web(String marca_sitio_web) {
        this.marca_sitio_web = marca_sitio_web;
    }

    public boolean isMarca_activa() {
        return marca_activa;
    }

    public void setMarca_activa(boolean marca_activa) {
        this.marca_activa = marca_activa;
    }
    
    
    
}

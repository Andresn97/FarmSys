
package farmasys.modelo.product;

public class CategoriaMD {
    
    private Long id_categoria;
    private String categoria_nombre;
    private boolean categoria_activa;

    public CategoriaMD() {
    }

    public CategoriaMD(Long id_categoria, String categoria_nombre, boolean categoria_activa) {
        this.id_categoria = id_categoria;
        this.categoria_nombre = categoria_nombre;
        this.categoria_activa = categoria_activa;
    }

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getCategoria_nombre() {
        return categoria_nombre;
    }

    public void setCategoria_nombre(String categoria_nombre) {
        this.categoria_nombre = categoria_nombre;
    }

    public boolean isCategoria_activa() {
        return categoria_activa;
    }

    public void setCategoria_activa(boolean categoria_activa) {
        this.categoria_activa = categoria_activa;
    }
    
    
    
}

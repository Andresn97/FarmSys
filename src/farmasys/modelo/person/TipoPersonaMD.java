
package farmasys.modelo.person;

public class TipoPersonaMD {
    
    private Long id_tipo_persona;
    private String tipo_nombre;
    private boolean tipo_persona_activo;

    public TipoPersonaMD() {
    }

    public TipoPersonaMD(Long id_tipo_persona, String tipo_nombre, boolean tipo_persona_activo) {
        this.id_tipo_persona = id_tipo_persona;
        this.tipo_nombre = tipo_nombre;
        this.tipo_persona_activo = tipo_persona_activo;
    }

    public Long getId_tipo_persona() {
        return id_tipo_persona;
    }

    public void setId_tipo_persona(Long id_tipo_persona) {
        this.id_tipo_persona = id_tipo_persona;
    }

    public String getTipo_nombre() {
        return tipo_nombre;
    }

    public void setTipo_nombre(String tipo_nombre) {
        this.tipo_nombre = tipo_nombre;
    }

    public boolean isTipo_persona_activo() {
        return tipo_persona_activo;
    }

    public void setTipo_persona_activo(boolean tipo_persona_activo) {
        this.tipo_persona_activo = tipo_persona_activo;
    }
    
    
    
}

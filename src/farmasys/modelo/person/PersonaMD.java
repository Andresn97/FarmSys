
package farmasys.modelo.person;

import java.util.Date;

public class PersonaMD {
    
    private Long id_persona;
    //Objeto Tipo_Persona - Para clave foránea
    private TipoPersonaMD tipo_persona;
    private String persona_identificacion;
    private String persona_primer_nombre;
    private String persona_segundo_nombre;
    private String persona_primer_apellido;
    private String persona_segundo_apellido;
    private int persona_edad;
    private String persona_celular;
    private String persona_telefono;
    private String persona_sexo;
    private String persona_direccion;
    private String persona_correo;
    private Date persona_fecha_registro;
    private boolean persona_activa;

    public PersonaMD() {
    }

    public PersonaMD(Long id_persona, TipoPersonaMD tipo_persona, String persona_identificacion, String persona_primer_nombre, String persona_segundo_nombre, String persona_primer_apellido, String persona_segundo_apellido, int persona_edad, String persona_celular, String persona_telefono, String persona_sexo, String persona_direccion, String persona_correo, Date persona_fecha_registro, boolean persona_activa) {
        this.id_persona = id_persona;
        this.tipo_persona = tipo_persona;
        this.persona_identificacion = persona_identificacion;
        this.persona_primer_nombre = persona_primer_nombre;
        this.persona_segundo_nombre = persona_segundo_nombre;
        this.persona_primer_apellido = persona_primer_apellido;
        this.persona_segundo_apellido = persona_segundo_apellido;
        this.persona_edad = persona_edad;
        this.persona_celular = persona_celular;
        this.persona_telefono = persona_telefono;
        this.persona_sexo = persona_sexo;
        this.persona_direccion = persona_direccion;
        this.persona_correo = persona_correo;
        this.persona_fecha_registro = persona_fecha_registro;
        this.persona_activa = persona_activa;
    }

    public Long getId_persona() {
        return id_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public TipoPersonaMD getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(TipoPersonaMD tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public String getPersona_identificacion() {
        return persona_identificacion;
    }

    public void setPersona_identificacion(String persona_identificacion) {
        this.persona_identificacion = persona_identificacion;
    }

    public String getPersona_primer_nombre() {
        return persona_primer_nombre;
    }

    public void setPersona_primer_nombre(String persona_primer_nombre) {
        this.persona_primer_nombre = persona_primer_nombre;
    }

    public String getPersona_segundo_nombre() {
        return persona_segundo_nombre;
    }

    public void setPersona_segundo_nombre(String persona_segundo_nombre) {
        this.persona_segundo_nombre = persona_segundo_nombre;
    }

    public String getPersona_primer_apellido() {
        return persona_primer_apellido;
    }

    public void setPersona_primer_apellido(String persona_primer_apellido) {
        this.persona_primer_apellido = persona_primer_apellido;
    }

    public String getPersona_segundo_apellido() {
        return persona_segundo_apellido;
    }

    public void setPersona_segundo_apellido(String persona_segundo_apellido) {
        this.persona_segundo_apellido = persona_segundo_apellido;
    }

    public int getPersona_edad() {
        return persona_edad;
    }

    public void setPersona_edad(int persona_edad) {
        this.persona_edad = persona_edad;
    }

    public String getPersona_celular() {
        return persona_celular;
    }

    public void setPersona_celular(String persona_celular) {
        this.persona_celular = persona_celular;
    }

    public String getPersona_telefono() {
        return persona_telefono;
    }

    public void setPersona_telefono(String persona_telefono) {
        this.persona_telefono = persona_telefono;
    }

    public String getPersona_sexo() {
        return persona_sexo;
    }

    public void setPersona_sexo(String persona_sexo) {
        this.persona_sexo = persona_sexo;
    }

    public String getPersona_direccion() {
        return persona_direccion;
    }

    public void setPersona_direccion(String persona_direccion) {
        this.persona_direccion = persona_direccion;
    }

    public String getPersona_correo() {
        return persona_correo;
    }

    public void setPersona_correo(String persona_correo) {
        this.persona_correo = persona_correo;
    }

    public Date getPersona_fecha_registro() {
        return persona_fecha_registro;
    }

    public void setPersona_fecha_registro(Date persona_fecha_registro) {
        this.persona_fecha_registro = persona_fecha_registro;
    }

    public boolean isPersona_activa() {
        return persona_activa;
    }

    public void setPersona_activa(boolean persona_activa) {
        this.persona_activa = persona_activa;
    }
    
    
    
}

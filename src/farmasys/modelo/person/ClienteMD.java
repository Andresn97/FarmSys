
package farmasys.modelo.person;

import java.util.Date;

public class ClienteMD {
    
    private Long id_cliente;
    //Llave Foránea
    private PersonaMD persona_cli;
    private Date cliente_fecha_registro;
    private boolean cliente_activo;

    public ClienteMD() {
    }

    public ClienteMD(Long id_cliente, PersonaMD persona_cli, Date cliente_fecha_registro, boolean cliente_activo) {
        this.id_cliente = id_cliente;
        this.persona_cli = persona_cli;
        this.cliente_fecha_registro = cliente_fecha_registro;
        this.cliente_activo = cliente_activo;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public PersonaMD getPersona() {
        return persona_cli;
    }

    public void setPersona(PersonaMD persona_cli) {
        this.persona_cli = persona_cli;
    }

    public Date getCliente_fecha_registro() {
        return cliente_fecha_registro;
    }

    public void setCliente_fecha_registro(Date cliente_fecha_registro) {
        this.cliente_fecha_registro = cliente_fecha_registro;
    }

    public boolean isCliente_activo() {
        return cliente_activo;
    }

    public void setCliente_activo(boolean cliente_activo) {
        this.cliente_activo = cliente_activo;
    }
    
    
    
}

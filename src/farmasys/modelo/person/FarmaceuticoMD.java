
package farmasys.modelo.person;

import java.util.Date;

public class FarmaceuticoMD {
    
    private Long id_farmaceutico;
    private PersonaMD persona_far;
    private int num_dias_laborales;
    private String horario_entrada;
    private String horario_salida;
    private double farmaceutico_sueldo;
    private Date farmaceutico_fecha_registro;
    private boolean farmaceutico_activo;

    public FarmaceuticoMD() {
    }

    public FarmaceuticoMD(Long id_farmaceutico, PersonaMD persona_far, int num_dias_laborales, String horario_entrada, String horario_salida, double farmaceutico_sueldo, Date farmaceutico_fecha_registro, boolean farmaceutico_activo) {
        this.id_farmaceutico = id_farmaceutico;
        this.persona_far = persona_far;
        this.num_dias_laborales = num_dias_laborales;
        this.horario_entrada = horario_entrada;
        this.horario_salida = horario_salida;
        this.farmaceutico_sueldo = farmaceutico_sueldo;
        this.farmaceutico_fecha_registro = farmaceutico_fecha_registro;
        this.farmaceutico_activo = farmaceutico_activo;
    }

    public Long getId_farmaceutico() {
        return id_farmaceutico;
    }

    public void setId_farmaceutico(Long id_farmaceutico) {
        this.id_farmaceutico = id_farmaceutico;
    }

    public PersonaMD getPersona_far() {
        return persona_far;
    }

    public void setPersona_far(PersonaMD persona_far) {
        this.persona_far = persona_far;
    }

    public int getNum_dias_laborales() {
        return num_dias_laborales;
    }

    public void setNum_dias_laborales(int num_dias_laborales) {
        this.num_dias_laborales = num_dias_laborales;
    }

    public String getHorario_entrada() {
        return horario_entrada;
    }

    public void setHorario_entrada(String horario_entrada) {
        this.horario_entrada = horario_entrada;
    }

    public String getHorario_salida() {
        return horario_salida;
    }

    public void setHorario_salida(String horario_salida) {
        this.horario_salida = horario_salida;
    }

    public double getFarmaceutico_sueldo() {
        return farmaceutico_sueldo;
    }

    public void setFarmaceutico_sueldo(double farmaceutico_sueldo) {
        this.farmaceutico_sueldo = farmaceutico_sueldo;
    }

    public Date getFarmaceutico_fecha_registro() {
        return farmaceutico_fecha_registro;
    }

    public void setFarmaceutico_fecha_registro(Date farmaceutico_fecha_registro) {
        this.farmaceutico_fecha_registro = farmaceutico_fecha_registro;
    }

    public boolean isFarmaceutico_activo() {
        return farmaceutico_activo;
    }

    public void setFarmaceutico_activo(boolean farmaceutico_activo) {
        this.farmaceutico_activo = farmaceutico_activo;
    }
    
    
}

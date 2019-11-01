
package farmasys.modelo.product;

public class SucursalMD {
    
    private Long id_sucursal;
    private String nombre_sucursal;
    private String direccion_sucursal;
    private String telefono_sucursal;
    private String celular_sucursal;
    private String email_sucursal;
    private boolean sucursal_activa;

    public SucursalMD() {
    }

    public SucursalMD(Long id_sucursal, String nombre_sucursal, String direccion_sucursal, String telefono_sucursal, String celular_sucursal, String email_sucursal, boolean sucursal_activa) {
        this.id_sucursal = id_sucursal;
        this.nombre_sucursal = nombre_sucursal;
        this.direccion_sucursal = direccion_sucursal;
        this.telefono_sucursal = telefono_sucursal;
        this.celular_sucursal = celular_sucursal;
        this.email_sucursal = email_sucursal;
        this.sucursal_activa = sucursal_activa;
    }

    public Long getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(Long id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public String getNombre_sucursal() {
        return nombre_sucursal;
    }

    public void setNombre_sucursal(String nombre_sucursal) {
        this.nombre_sucursal = nombre_sucursal;
    }

    public String getDireccion_sucursal() {
        return direccion_sucursal;
    }

    public void setDireccion_sucursal(String direccion_sucursal) {
        this.direccion_sucursal = direccion_sucursal;
    }

    public String getTelefono_sucursal() {
        return telefono_sucursal;
    }

    public void setTelefono_sucursal(String telefono_sucursal) {
        this.telefono_sucursal = telefono_sucursal;
    }

    public String getCelular_sucursal() {
        return celular_sucursal;
    }

    public void setCelular_sucursal(String celular_sucursal) {
        this.celular_sucursal = celular_sucursal;
    }

    public String getEmail_sucursal() {
        return email_sucursal;
    }

    public void setEmail_sucursal(String email_sucursal) {
        this.email_sucursal = email_sucursal;
    }

    public boolean isSucursal_activa() {
        return sucursal_activa;
    }

    public void setSucursal_activa(boolean sucursal_activa) {
        this.sucursal_activa = sucursal_activa;
    }
    
    
    
}

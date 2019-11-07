
package farmasys.controlador;

import farmasys.controlador.efectos.EfectPrincipal;
import farmasys.modelo.ConexDBHikari;
import farmasys.modelo.Config;
import farmasys.modelo.person.usuario.UsuarioBD;
import farmasys.vista.VtnSesion;

public class SesionCTR {
    
    private final VtnSesion vista;
    private UsuarioBD user;

    public SesionCTR() {
        
        this.vista = new VtnSesion();
        //Falta imagen de ícono
        
    }
    
    //Inicio
    public void inicio(){
    
        iniciarEventos();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
    }
    
    //Inicio de Eventos
    private void iniciarEventos(){
    
        vista.getBtn_Iniciar().addActionListener( e -> logeo() );
        
    
    }
    
    private void logeo(){
    
        if( !vista.getTxt_Nmb_User().getText().isEmpty() && !vista.getTxt_Pass().getText().isEmpty() ){
           
            new Thread(() -> {
                
                    ConexDBHikari conex = null;
                    try {

                        EfectPrincipal.asignarLoadCursor(vista);
                        String usuario = vista.getTxt_Nmb_User().getText().trim();
                        String pass = vista.getTxt_Pass().getText().trim();

                       // activarForm(false); método de ayuda (opcional)
                        conex = new ConexDBHikari(null);
                        user = new UsuarioBD();
                        user.setUsuario_nombre(usuario);
                        user.setUsuario_contrasena(pass);
                        user = user.seleccionarUserYCon();

                        if (user != null) {

                            vista.dispose();
                            Config.setUser(user);
//                            VtnSelectRolCTR vtn = new VtnSelectRolCTR(new ConectarDB("Login", conex));
//                            vtn.Init();

                        } else {
                            EfectPrincipal.asignarTextoEnLabel(vista.getLbl_Error_Sesion(), "Revise la Informacion Ingresada", Config.ERROR_COLOR, 2);
                            EfectPrincipal.asignarCursoPredefinido(vista);
                            conex.closeHikari();
                        }

                    } catch (NullPointerException e) {
                        EfectPrincipal.asignarCursoPredefinido(vista);
                        EfectPrincipal.asignarTextoEnLabel(vista.getLbl_Error_Sesion(), "Revise la Informacion Ingresada", Config.ERROR_COLOR, 2);

                        if (conex != null) {
                            conex.closeHikari();
                        }
                    } finally {

                        EfectPrincipal.asignarCursoPredefinido(vista);
//                        activarForm(true);
                    }

                }).start();
            } else {
                EfectPrincipal.asignarTextoEnLabel(vista.getLbl_Error_Sesion(), "INGRESE TODA LA INFORMACIÓN PARA CONTINUAR", Config.ERROR_COLOR, 2);
            }

            
        }
        
    }
    
    


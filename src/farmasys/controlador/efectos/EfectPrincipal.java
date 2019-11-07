
package farmasys.controlador.efectos;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class EfectPrincipal {
    
    private static final Cursor CARGAR_CURSOR;
    private static final Cursor PREDEFINIDO_CURSOR;
    
    static{
    
        CARGAR_CURSOR = new Cursor( Cursor.WAIT_CURSOR );
        PREDEFINIDO_CURSOR = new Cursor( Cursor.DEFAULT_CURSOR );
    
    }
    
    public static void añadirAPrincipal(JInternalFrame component, JDesktopPane desktop) {
        try {
            centrarVentana(component, desktop);
            desktop.add(component);
            component.setSelected(true);
            component.setVisible(true);
        } catch (PropertyVetoException ex) {
            //Logger.getLogger(Middlewares.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("-------THREADS-------->" + Thread.activeCount());
    }
    
    public static void centrarVentana(JInternalFrame view, JDesktopPane desktop) {

        int deskWidth = (desktop.getWidth() / 2) - (view.getWidth() / 2);
        int deskHeight = (desktop.getHeight() / 2) - (view.getHeight() / 2);

        if (desktop.getHeight() < 500) {
            deskHeight = 0;
        }
        view.setLocation(deskWidth, deskHeight);
    }
    
    public static void asignarLoadCursor(Container view) {
        view.setCursor(CARGAR_CURSOR);

    }

    public static void asignarCursoPredefinido(Container view) {
        view.setCursor(PREDEFINIDO_CURSOR);
    }
    
    public static void asignarTextoEnLabel(JLabel component, String message, Color color, int time) {
        if (color != null) {
            component.setForeground(color);
        }
        asignarTexto(component, message, time);
    }

    public static void asignarTexto(JLabel component, String text, int time) {
        component.setText(text);
        Timer task = new Timer(time * 1000, e -> {
            component.setText("");
        });
        task.setRepeats(false);
        task.start();
    }
    
}

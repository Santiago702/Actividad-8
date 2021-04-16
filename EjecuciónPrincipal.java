
package ejecuciónprincipal;
import MVC.Controlador;
import MVC.Modelo;
import MVC.Vista;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author SANTIAGO CUERVO
 */
public class EjecuciónPrincipal {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (UnsupportedLookAndFeelException e) {
        }
        catch (ClassNotFoundException e) {
        }
        catch (InstantiationException e) {
        }
        catch (IllegalAccessException e) {
        }
        Modelo modelo = new Modelo();
        Vista vistaChikita = new Vista();
        Controlador controladorsito = new Controlador(modelo, vistaChikita);
        
        controladorsito.comenzarVista();
    }
    
}

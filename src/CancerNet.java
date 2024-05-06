import Ventanas.Otros.Interfaces_instancias;

/**
 *
 * @author Cristopher. Baca
 */


public class CancerNet {

    public static void main(String[] args) {        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Interfaces_instancias.MENU.setVisible(true);
            }
        });
    }
}
    
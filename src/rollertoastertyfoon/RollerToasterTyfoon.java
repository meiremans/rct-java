/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rollertoastertyfoon;

/**
 *
 * @author root
 */
public class RollerToasterTyfoon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
        Gui gui = new Gui();

        Thread thread = new Thread(gui);
        gui.setVisible(true);

        thread.start();
    }
    }
}

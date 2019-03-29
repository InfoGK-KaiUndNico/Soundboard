/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundboard;

import soundboard.*;


/**
 *
 * @author nicolas.masello
 */
public class Soundboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserInterface frame = new UserInterface();
                frame.addKeyListener(new Keyhandler());
                frame.setVisible(true);
            }
        });
    }
    
}

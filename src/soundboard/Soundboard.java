package soundboard;

import soundboard.*;

public class Soundboard {

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

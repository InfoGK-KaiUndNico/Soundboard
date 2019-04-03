package soundboard;

import java.awt.event.*;

public class Keyhandler implements KeyListener {

    private void playkeyQ() {
        // Verbindung zum SQL
        System.out.println("Hallo Welt!");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
        case KeyEvent.VK_Q:
            playkeyQ();
            break;
        default:
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
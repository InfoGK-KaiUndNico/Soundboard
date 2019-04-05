package soundboard;

import java.awt.event.*;

public class Keyhandler implements KeyListener{
    public String PressedKey = "none";
    Song sound = new Song();

    private void playkeyQ() {                        //Eigentlicher Befehl, der den Sound mit dem Key verbindet und dann abspielt
        sound.Abspielen("lib/Epic-Sax.wav");
        PressedKey = "Q";
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    
    @Override
    public void keyPressed(KeyEvent e) { //Keypressed ist der Befehl die Taste zu drücken
        if (!PressedKey.equalsIgnoreCase("none")) {
            return;
        }

        switch(e.getKeyCode()) {
            case KeyEvent.VK_Q:
                playkeyQ();
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        PressedKey = "none";
        sound.Stop();
    }

}

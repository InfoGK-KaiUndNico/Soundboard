package soundboard;

import java.awt.event.*;
import soundboard.Song;

public class Keyhandler implements KeyListener{

    private void playkeyQ() {                        //Eigentlicher Befehl, der den Sound mit dem Key verbindet und dann abspielt
  Song soundQ = null;
        soundQ.Abspielen("soundboard/lib/Epic-Sax.wav");


    System.out.println("Hallo Welt!");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {         //Keypressed ist der Befehl die Taste zu drücken
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

    }

}

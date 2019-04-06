package soundboard;

import java.awt.event.*;

public class Keyhandler implements KeyListener {

    public String PressedKey = "none";
    Song sound = new Song();

    private void playkeyQ() {                        //Eigentlicher Befehl, der den Sound mit dem Key verbindet und dann abspielt
        sound.Abspielen("lib/Epic-Sax.wav");
        PressedKey = "Q";
    }

    private void playkeyT() {
        sound.Abspielen("lib/Tsunami.wav");
        PressedKey = "T";
    }

    private void playkeyA() {
        sound.Abspielen("lib/Hier_kommt_Alex.wav");
        PressedKey = "A";
    }

    private void playkeyB() {
        sound.Abspielen("lib/Boring.wav");
        PressedKey = "B";
    }

    private void playkeyL() {
        sound.Abspielen("lib/Langweilig.wav");
        PressedKey = "L";
    }

    private void playkeyH() {
        sound.Abspielen("lib/HAHA.wav");
        PressedKey = "H";
    }

    private void playkeyS() {
        sound.Abspielen("lib/Scream.wav");
        PressedKey = "S";
    }

    private void playkeyW() {
        sound.Abspielen("lib/Windows-Microsoft.wav");
        PressedKey = "W";
    }

    private void playkeyP() {
        sound.Abspielen("lib/SHALL_NOT_PASS.wav");
        PressedKey = "P";
    }

    private void playkeyI() {
        sound.Abspielen("lib/Illuminati_Confirmed.wav");
        PressedKey = "I";
    }

    private void playkeyR() {
        sound.Abspielen("lib/La-Le-Lu(Rammstein).wav");
        PressedKey = "R";
    }

    private void playkeyV() {
        sound.Abspielen("lib/Sad-Violin.wav");
        PressedKey = "V";
    }

    private void playkeyN() {
        sound.Abspielen("lib/Nein-Nein-Nein.wav");
        PressedKey = "N";
    }

    private void playkeyY() {
        sound.Abspielen("lib/YEET!.wav");
        PressedKey = "Y";
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) { //Keypressed ist der Befehl die Taste zu drücken
        if (!PressedKey.equalsIgnoreCase("none")) {
            return;
        }

        switch (e.getKeyCode()) {
            case KeyEvent.VK_Q:
                playkeyQ();
                break;
            case KeyEvent.VK_T:
                playkeyT();
                break;
            case KeyEvent.VK_A:
                playkeyA();
                break;
            case KeyEvent.VK_B:
                playkeyB();
                break;
            case KeyEvent.VK_L:
                playkeyL();
                break;
            case KeyEvent.VK_H:
                playkeyH();
                break;
            case KeyEvent.VK_S:
                playkeyS();
                break;
            case KeyEvent.VK_W:
                playkeyW();
                break;
            case KeyEvent.VK_P:
                playkeyP();
                break;
            case KeyEvent.VK_I:
                playkeyI();
                break;
            case KeyEvent.VK_R:
                playkeyR();
                break;
            case KeyEvent.VK_V:
                playkeyV();
                break;
            case KeyEvent.VK_N:
                playkeyN();
                break;
            case KeyEvent.VK_Y:
                playkeyY();
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

package soundboard;

import java.awt.event.*;

public class Keyhandler implements KeyListener {

    String PressedKey = "none";               // Neuer Song wird angelegt
    Song sound = new Song();
    UserInterface UI = new UserInterface();
    public String getSong(){
        return PressedKey;
    }
     @Override
    public void keyTyped(KeyEvent e) {
    }  
//Eigentlicher Befehl, der den Sound mit dem Key verbindet und dann abspielt
    @Override
    public void keyPressed(KeyEvent e) {            //Keypressed ist der Befehl die Taste zu drücken
        if (!PressedKey.equalsIgnoreCase("none")) {
            return;
        }

        switch (e.getKeyCode()) {
            case KeyEvent.VK_A:
                sound.Abspielen("lib/Hier_kommt_Alex.wav");
                PressedKey = "A";
                break;
            case KeyEvent.VK_B:
                sound.Abspielen("lib/Boring.wav");
                PressedKey = "B";
                break;
            case KeyEvent.VK_C:
                sound.Abspielen("lib/Curb-Your-Enthusiasm.wav");
                PressedKey = "C";
                break;
            case KeyEvent.VK_D:
                sound.Abspielen("lib/Deutschland(Rammstein).wav");
                PressedKey = "D";
                break;
            case KeyEvent.VK_E:
                sound.Abspielen("lib/OneEternityLater.wav");
                PressedKey = "E";
                break;
            case KeyEvent.VK_F:
                sound.Abspielen("lib/For-the-damaged-coda.wav");
                PressedKey = "F";
                break;
            case KeyEvent.VK_G:
                sound.Abspielen("lib/Get-Some-Help.wav");
                PressedKey = "G";
                break;
            case KeyEvent.VK_H:
                sound.Abspielen("lib/HAHA.wav");
                PressedKey = "H";
                break;
            case KeyEvent.VK_I:
                sound.Abspielen("lib/Illuminati_Confirmed.wav");
                PressedKey = "I";
                break;
            case KeyEvent.VK_J:
                sound.Abspielen("lib/Jeopardy.wav");
                PressedKey = "J";
                break;
            case KeyEvent.VK_L:
                sound.Abspielen("lib/Langweilig.wav");
                PressedKey = "L";
                break;
            case KeyEvent.VK_M:
                sound.Abspielen("lib/meme.wav");
                PressedKey = "M";
                break;
            case KeyEvent.VK_N:
                sound.Abspielen("lib/Nein-Nein-Nein.wav");
                PressedKey = "N";
                break;
            case KeyEvent.VK_O:
                sound.Abspielen("lib/No-God-please-no.wav");
                PressedKey = "O";
                break;
            case KeyEvent.VK_P:
                sound.Abspielen("lib/SHALL_NOT_PASS.wav");
                PressedKey = "P";
                break;
            case KeyEvent.VK_Q:
                sound.Abspielen("lib/Epic-Sax.wav");
                PressedKey = "Q";
                break;
            case KeyEvent.VK_R:
                sound.Abspielen("lib/La-Le-Lu(Rammstein).wav");
                PressedKey = "R";
                break;                
            case KeyEvent.VK_S:
                sound.Abspielen("lib/Scream.wav");
                PressedKey = "S";
                break;
            case KeyEvent.VK_T:
                sound.Abspielen("lib/Tsunami.wav");
                PressedKey = "T";
                break;
            case KeyEvent.VK_V:
                sound.Abspielen("lib/Sad-Violin.wav");
                PressedKey = "V";
                break;
            case KeyEvent. VK_W:
                sound.Abspielen("lib/We-need-to-build-a-wall.wav");
                PressedKey = "W";
                break;
            case KeyEvent.VK_Y:
                sound.Abspielen("lib/YEET!.wav");
                PressedKey = "Y";
                break;
            case KeyEvent.VK_X:
                sound.Abspielen("lib/Airhorn.wav");
                PressedKey = "X";
                break;
            case KeyEvent.VK_ESCAPE:
                sound.Abspielen("lib/Fuck-This-Shit.wav");
                PressedKey = "ESC";
                break;
            case KeyEvent.VK_WINDOWS:
                sound.Abspielen("lib/Windows-Microsoft.wav");
                PressedKey = "Windows";
                break;
            case KeyEvent.VK_F1:
                sound.Abspielen("lib/Help_Me.wav");
                PressedKey = "F1";
                break;
            case KeyEvent.VK_F2:
                sound.Abspielen("lib/bitconnect.wav");
                PressedKey = "F2";
                break;
            case KeyEvent.VK_F3:
                sound.Abspielen("lib/IchWillNichtDassLädt.wav");
                PressedKey = "F3";
                break;
            default:
                break;
        }
        UI.Highlight(PressedKey);
    }

    @Override
    public void keyReleased(KeyEvent e) {    /*keyReleased ist der Befehl die Taste loszulassen 
                                                und das damit gleichtzeitg der Sound aufhört zu spielen */
        PressedKey = "none";                              
        sound.Stop();
    }

}

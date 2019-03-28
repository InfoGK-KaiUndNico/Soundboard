import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Soundboard extends JFrame implements KeyListener {

    private static final long serialVersionUID = -4163916387536937634L;
    JFrame UI = new JFrame(
            "Soundboard");UI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);UI.addKeyListener(this);UI.pack();UI.setVisible(true);

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            })    
            while(true){
                identifyKey();
            }
        }
    }

    private void identifyKey() {
        String key =

    keyPressed(KeyEvent e);switch(key.getKeyCode())

    {
            case KeyEvent.VK_Q:
                playkeyQ();
                break;
        
            default:
                break;
        }
    }

    private void playkeyQ() {
        //Verbindung zum SQL
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
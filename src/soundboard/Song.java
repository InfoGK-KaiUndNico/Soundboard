package soundboard;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Song {
    private Clip clip = null;  //Anlegen eines Clips
    
    public Song() {   //Konstruktor
    
    }

    public void Stop() { //Methode, die die das Abspielen stoppt
        if (clip == null) {
            return;
        }
        clip.stop();
    }
    
    public void Abspielen(String sound) { //Methode, die die Sounddatei abspielt

        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sound)); //AIS speichert Audiodateien
            clip = AudioSystem.getClip();    //Datei wird Clip übergeben
            clip.open(audioInputStream);     //Clip wir geöffnet
            clip.start();                    //Clip wird abgespielt

        } catch (Exception e) {
            System.err.println(e);
        }
    }

}

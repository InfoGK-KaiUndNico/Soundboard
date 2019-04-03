package soundboard;

   
import javax.sound.sampled.AudioInputStream;
   import javax.sound.sampled.AudioSystem;
   import javax.sound.sampled.Clip;


public class Song {
public void Abspielen(String sound) {

 
   try {
    AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(this.getClass().getResource(sound));
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start( );
    
    }
       
    catch(Exception e){ 
       
       }
}

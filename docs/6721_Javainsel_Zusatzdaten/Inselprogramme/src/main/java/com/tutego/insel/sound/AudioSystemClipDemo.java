package com.tutego.insel.sound;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioSystemClipDemo {
  public static void main( String[] args )
          throws IOException, UnsupportedAudioFileException, LineUnavailableException {

    URL url = new URL( "https://upload.wikimedia.org/wikipedia/commons/9/98/Beepalert.wav" );
    try ( AudioInputStream audioIn = AudioSystem.getAudioInputStream( url ) ) {
      Clip clip = AudioSystem.getClip();
      clip.open( audioIn );
      clip.start();
      while ( clip.getFramePosition() < clip.getFrameLength() )
        Thread.yield();
      System.out.println( url + " abgespielt" );
      }
    }
}
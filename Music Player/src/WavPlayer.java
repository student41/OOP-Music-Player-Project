import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class WavPlayer {

public static String musicfile = ("8 Moments That Made Us Go Eff This Game.wav");
    public static void main(String[] args) {

        playMusicWAV(musicfile);

    }
//https://www.youtube.com/watch?v=3q4f6I5zi2w. I got this form code from that video.
    public static void playMusicWAV(String filepath)
    {
        InputStream music;

        try
        {
            music = new FileInputStream(new File(filepath));
            AudioStream audio= new AudioStream(music);
            AudioPlayer.player.start(audio);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Cannot load file");
        }
//end of https://www.youtube.com/watch?v=3q4f6I5zi2w

    }

public static void Clip(String filepath){};



}

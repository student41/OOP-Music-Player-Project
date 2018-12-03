

import javax.swing.*;

public class SongDriver {


    public static void main(String[] args) {
        String name;
        double duration;
        String artist;
        String album;


        Song [] songs = new Song[3];

        //enhanced for loop
        for (Song s:  songs){ //Start of enhanced for loop
            name= JOptionPane.showInputDialog("Enter Name");
            duration = Double.parseDouble(JOptionPane.showInputDialog("Enter Duration"));
            artist = JOptionPane.showInputDialog("Enter Artist");
            album= JOptionPane.showInputDialog("Enter Album");
            s = new Song(name,duration,artist,album);
            System.out.println(s.toString());
        }//end of enhanced for loop
    }
}

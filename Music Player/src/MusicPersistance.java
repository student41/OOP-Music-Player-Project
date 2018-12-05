import java.io.*;
import javax.swing.*;

public class MusicPersistance {

    public static void loadPlaylist() throws Exception{
        try {
        String PlaylistName;
        PlaylistName = ("Playlist");
        JOptionPane.showInputDialog("Enter playlist name");
            File	inFile 	= new File(PlaylistName+".data");
            FileInputStream  inFileStream = new FileInputStream(inFile);
            ObjectInputStream in = new ObjectInputStream(inFileStream);

            Song songs  = (Song) in.readObject( );
        JOptionPane.showMessageDialog(null,songs.getName() + " " + songs.getDuration() + " "
                +songs.getArtist() + " " + songs.getAlbum());

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void savePlaylist() throws Exception {


        try {
        String PlaylistName;
        PlaylistName = ("Playlist");
        JOptionPane.showInputDialog("Enter playlist name");

        File	outFile = new File(PlaylistName+".data");
        FileOutputStream  outFileStream	= new FileOutputStream(outFile);
        ObjectOutputStream os= new ObjectOutputStream(outFileStream);

        Song songs;
            String name= JOptionPane.showInputDialog("Enter Name");
            double duration = Double.parseDouble(JOptionPane.showInputDialog("Enter Duration"));
            String artist = JOptionPane.showInputDialog("Enter Artist");
            String album= JOptionPane.showInputDialog("Enter Album");
            songs = new Song(name,duration,artist,album);

        os.writeObject( songs );


            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

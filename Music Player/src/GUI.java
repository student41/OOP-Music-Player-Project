import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class GUI {
//}
/**
 *   GUI: includes one JMenuBar,2 JMenus and 4 JMenuItem objects.
 *   When a menu item is selected, a method will be called to perform an action from another class
 */
public class GUI extends JFrame implements ActionListener
{
    JMenu fileMenu;
    JMenu AudioMenu;
    JLabel response; // to hold a result from the menus

    public static void main(String[] args) {
        GUI frame = new GUI();
        frame.setVisible(true);
    }

    public GUI() {
        Container cPane;

        //sets the frame properties
        setTitle     ("GUI");
        setSize      (300,200);
        setResizable (false);
        setLocation  (250,200);
        // shut down the program when the window is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cPane = getContentPane( );
        cPane.setLayout(new FlowLayout());

        //invoke a user-written method create two menus and their menu items
        // done by separate method to make the constructor shorter
        createFileMenu();
        createAudioMenu();

        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.cyan);
        menuBar.add(fileMenu);
        menuBar.add(AudioMenu);

        //create and position reponse label
        response = new JLabel("Hello, this is your music menu." );
        response.setSize(250, 50); // optional
        cPane.add(response);
    } // end constructor

    /** when an item is clicked, response starts here */
    public void actionPerformed(ActionEvent event) {
        String  menuName;
        menuName = event.getActionCommand();
        //if start
        if (menuName.equals("Quit")) {
            System.exit(0);
        } // end if
        //if start
        if(menuName.equals("Save")){
            try {
                MusicPersistance.savePlaylist();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }//if end
        //if start
        if(menuName.equals("Open...")){
           try {
               MusicPersistance.loadPlaylist();
           } catch (Exception e){
               e.printStackTrace();
           }
        }//if end
        //if start
        if(menuName.equals("Play music")){
            String playingsong = JOptionPane.showInputDialog("enter song name");
            WavPlayer.playMusicWAV(playingsong+".wav");
        }
        //end if

    } // end actionPerformend



    /**  Creates File menu and its menu items */
    private void createFileMenu( ) {
        JMenuItem    item;

        fileMenu = new JMenu("File");


        item = new JMenuItem("Open...");    //Open...
        item.addActionListener( this );
        fileMenu.add( item );

        item = new JMenuItem("Save");       //Save
        item.addActionListener( this );
        fileMenu.add( item );

        item = new JMenuItem("Quit");       //Quit
        item.addActionListener( this );
        fileMenu.add( item );
    } // end createFileMenu

    private void createAudioMenu( ) {
        JMenuItem    item;

        AudioMenu = new JMenu("Audio");

        item = new JMenuItem("Play music");      //Plays music
        item.addActionListener( this );
        AudioMenu.add( item );


    } // end createAudioMenu
} // end class

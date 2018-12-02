/** This class creates a Song Object. Song object contains name,artist,duration and album */
public class Song {
	private String name;
	private double duration;
	private String artist;
	private String album;
	
	// These are accessor methods used to return a copy of an attribute/variable
	public double getDuration() { return duration;}
	public String getArtist() { return artist;}
	public String getName() { return name;}
	public String getAlbum() { return album;}
	// These are mutator methods used to change the value of an attribute/variable
	
	//Start setAlbum
	public void setDuration (double duration) {
				this.duration = duration;
	}
	//End setDuration
	
	//Start setName
	public void setName( String name) {
				this.name = name;
	}
	//End setName
	//Start setArtist
	public void setArtist(String artist) {
				this.artist = artist;
	}
	//End setArtist
	//Start setAlbum
	public void setAlbum(String album) {
				this.album = album;
	}
	//End setAlbum
	
	
	/**This is a full argument constructor used to create a song which contains name,duration,artist and album
	 */
	public Song(String name, double duration, String artist,String album) {
				setName(name);
				setDuration(duration);
				setArtist(artist);
				setAlbum(album);
	}
	
	/** This is a no arguement constructer designed to create a Song object
	 *use Song s = new Song() to create an object of the song class
	 */
	public Song() {
				this("Unknown",0,"Unknown","Unknown");
	}
	
		
	/* Every Song object gets displayed in this format
	*/
	public String toString() {
				return getName() + " " + getDuration() + " " + getArtist() + " " + getAlbum();
	}
}
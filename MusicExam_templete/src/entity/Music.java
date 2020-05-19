package entity;

public class Music {
	//
	private int id;
	private String name;
	private String artist;
	private String album;
	private String image;
	private String agent;
	
	public Music() {
		//empty
	}
	
	public Music(int id, String name, String artist, String album, String image, String agent) {
		//
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.image = image;
		this.agent = agent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}
	
}

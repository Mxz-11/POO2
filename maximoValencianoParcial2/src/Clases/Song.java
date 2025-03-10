package Clases;

public class Song {
	private int id;
	private int year;
	private String artist;
	private String name;
	private static int contador = 0;
	
	
	
	public Song(int year, String artist, String name) {
		super();
		this.year = year;
		this.artist = artist;
		this.name = name;
		id = contador;
		contador++;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "CANCION:year:" + year + ",artist:" + artist + ",name:" + name + "\n";
	}
}

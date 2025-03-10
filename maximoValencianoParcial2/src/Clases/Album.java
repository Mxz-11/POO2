package Clases;

import java.util.HashSet;
import java.util.Set;

public class Album {
	private Set<Song> canciones = new HashSet<>();
	private String name;
	
	public Album(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addCancion(Song s) {
		canciones.add(s);
	}
	
	public Set<Song> getCanciones(){
		return canciones;
	}
	
	@Override
	public String toString() {
		String c = "";
		for (Song s: canciones) {
			c += s.toString();
		}
		return "ALBUM:" + name + "\n" + c;
	}
}

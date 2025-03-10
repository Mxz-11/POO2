package Clases;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	private String name;
	private List<Album> albumes = new ArrayList<>();
	
	public PlayList(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Album> getAlbumes() {
		return albumes;
	}
	
	public void addAlbum(Album a) {
		albumes.add(a);
	}
	
	@Override
	public String toString() {
		String a = "";
		for(Album e: albumes) {
			a += e.toString();
		}
		return "PLAYLIST:" + name + a;
	}
}

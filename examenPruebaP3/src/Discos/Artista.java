package Discos;

import java.util.HashSet;
import java.util.Set;

public class Artista {
	private String nombreArt;
	private Set<Album> albumes = new HashSet<>();
	
	public Artista(String nombreArt) {
		super();
		this.nombreArt = nombreArt;
	}
	
	public void addAlbum(Album c) {
		albumes.add(c);
	}
	
	public String getNombreArt() {
		return nombreArt;
	}
	
	public void setNombreArt(String nombreArt) {
		this.nombreArt = nombreArt;
	}
	
	public Set<Album> getAlbumes() {
		return albumes;
	}
	
	public void setAlbumes(Set<Album> albumes) {
		this.albumes = albumes;
	}
	
	

}

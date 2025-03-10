package Discos;

import java.util.HashSet;
import java.util.Set;

public class Musica {
	private String nombreColec;
	private Set<Artista> art = new HashSet<>();
	
	public Musica(String nombreColec) {
		super();
		this.nombreColec = nombreColec;
	}
	
	public void addArtista(Artista c) {
		art.add(c);
	}
	
	public String getNombreColec() {
		return nombreColec;
	}
	
	public void setNombreColec(String nombreColec) {
		this.nombreColec = nombreColec;
	}
	
	public Set<Artista> getArt() {
		return art;
	}
	
	public void setArt(Set<Artista> art) {
		this.art = art;
	}
	
	public int numAlbumes() {
		int a = 0;
		for (Artista i: art) {
			a+= i.getAlbumes().size();
		}
		return a;
	}
	
	public int numCanciones() {
		int a = 0;
		for (Artista i: art) {
			for (Album ii: i.getAlbumes()) {
				a += ii.getCanciones().size();
			}
		} 
		return a;
	}
}

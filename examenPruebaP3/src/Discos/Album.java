package Discos;

import java.util.HashSet;
import java.util.Set;

public class Album {
	private String nombreAlbum;
	private Set<Cancion> canciones = new HashSet<>();
	
	public Album(String nombre) {
		nombreAlbum = nombre;
	}
	
	public void addCancion(Cancion c) {
		canciones.add(c);
	}
	
	public String getNombreAlbum() {
		return nombreAlbum;
	}
	
	public void setNombreAlbum(String nombreAlbum) {
		this.nombreAlbum = nombreAlbum;
	}
	
	public Set<Cancion> getCanciones() {
		return canciones;
	}
	
	public void setCanciones(Set<Cancion> canciones) {
		this.canciones = canciones;
	}

	
}

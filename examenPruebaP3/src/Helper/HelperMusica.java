package Helper;

import java.util.HashSet;
import java.util.Set;

import Discos.Album;
import Discos.Artista;
import Discos.Cancion;
import Discos.Musica;

public class HelperMusica {
	public static Musica createMusica(int numArt, int numAlb, int numCan, String nom) {
		Musica m = new Musica(nom);
		Set<Cancion> can = new HashSet<>();
		Set<Album> al = new HashSet<>();
		Set<Artista> a = new HashSet<>();
		
		for (int i = 0; i < numCan; i++) {
			Cancion aux = new Cancion("Cancion" + i, 12.4, 2002, "Salsa");
			can.add(aux);
		}
		
		for (int i = 0; i < numArt; i++) {
			Album aux = new Album("Album" + i);
			al.add(aux);
		}
		
		for (Album i: al) {
			i.setCanciones(can);
		}
		
		for (int i = 0; i < numArt; i++) {
			Artista aux = new Artista("Artista" + i);
			a.add(aux);
		}
		
		for (Artista i: a) {
			i.setAlbumes(al);
		}
		
		m.setArt(a);
		
		return m;
	}
}

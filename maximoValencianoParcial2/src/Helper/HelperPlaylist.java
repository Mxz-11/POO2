package Helper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import Clases.Album;
import Clases.PlayList;
import Clases.Song;
import Exceptions.SongsNotFound;

public class HelperPlaylist {
	public static Song createSong(Set<String> canciones, Set<String> artistas) {
		Random rand = new Random();
		Song res = null;
		
		List<String> art = new ArrayList<>(artistas);
		List<String> can = new ArrayList<>(canciones);
		int cancion = rand.nextInt(can.size());
		int artist = rand.nextInt(art.size());
		int anio = rand.nextInt(2024 - 1860) + 1860;
		res = new Song(anio, art.get(artist), can.get(cancion));
		return res;
	}
	
	public static PlayList createPlayList(String name, int numAlbums, int max, int min, Set<Song> canciones, Set<String> artistas) {
		Random rand = new Random();
		PlayList res = new PlayList(name);
		List<String> art = new ArrayList<>(artistas);

		int numAlbum = 1;
		for (int i = 0; i < numAlbums; i++) {
			int maxCanciones = rand.nextInt(max-min) + min;
			Album a = new Album("Default" + numAlbum);
			List<Song> can = new ArrayList<>(canciones);
			for (int j = 0; j < maxCanciones; j++) {
				Song s = new Song(2023, art.get(i), can.get(j).getName());
				a.addCancion(s);
			}
			numAlbum++;
			res.addAlbum(a);
		}
		
		return res;
		
	}
	
	public static List<Song> findSong(String artista, PlayList l) throws SongsNotFound {
		List<Album> al = l.getAlbumes();
		List<Song> res = new ArrayList<>();
		for (Album a: al) {
			List<Song> s = new ArrayList<>(a.getCanciones());
			boolean encontrado = false;
			for (Song j: s) {
				if (j.getArtist() == artista) {
					res.add(j);
					encontrado = true;
				}
			}
			if (!encontrado) {
				throw new SongsNotFound(artista);
			}
		}
		return res;
	}
}

package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import Clases.Album;
import Clases.PlayList;
import Clases.Song;
import Exceptions.SongsNotFound;
import Helper.HelperPlaylist;

public class Pregunta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlayList p = new PlayList("Summer Vibes");
		Set<String> canciones = new HashSet<>(); 
		Set<String> artistas = new HashSet<>();
		
		canciones.add("Hola");
		canciones.add("Mundo");
		canciones.add("Adios");

		artistas.add("BB");
		artistas.add("Anuel");
		artistas.add("DJLuyah");
		
		Random rand = new Random();
		for (int i = 0; i < 40; i++) {
			Album a = new Album("J" + i);
			for (int j = 0; j < (rand.nextInt(10-3) + 3); j++) {
				a.addCancion(HelperPlaylist.createSong(canciones, artistas));
			}
			p.addAlbum(a);
		}
		/*
		Set<String> artistas = new HashSet<>();
		Set<Song> canciones = new HashSet<>();
        
        // Añadir artistas al Set
        artistas.add("Artista1");
        artistas.add("Artista2");
        artistas.add("Artista3");
        artistas.add("Artista4");
        artistas.add("Artista5");
        
        for (int i = 0; i < 4; i++) {
        	canciones.add(new Song(2024, "Artista" + i,"Cancion" + i));
        }
        
        PlayList p = HelperPlaylist.createPlayList("Cos", 4, 2, 1, canciones, artistas);
        
        System.out.println(p.toString());
		*/
		
		List<Song> s;
		try {
			s = HelperPlaylist.findSong("Badbunny", p);
		} catch (SongsNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*String a = "";
		for (Song i: s) {
			a += i.toString();
		}
		System.out.println(a);*/
	}

}

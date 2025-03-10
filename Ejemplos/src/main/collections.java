package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// LISTAS
		// Crear dos listas
        List<String> lista = new ArrayList<String>();
        lista.add("Apple");
        lista.add("Banana");
        lista.add("Cherry");
        List<String> lista2 = Arrays.asList("Apple", "Banana", "Cherry");
        // Comparar las dos listas
        boolean sonIguales = lista.equals(lista2);
        System.out.println("Las dos listas son iguales: " + sonIguales);
        
        //- Verificar si un elemento existe
        boolean existeApple = lista.contains("Apple");
        System.out.println("Existe Apple: " + existeApple);

        //- Obtener el tamaño de la lista
        int tamano = lista.size();
        System.out.println("Tamaño: " + tamano);

        //- Eliminar un elemento
        lista.remove("Apple");
        System.out.println("Lista después de eliminar Apple: " + lista);

        //- Obtener un elemento por su índice
        String primerElemento = lista.get(0);
        System.out.println("Primer elemento: " + primerElemento);

        //- Modificar un elemento por su índice
        lista.set(0, "Pineapple");
        System.out.println("Lista después de modificar el primer elemento: " + lista);

        //- Eliminar todos los elementos
        lista.clear();
        System.out.println("Lista después de eliminar todos los elementos: " + lista);

		// Ordenar la lista
        Collections.sort(lista);
        
        // Mezclar la lista
        Collections.shuffle(lista);
        
        // Invertir la lista
        Collections.reverse(lista);
        
        // Rotar la lista
        Collections.rotate(lista, 1);
        
        // Intercambiar elementos
        Collections.swap(lista, 0, 1);
        
        // Reemplazar todos los elementos
        Collections.replaceAll(lista, "Apple", "Pineapple");
        
        // Llenar la lista
        Collections.fill(lista, "Fruit");
        
        // Copiar la lista
        List<String> copiaLista = new ArrayList<>(Collections.nCopies(lista.size(), ""));
        Collections.copy(copiaLista, lista);
        
        // Búsqueda binaria
        int index = Collections.binarySearch(lista, "Fruit");
        
		
        // HASMAP
        //Crear hashMap
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Apple", 10);
        mapa.put("Banana", 20);
        mapa.put("Orange", 30);

        // Verificar si una clave existe
        boolean e = mapa.containsKey("Apple");
        
        // Verificar si un valor existe
        boolean existeValor = mapa.containsValue(20);
        
        // Obtener el valor de una clave
        int valorApple = mapa.get("Apple");
        
        // Eliminar un elemento
        mapa.remove("Apple");
        
        // Obtener el tamaño del mapa
        int ta = mapa.size();
        
        // Modificar el valor de una clave
        mapa.put("Banana", 25);
        
        // Iterar sobre el mapa
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }

        // Obtener todas las claves
        Set<String> claves = mapa.keySet();
        for (String clave : claves) {
            System.out.println("Clave: " + clave);
        }
        //Obtener todos los valores
        Collection<Integer> valores = mapa.values();
        for (Integer valor : valores) {
            System.out.println("Valor: " + valor);
        }

        // Eliminar todos los elementos				
        mapa.clear();
	        
	        
        
        //HASHSETS
        
        //Crear un HashSet
        Set<String> hashSet = new HashSet<>();
        
        //añadir
        hashSet.add("Apple");
        
        //eliminar
        hashSet.remove("Ordenador");
        
        //Para verificar si contiene un elemento
        boolean existeOrdenador = hashSet.contains("Ordenador");
        
        //para gettear el tamaño de un hashset
        int t = hashSet.size();
        
        //borrar todos los elementos de un hashset
        hashSet.clear();
        
        
        
        //	TREESETS
        
        //Crear un treeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        
        //añadir un elemento
        treeSet.add("Apple");
        
        //primer elemento
        String p = treeSet.first();
        
        //ultimo elemento
        String u = treeSet.last();
        
        
	}

}

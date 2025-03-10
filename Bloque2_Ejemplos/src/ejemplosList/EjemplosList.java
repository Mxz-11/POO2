package ejemplosList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EjemplosList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Apple");
        lista.add("Banana");
        lista.add("Orange");

        /*
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
*/
        


        //! TODO no funciona

        // Ordenar la lista
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);

        // Mezclar la lista
        Collections.shuffle(lista);
        System.out.println("Lista mezclada: " + lista);

        // Invertir la lista
        Collections.reverse(lista);
        System.out.println("Lista invertida: " + lista);

        // Rotar la lista
        Collections.rotate(lista, 1);
        System.out.println("Lista rotada: " + lista);

        // Intercambiar elementos
        Collections.swap(lista, 0, 1);
        System.out.println("Lista después de intercambiar elementos: " + lista);

        // Reemplazar todos los elementos
        Collections.replaceAll(lista, "Apple", "Pineapple");
        System.out.println("Lista después de reemplazar todos los elementos: " + lista);

        // Llenar la lista
        Collections.fill(lista, "Fruit");
        System.out.println("Lista después de llenarla: " + lista);

        // Copiar la lista
        List<String> copiaLista = new ArrayList<>(Collections.nCopies(lista.size(), ""));
        Collections.copy(copiaLista, lista);
        System.out.println("Copia de la lista: " + copiaLista);

        // Búsqueda binaria
        int index = Collections.binarySearch(lista, "Fruit");
        System.out.println("Índice de 'Fruit': " + index);
    }
}
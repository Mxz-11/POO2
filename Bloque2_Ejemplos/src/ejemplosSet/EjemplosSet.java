package ejemplosSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class EjemplosSet {
    public static void main(String[] args) {
        //+ hashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Ordenador");

        System.out.println("HashSet: " + hashSet);

        hashSet.remove("Ordenador");
        System.out.println("HashSet actualizado: " + hashSet);
        boolean existeApple = hashSet.contains("Apple");
        boolean existeOrdenador = hashSet.contains("Ordenador");
        int tamano = hashSet.size();
        System.out.println("Existe Apple: " + existeApple + ", Existe Ordenador: " + existeOrdenador + ", Tamaño: " + tamano);
        hashSet.clear();
        System.out.println("HashSet vacío: " + hashSet);
        System.out.println("\n");

        //+ TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");

        System.out.println("TreeSet: " + treeSet);
        String primerElemento = treeSet.first();
        String ultimoElemento = treeSet.last();
        System.out.println("Primer elemento: " + primerElemento + ", Último elemento: " + ultimoElemento);
        System.out.println("\n");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}

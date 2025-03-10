package ejemplosEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemplosEquals {
    public static void main(String[] args) {
        // Crear dos listas
        List<String> lista1 = new ArrayList<String>();
        lista1.add("Apple");
        lista1.add("Banana");
        lista1.add("Cherry");
        List<String> lista2 = Arrays.asList("Apple", "Banana", "Cherry");

        // Comparar las dos listas
        boolean sonIguales = lista1.equals(lista2);
        System.out.println("Las dos listas son iguales: " + sonIguales);
    }
}
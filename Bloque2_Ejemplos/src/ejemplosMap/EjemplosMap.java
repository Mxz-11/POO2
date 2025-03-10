package ejemplosMap;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class EjemplosMap {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Apple", 10);
        mapa.put("Banana", 20);
        mapa.put("Orange", 30);

        // Verificar si una clave existe
        boolean existeApple = mapa.containsKey("Apple");
        System.out.println("Existe Apple: " + existeApple);

        // Verificar si un valor existe
        boolean existeValor = mapa.containsValue(20);
        System.out.println("Existe el valor 20: " + existeValor);

        // Obtener el valor de una clave
        int valorApple = mapa.get("Apple");
        System.out.println("Valor de Apple: " + valorApple);

        // Eliminar un elemento
        mapa.remove("Apple");
        System.out.println("Mapa después de eliminar Apple: " + mapa);

        // Obtener el tamaño del mapa
        int tamano = mapa.size();
        System.out.println("Tamaño: " + tamano);

        // Modificar el valor de una clave
        mapa.put("Banana", 25);
        System.out.println("Mapa después de modificar Banana: " + mapa);

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
        System.out.println("Mapa después de eliminar todos los elementos: " + mapa);
    }
}
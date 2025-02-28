import java.util.List; // se importo java.utils para evitar errores de compilacíon.
import java.util.Scanner;
import java.util.Collections; 

public class BinarySearch {
    public static int buscar(List<Integer> lista, int objetivo) {
        int inicio = 0;
        int fin = lista.size() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            
            // Si encontramos el elemento
            if (lista.get(medio) == objetivo) {
                return medio; // Devuelve el índice del elemento
            }
            
            // Si el objetivo es mayor que el elemento medio
            if (lista.get(medio) < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        
        return -1; // Si el elemento no está presente en la lista
    }

    public static void opcionBinarySearch(Scanner scanner, List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("❌ No hay datos cargados. Cargue datos primero.");
            return;
        }

        // Ordenar la lista antes de la búsqueda binaria
        Collections.sort(lista);
        System.out.println("📌 La lista se ha ordenado automáticamente para la búsqueda binaria.");

        System.out.print("Ingrese el número que desea buscar: ");
        int objetivo = scanner.nextInt(); // Se eliminó new java.util.Scanner(System.in).nextInt(); y se usó un Scanner existente porque generaba problemas con la entrada de datos.
        

        int resultado = buscar(lista, objetivo);

        if (resultado == -1) {
            System.out.println("❌ El número no está en la lista.");
        } else {
            System.out.println("✅ El número " + objetivo + " se encuentra en el índice: " + resultado);
        }
    }
}
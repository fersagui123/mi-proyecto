import java.util.List;
import java.util.ArrayList;

public class MergeSort {
    public static void ordenar(List<Integer> lista) {
        if (lista.size() < 2) { // 
            return; // Caso base: lista con un solo elemento ya está ordenada
        }

        int mitad = lista.size() / 2; // Calcula la mitad de la lista
        List<Integer> izquierda = new ArrayList<>(lista.subList(0, mitad)); // Dividir la lista en dos sublistas (izquierda y derecha)
        List<Integer> derecha = new ArrayList<>(lista.subList(mitad, lista.size()));

        ordenar(izquierda); // Llamar recursivamente a ordenar para cada mitad
        ordenar(derecha);
        
        merge(lista, izquierda, derecha); // Combinar ambas mitades ordenadas
    }

    private static void merge(List<Integer> lista, List<Integer> izquierda, List<Integer> derecha) {
        int i = 0, j = 0, k = 0;

        // Mezclar las dos listas ordenadas
        while (i < izquierda.size() && j < derecha.size()) {
            if (izquierda.get(i) < derecha.get(j)) {
                lista.set(k++, izquierda.get(i++));
            } else {
                lista.set(k++, derecha.get(j++));
            }
        }

        // Si quedan elementos en la lista izquierda
        while (i < izquierda.size()) {
            lista.set(k++, izquierda.get(i++));
        }

        // Si quedan elementos en la lista derecha
        while (j < derecha.size()) {
            lista.set(k++, derecha.get(j++));
        }
    }

    public static void opcionMergeSort(List<Integer> lista) {
        if (lista.isEmpty()) { // Verifica si la lista está vacía antes de intentar ordenarla
            System.out.println("❌ No hay datos cargados. Cargue datos primero.");
            return;
        }
        ordenar(lista); // Llama al método de ordenamiento Merge Sort
        System.out.println("✅ Lista ordenada con Merge Sort."); // Mensaje que confirla que la lista fue ordenada y la muestra
        System.out.println("📊 Lista ordenada: " + lista);
    }
}
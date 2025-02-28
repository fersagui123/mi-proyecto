import java.util.List; // Importa la clase List para manejar listas de enteros

public class SelectionSort {
    public static void ordenar(List<Integer> lista) {
        int n = lista.size(); // Obtiene el tamaño de la lista
        for (int i = 0; i < n - 1; i++) { // Recorre la lista para encontrar el mínimo en cada iteración
            int indiceMinimo = i; // Se asume que el primer elemento es el menor
            for (int j = i + 1; j < n; j++) { // Busca el menor elemento en el resto de la lista
                if (lista.get(j) < lista.get(indiceMinimo)) {
                    indiceMinimo = j;
                }
            }
            // Intercambiar el mínimo encontrado con el primer elemento no ordenado
            int temp = lista.get(i);
            lista.set(i, lista.get(indiceMinimo));
            lista.set(indiceMinimo, temp);
        }
        System.out.println("✅ Lista ordenada con Selection Sort.");
    }

    public static void opcionSelectionSort(List<Integer> lista) {
        if (lista.isEmpty()) { // Verifica si la lista está vacía antes de intentar ordenarla
            System.out.println("❌ No hay datos cargados. Cargue datos primero.");
            return;
        }
        ordenar(lista); // Llama al método de ordenamiento Selection Sort
        System.out.println("📊 Lista ordenada: " + lista); // Muestra la lista ordenada en consola
    }
}
import java.util.List; // Importa la clase List para manejar listas de enteros

public class BubbleSort {
    public static void ordenar(List<Integer> lista) {
        int n = lista.size(); // Tamaño de la lista
        for (int i = 0; i < n - 1; i++) { // Es un bucle que controla el número de pasadas por la lista
            for (int j = 0; j < n - i - 1; j++) { // Es u bucle que recorre la lista comparando elementos adyacentes
                if (lista.get(j) > lista.get(j + 1)) {
                    // Intercambiar elementos
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1)); // Mueve el elemento siguiente a la posición actual
                    lista.set(j + 1, temp); // Coloca el valor guardado en la posición siguiente
                }
            }
        }
        System.out.println("✅ Lista ordenada con Bubble Sort.");
    }

    public static void opcionBubbleSort(List<Integer> lista) {
        if (lista.isEmpty()) { // Verifica si la lista tiene datos antes de ordenar
            System.out.println("❌ No hay datos cargados. Cargue datos primero.");
            return;
        }
        ordenar(lista); // Llama al método de ordenamiento Bubble Sort
        System.out.println("📊 Lista ordenada: " + lista);
    }
}

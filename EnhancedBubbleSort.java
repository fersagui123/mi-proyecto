import java.util.List; // Importa la clase List para manejar listas de enteros

public class EnhancedBubbleSort {
    public static void ordenar(List<Integer> lista) {
        int n = lista.size(); // Obtiene el tamaño de la lista
        boolean intercambiado; // Verifica si hubo intercambios en una iteración
        
        for (int i = 0; i < n - 1; i++) { // Bucle que controla el número de pasadas por la lista
            intercambiado = false;
            
            for (int j = 0; j < n - i - 1; j++) { // Bucle que recorre la lista comparando elementos adyacentes
                if (lista.get(j) > lista.get(j + 1)) {
                    // Intercambiar elementos
                    int temp = lista.get(j); // Guarda el valor del elemento actual
                    lista.set(j, lista.get(j + 1)); // Mueve el elemento siguiente a la posición actual
                    lista.set(j + 1, temp); // Coloca el valor guardado en la posición siguiente
                    intercambiado = true; // Marca que hubo un intercambio en esta iteración
                }
            }
            
            // Si no hubo intercambios, la lista ya está ordenada
            if (!intercambiado) break;
        }
        System.out.println("✅ Lista ordenada con Enhanced Bubble Sort.");
    }

    public static void opcionEnhancedBubbleSort(List<Integer> lista) {
        if (lista.isEmpty()) { // Verifica si la lista está vacía antes de intentar ordenarla
            System.out.println("❌ No hay datos cargados. Cargue datos primero.");
            return;
        }
        ordenar(lista);
        System.out.println("📊 Lista ordenada: " + lista); // Muestra la lista ordenada en consola
    }
}
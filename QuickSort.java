import java.util.List; // Importa la clase List para manejar listas de enteros

public class QuickSort {
    public static void ordenar(List<Integer> lista, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(lista, inicio, fin); // Encuentra la posición del pivote después de la partición
            ordenar(lista, inicio, indicePivote - 1); // Ordenar los elementos antes y después del pivote recursivamente
            ordenar(lista, indicePivote + 1, fin); // Índice del menor elemento
        }
    }

    private static int particion(List<Integer> lista, int inicio, int fin) {
        int pivote = lista.get(fin);  // Elegimos el último elemento como pivote
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (lista.get(j) < pivote) {
                i++;
                // Intercambiar lista[i] y lista[j]
                int temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }

        // Intercambiar el pivote con lista[i+1] para colocarlo en su posición final
        int temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(fin));
        lista.set(fin, temp);

        return i + 1;  // Retornamos la posición del pivote
    }

    public static void opcionQuickSort(List<Integer> lista) {
        if (lista.isEmpty()) { // Verifica si la lista está vacía antes de intentar ordenarla
            System.out.println("❌ No hay datos cargados. Cargue datos primero.");
            return;
        }
        ordenar(lista, 0, lista.size() - 1); // Llama al método de ordenamiento Quick Sort
        System.out.println("✅ Lista ordenada con Quick Sort."); // Mensaje que confirla que la lista fue ordenada y la muestra
        System.out.println("📊 Lista ordenada: " + lista);
    }
}

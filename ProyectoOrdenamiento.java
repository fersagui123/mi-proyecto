import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProyectoOrdenamiento {

    public static void mostrarInformacion() {
        // Datos fijos del proyecto
        String universidad = "Universidad Da Vinci de Guatemala";
        String curso = "Estructura de Datos";
        String docente = "Ing. Brandon Chitay";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del estudiante
        System.out.print("Ingrese su nombre: ");
        String estudiante = scanner.nextLine();

        // Listas de tareas completadas y pendientes
        List<String> puntosHechos = new ArrayList<>();
        List<String> puntosFaltantes = new ArrayList<>();

        // Se inicia el proyecto con los primeros puntos completados
        puntosHechos.add("1. Información del Desarrollador");
        puntosHechos.add("2. Menú Principal");

        // Lista de tareas restantes
        //puntosFaltantes.add("3. Carga de Datos desde un CSV");
        //puntosFaltantes.add("4. Algoritmo de Ordenamiento - Bubble Sort");
        //puntosFaltantes.add("5. Algoritmo de Ordenamiento - Enhanced Bubble Sort");
        //puntosFaltantes.add("6. Algoritmo de Ordenamiento - Quick Sort");
        //puntosFaltantes.add("7. Algoritmo de Ordenamiento - Selection Sort");
        //puntosFaltantes.add("8. Algoritmo de Ordenamiento - Merge Sort");
        //puntosFaltantes.add("9. Algoritmo de Búsqueda - Binary Search");
        puntosFaltantes.add("10. Presentación Final en YouTube");

        // Mostrar la información en consola
        System.out.println("\n========================================");
        System.out.println(universidad);
        System.out.println(curso);
        System.out.println(docente + "\n");
        System.out.println("Nombre del estudiante: " + estudiante + "\n");

        // Mostrar tareas completadas
        System.out.println("PUNTOS HECHOS:");
        for (String punto : puntosHechos) {
            System.out.println("✅ " + punto);
        }

        // Mostrar tareas pendientes
        //System.out.println("\nPUNTOS FALTANTES:");
        //for (String punto : puntosFaltantes) {
         //   System.out.println("❌ " + punto);
        //}

        System.out.println("========================================");

        // Esperar a que el usuario presione Enter antes de continuar
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();  // Captura la entrada del usuario

        //ACA DECLARE LA LISTA DE DATOS
        List<Integer> listaDatos = new ArrayList<>();

        // Llamar al menú principal
        mostrarMenu(scanner, listaDatos);
    }

        // Método para mostrar el menú principal
    public static void mostrarMenu(Scanner scanner, List<Integer> listaDatos) {
        int opcion;
        do {
            // Mostrar opciones
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1. Cargar datos desde un archivo CSV");
            System.out.println("2. Ordenar datos usando Bubble Sort");
            System.out.println("3. Ordenar datos usando Enhanced Bubble Sort");
            System.out.println("4. Ordenar datos usando Quick Sort");
            System.out.println("5. Ordenar datos usando Selection Sort");
            System.out.println("6. Ordenar datos usando Merge Sort");
            System.out.println("7. Buscar un número con Binary Search");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");

            // Leer opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            // Ejecutar la acción correspondiente
            switch (opcion) {
                case 1:
                    CargaDatosCSV.opcionCargarDatos(scanner, listaDatos);; //Carga de datos de un archivo CSV
                    break;
                case 2:
                    BubbleSort.opcionBubbleSort(listaDatos);; // Ordenamiento usando el método Bubble sort
                    break;
                case 3:
                    EnhancedBubbleSort.opcionEnhancedBubbleSort(listaDatos); // Ordenamiento usando el método Enhanced Bubble Sort
                    break;
                case 4:
                    QuickSort.opcionQuickSort(listaDatos); // Ordenamiento usando el método Quick Sort
                    break;
                case 5:
                    SelectionSort.opcionSelectionSort(listaDatos); // // Ordenamiento usando el método Selection Sort
                    break;
                case 6:
                    MergeSort.opcionMergeSort(listaDatos); // Ordenamiento usando el método Merge Sort
                    break;
                case 7:
                    BinarySearch.opcionBinarySearch(scanner, listaDatos); // Búsqueda binaria en la lista de datos. Cambie esta linea ya que ahora requiere un scanner como parametro.
                    break;
                case 8:
                    CargarDatosCSV.opcionCargarDatos(scanner, listaDatos);
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Intente de nuevo."); // Mensaje de error para opciones inválidas
            }
        } while (opcion != 8);
    }

    public static void main(String[] args) {
        mostrarInformacion();  // Llamamos a la función principal
    }
}

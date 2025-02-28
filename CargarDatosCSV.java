import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CargarDatosCSV { // Esta es la clase que utilizamos para cargar un archivo CSV

    public static List<Integer> cargarDesdeCSV(String archivo) {
        List<Integer> lista = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) { // Leer el archivo línea por línea
                String[] numeros = linea.split(","); // Separar los números si están en una misma línea separados por comas
                for (String num : numeros) {
                    try {
                        lista.add(Integer.parseInt(num.trim())); // Convertir y agregar a la lista
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Error al procesar el número: " + num); // Manejar error si el dato no es un número válido
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage()); // Manejo de error si no se puede leer el archivo
        }
        
        return lista; // Retorna la lista con los números cargados
    }

    public static void opcionCargarDatos(Scanner scanner, List<Integer> lista) {
    System.out.print("Ingrese la ruta del archivo CSV: ");
    String archivo = scanner.nextLine(); // Ahora usamos el Scanner existente

    lista.clear();  // Limpiar la lista antes de cargar nuevos datos
    List<Integer> datosCargados = cargarDesdeCSV(archivo); // Cargar datos desde el archivo CSV

    if (datosCargados.isEmpty()) { // Verifica si se cargaron datos correctamente
        System.out.println("❌ No se cargaron datos del archivo.");
    } else {
        lista.addAll(datosCargados); // Agrega los datos cargados a la lista
        System.out.println("✅ Datos cargados correctamente.");
        System.out.println("📊 Datos cargados: " + lista);
    }
}

}
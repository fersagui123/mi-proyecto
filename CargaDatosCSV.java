import java.io.*;
import java.util.*;

public class CargaDatosCSV {
    public static List<Integer> cargarDatos(String nombreArchivo) {
        List<Integer> datos = new ArrayList<>(); // Lista donde se almacenarán los datos del archivo
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) { // Lee el archivo línea por línea
                try {
                    datos.add(Integer.parseInt(linea.trim()));
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Dato inválido en el archivo: " + linea);
                }
            }
            System.out.println("✅ Datos cargados exitosamente desde " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage()); // Captura errores si el archivo no se puede leer
        }
        return datos;
    }

    public static void opcionCargarDatos(Scanner scanner, List<Integer> listaDatos) {
        System.out.print("📂 Ingrese el nombre del archivo CSV: ");  // Solicita al usuario el nombre del archivo CSV
        String nombreArchivo = scanner.nextLine();
        List<Integer> datosCargados = cargarDatos(nombreArchivo); // Cargar datos desde el archivo CSV
        if (!datosCargados.isEmpty()) {
            listaDatos.clear(); // Borra los datos anteriores
            listaDatos.addAll(datosCargados); // Agrega los nuevos datos
        }
    }
}

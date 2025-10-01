import java.io.*; // Importa las clases necesarias para manejo de archivos

public class TrabajoConArchivos {

    public static void main(String[] args) {
        
        // Nombre del archivo de texto
        String nombreArchivo = "mis_notas.txt";

        // ===============================
        // ESCRITURA EN EL ARCHIVO DE TEXTO
        // ===============================
        try {
            // FileWriter permite escribir en el archivo
            FileWriter fw = new FileWriter(nombreArchivo);
            // PrintWriter facilita la escritura de líneas completas
            PrintWriter pw = new PrintWriter(fw);

            // Escribimos al menos tres líneas en el archivo
            pw.println("Hay que asegurarse de cerrar correctamente cada archivo.");
            pw.println("Hoy aprendí a manejar mejor GitHub, antes me demoraba bastante.");
            pw.println("Agregar notas eb el programa ayuda a entender mejor lo que se va haciendo.");

            // Cerramos el escritor para que se guarde el contenido
            pw.close();

            System.out.println("Archivo creado y notas escritas correctamente.\n");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }

        // ===============================
        // LECTURA DEL ARCHIVO DE TEXTO
        // ===============================
        try {
            // FileReader permite leer caracteres desde el archivo
            FileReader fr = new FileReader(nombreArchivo);
            // BufferedReader permite leer línea por línea
            BufferedReader br = new BufferedReader(fr);

            String linea;
            // Ciclo para leer hasta que no haya más líneas
            while ((linea = br.readLine()) != null) {
                System.out.println("Nota: " + linea);
            }

            // Cerramos el lector
            br.close();

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}

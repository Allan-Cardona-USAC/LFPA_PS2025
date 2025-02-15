package main;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author allan
 */
public class CargaArchivo {

    public static void main(String[] args) {
        Reporte repo = new Reporte();
        Scanner scr = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("|----------------------------------|");
            System.out.println("|       MENU PRINCIPAL        |");
            System.out.println("|----------------------------------|");
            System.out.println("| 1.CARGAR ARCHIVO        |");
            System.out.println("| 2.REPO. DE ATAQUE        |");
            System.out.println("| 3.FINALIZAR                      |");
            System.out.println("|----------------------------------|");
            System.out.print("SELECCIONA UNA OPCION > ");
            opcion = scr.nextInt();
            scr.nextLine(); 

            switch (opcion) {
                case 1:
                    // Abrir el cuadro de diálogo para seleccionar un archivo
                    JFileChooser fileChooser = new JFileChooser();
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos LFP (.lfp)", "lfp");
                    fileChooser.setFileFilter(filter); // Filtro para archivos .lfp
                    int seleccion = fileChooser.showOpenDialog(null);

                    if (seleccion == JFileChooser.APPROVE_OPTION) {
                        File archivo = fileChooser.getSelectedFile();
                        try {
                            repo.cargarArchivo(archivo.getAbsolutePath());
                            System.out.println("Archivo cargado exitosamente: " + archivo.getName());
                        } catch (IOException e) {
                            System.out.println("Error al cargar el archivo: " + e.getMessage());
                        }
                    } else {
                        System.out.println("No se seleccionó ningún archivo.");
                    }
                    
                    break;
                case 2:
                    String archivoAtaque = "Report.html";
                    repo.generarReporteAtaqueHTML(archivoAtaque);
                    System.out.println("Reporte Guardado Correctamente");
                   
                    //Actualización del explorador de archivos (Windows)
                    try {
                        File file = new File(archivoAtaque);
                        if (file.exists()) 
                        {
                            String carpeta = file.getParent(); // Obtiene la carpeta del archivo
                            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "start", "explorer.exe", "/select,", file.getAbsolutePath());
                            pb.start();
                        } else 
                        {
                            System.out.println("El archivo no existe.");
                        }
                    } catch (IOException e) 
                    {
                        System.out.println("Error al actualizar el explorador: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
        scr.close();
    
    }
}

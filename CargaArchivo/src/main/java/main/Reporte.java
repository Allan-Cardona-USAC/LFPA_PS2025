package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author allan
 */
public class Reporte {
    private List<Ingenieros> inges;
    public Reporte() 
    {
        inges = new ArrayList<>();

    }
    public void cargarArchivo(String archivo) throws IOException 
    {
        BufferedReader buffer = new BufferedReader(new FileReader(archivo));
        buffer.readLine();
        String linea;
        
        while ((linea = buffer.readLine()) != null) 
        {
            String[] datos = linea.split("\\|");
            String nombre = datos[0];                           
            int salud = Integer.parseInt(datos[1]);             
            int ataque = Integer.parseInt(datos[2]);            
            int defensa = Integer.parseInt(datos[3]);           

            inges.add(new Ingenieros(nombre, salud, ataque, defensa));
        }
        buffer.close();
    }
    public void generarReporteAtaqueHTML(String archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            writer.write("<html>");
            writer.write("<head><title>COECYS</title></head>");
            writer.write("<link rel='stylesheet' type='text/css' href='Style.css'>"); 
            writer.write("<body>");
            writer.write("<h1>TOP 5 MEJORES INGENIERIAS</h1>");
            writer.write("<table border='1'>");
            writer.write("<tr><th>Nombre</th><th>Salud</th><th>Ataque</th><th>Defensa</th></tr>");
            for (int i = 0; i < Math.min(5, inges.size()); i++) {
                Ingenieros p = inges.get(i);
                writer.write("<tr>");
                writer.write("<td>" + p.getNombre() + "</td>");
                writer.write("<td>" + p.getSalud() + "</td>");
                writer.write("<td>" + p.getAtaque() + "</td>");
                writer.write("<td>" + p.getDefensa() + "</td>");
                writer.write("</tr>");
            }
            writer.write("</table>");
            writer.write("</body>");
            writer.write("</html>");
            System.out.println("Reporte Generado: " + archivo);
        } catch (IOException e) {
            System.out.println("Error al generar el reporte HTML: " + e.getMessage());
        }
    }
}

package main;

/**
 *
 * @author allan
 */
import java.util.Scanner;
public class MetodosObjetos {
    
// Método principal para probar la clase 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //////////////////JUGADOR 01//////////////////////
        System.out.println("Ingrese el Nombre de su Skin");
        String skin = sc.nextLine();
        System.out.println("Ingresa el Precio de tu Skin en Pavos");
        int vBucks = sc.nextInt();
        //////////////////JUGADOR 02//////////////////////
        System.out.println("Ingrese el Nombre de su Skin");
        String skin2 = sc.nextLine();
        System.out.println("Ingresa el Precio de tu Skin en Pavos");
        int vBucks2 = sc.nextInt();
        // Crear dos personajes para la batalla
        VideoJuego Player1 = new VideoJuego(skin, vBucks, 100, 20, 10);
        VideoJuego Player2 = new VideoJuego(skin2, vBucks2, 100, 25, 5);

        // Mostrar el estado inicial de ambos personajes
        Player1.mostrarEstado();
        Player2.mostrarEstado();

        System.out.println(); // Línea en blanco para separar las acciones
       
    }
}

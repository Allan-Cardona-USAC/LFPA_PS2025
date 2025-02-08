
package main;
/**
 *
 * @author allan
 */
import java.util.Scanner;
public class VideoJuego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
         int score = (int) (Math.random() * 31) + 30;  // Genera un número entre 30 y 60 para que sea el daño recibido
         int score2 = (int) (Math.random() * 21) + 20;
         //////////////////JUGADOR 01//////////////////////
        System.out.println("//////////////////JUGADOR 01//////////////////////");
        System.out.println("Ingrese el Nombre de su Skin");
        String skin = sc.nextLine();
        System.out.println("Ingrese la rareza de su Arma");
        String cat = sc.nextLine();
        //////////////////JUGADOR 02//////////////////////
        System.out.println("//////////////////JUGADOR 02//////////////////////");
        System.out.println("Ingrese el Nombre de su Skin");
        String skin2 = sc.nextLine();
        System.out.println("Ingrese la rareza de su Arma");
        String cat2 = sc.nextLine();
        // Crear dos personajes para la batalla
        Jugador Player1 = new Jugador(skin, cat,"M-4", score, 100, 0);
        Jugador Player2 = new Jugador(skin2, cat2,"Escopeta", score2, 100, 0);
        // Mostrar el estado inicial de ambos personajes
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        Player1.inicioDePartida();
        Player2.inicioDePartida();
        
        System.out.println("Jugador"+ skin2 +" le quito " + score + "  de vida ahora solo tiene"+Player1.atacar(score));
        System.out.println("Jugador"+ skin + " le quito " + score2 + " de vida ahora solo tiene"+Player1.atacar(score2));
        
        
        System.out.println("----------------------------------------------------------");
        Player1.tomarEscudo();
        
       
        System.out.println("----------------------------------------------------------");
        System.out.println("Finalizacion de la Partida");
         System.out.println("----------------------------------------------------------");
        Player1.mostrarEstado();
        System.out.println("Salus Actual " + Player1.atacar(score));
        System.out.println("**********************************");
        Player2.mostrarEstado();
        System.out.println("Salus Actual " + Player2.atacar(score2));
        System.out.println("**********************************");
        
    }
}

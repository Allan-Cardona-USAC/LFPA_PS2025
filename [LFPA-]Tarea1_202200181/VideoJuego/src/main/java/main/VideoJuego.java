
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
        System.out.println("|----------------------------------------|");
        System.out.println("|        JUGADOR NUMERO 1       |");
        System.out.println("|----------------------------------------|");
        System.out.println("Ingrese el Nombre de su Skin");
        String skin = sc.nextLine();
        System.out.println("Ingrese la rareza de su Arma (Comun, Rara, Epica, Legendaria):");
        String cat = sc.nextLine();
        //ciclo que se repita mientras la rarezas sean diferentes a las establecidas
        while (!cat.equals("Comun") && !cat.equals("Rara") && !cat.equals("Epica") && !cat.equals("Legendaria")) {
        System.out.println("Rareza no valida. Ingrese nuevamente:");
        cat = sc.nextLine();
        }
        //////////////////JUGADOR 02//////////////////////
        System.out.println("|----------------------------------------|");
        System.out.println("|        JUGADOR NUMERO 2       |");
        System.out.println("|----------------------------------------|");
        System.out.println("Ingrese el Nombre de su Skin");
        String skin2 = sc.nextLine();
        //ciclo que se repita mientras la rarezas sean diferentes a las establecidas
        System.out.println("Ingrese la rareza de su Arma (Comun, Rara, Epica, Legendaria):");
        String cat2 = sc.nextLine();
        while (!cat2.equals("Comun") && !cat2.equals("Rara") && !cat2.equals("Epica") && !cat2.equals("Legendaria")) {
        System.out.println("Rareza no valida. Ingrese nuevamente:");
        cat2 = sc.nextLine();
        }
        // Crear dos personajes para la batalla
        Jugador Player1 = new Jugador(skin, cat,"M-4", 0, 100, 0);
        Jugador Player2 = new Jugador(skin2, cat2,"Escopeta", 0, 100, 0);
        // Mostrar el estado inicial de ambos personajes
        System.out.println("|----------------------------------------|");
        System.out.println("|         ESTADO INICIAL          |");
        System.out.println("|----------------------------------------|");
        Player1.inicioDePartida();
        Player2.inicioDePartida();
        //Ataque
        System.out.println("|----------------------------------------|");
        System.out.println("|              ATAQUE                      |");
        System.out.println("|----------------------------------------|");
        System.out.println("Jugador  "+ skin2 +" le quito  " + score + " a  "+ skin +  " ahora solo tiene  "+Player1.atacar(score) + " de vida");
        System.out.println("Jugador  "+ skin + " le quito  " + score2 + " a  "+ skin2 + " ahora solo tiene  "+Player2.atacar(score2)+ " de vida");
        
        // Tomar Escudo
        System.out.println("|----------------------------------------|");
        System.out.println("|          TOMMAR ESCUDO              |");
        System.out.println("|----------------------------------------|");
        Player1.tomarEscudo();
        
       
        System.out.println("|----------------------------------------|");
        System.out.println("|            ESTADO FINAL               |");
        System.out.println("|----------------------------------------|");
        Player1.mostrarEstado();
        System.out.println("**********************************");
        Player2.mostrarEstado();
        System.out.println("**********************************");
        
    }
}

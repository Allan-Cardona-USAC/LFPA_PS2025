
package main;

/**
 *
 * @author allan
 */
public class Jugador {
    /**Sus atributos son 
     * Nombre del personaje
     * Rareza del Personaje
     * Arma Utilizada
     * Daño Recibido
     * Vida del Personaje
     * Escudo del Personaje.**/
    String nombre, rareza, arma;
    int danio, salud, escudo;
    // Constructor para inicializar los atributos del personaje
    public Jugador(String nombre,String rareza,String arma, int danio, int salud, int escudo)
    {
        this.nombre = nombre;// Asigna el nombre del personaje
        this.rareza = rareza;
        this.arma = arma;
        this.danio = danio;
        this.salud = salud;
        this.escudo = escudo;

    }
    //Metodo para actualizar Salud despues de un ataque
    public int atacar(int danioRecibido) {
    this.salud = (this.salud + this.escudo) - danioRecibido;
    return this.salud;
    }
    
    // Método para defender (aumenta temporalmente la defensa)
    public void tomarEscudo() {
    if (this.escudo < 100) { // Supongamos que 100 es el máximo
        this.escudo += 50;
        System.out.println(nombre + " se tomo un escudo de 50+.");
    } else {
        System.out.println(nombre + " ya tiene el escudo al máximo.");
    }
}
    // Método para mostrar el estado de inicio de los personaje
    public void inicioDePartida() 
            
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("ID      "+ "            Rareza      "+ "        Arma        "+ "    danio        "+ "   Salud       "+ "        Escudo");
        System.out.println("*************************************************");
        System.out.println( ""+nombre+"              "+ rareza+"          "+ arma+"         "+ danio+"           "+ salud+"             "+ escudo);
        System.out.println("--------------------------------------------------------------");
    }
    // Método para mostrar el estado actual del personaje
    public void mostrarEstado() {
    System.out.println("Estado de " + nombre + ":");   
    System.out.println("Escudo: " + escudo);
    System.out.println("Salud: " + salud);
    }

}

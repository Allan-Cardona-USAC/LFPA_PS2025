
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
    public int atacar(int actualizarSalud)
    {
        int resultado = (this.salud + this.escudo) - danio;
        return resultado;
    }
    // Método para defender (aumenta temporalmente la defensa)
    public void tomarEscudo() 
    {
         
        escudo += 50; // Aumenta la salud en 50 
        System.out.println(nombre + " Se tomo Un Escudo de 50+.");
    }
    // Método para mostrar el estado de inicio de los personaje
    public void inicioDePartida() 
            
    {
        System.out.println("*************************************************");
        System.out.println("ID       "+ "Rareza        "+ "Arma        "+ "daño        "+ "Salud        "+ "Escudo");
        System.out.println("*************************************************");
        System.out.println( ""+nombre+"       "+ rareza+"       "+ arma+"       "+ danio+"       "+ salud+"      "+ escudo);
        System.out.println("*************************************************");
    }
    // Método para mostrar el estado actual del personaje
    public void mostrarEstado() {
        System.out.println("**********************************");
        System.out.println("Estado de " + nombre + ":");
        System.out.println("Arma: " + arma);
        System.out.println("Escudo: " + escudo);
        System.out.println("Daño Recibido: " + danio);
       
    }

}

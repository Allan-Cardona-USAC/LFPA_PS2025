package main;

/**
 *
 * @author allan
 */
public class VideoJuego {
    /**Sus atributos son 
     * Nombre del personaje
     * Nivel del Personaje
     * Vida del Personaje
     * Habilidad del Personaje
     * Escudo del Personaje.**/
    String nombre;
    int precio, salud, fuerza, defenza;
    // Constructor para inicializar los atributos del personaje
    public VideoJuego(String nombre, int precio, int salud, int fuerza, int defenza)
    {
        this.nombre = nombre;// Asigna el nombre del personaje
        this.precio = precio;
        this.salud = salud;
        this.fuerza = fuerza;
        this.defenza = defenza;

    }
    // Método para atacar a otro personaje
    public void atacar(VideoJuego enemigo)
    {
        int danio = fuerza - enemigo.defenza; // Calcula el daño basado en la fuerza del atacante y la defensa del enemigo
        if (danio > 0) {
            enemigo.salud -= danio; // Reduce la salud del enemigo por el daño calculado
            System.out.println(nombre + " ataca a " + enemigo.nombre + " y le causa " + danio + " de daño.");
        } else {
            System.out.println(nombre + " ataca a " + enemigo.nombre + ", pero su defensa es demasiado fuerte.");
        }

        // Si la salud del enemigo baja a cero o menos, queda fuera de combate
        if (enemigo.salud <= 0) {
            enemigo.salud = 0; // Asegura que la salud no sea negativa
            System.out.println(enemigo.nombre + " ha sido derrotado.");
        }
    
    
    }
    
     // Método para defender (aumenta temporalmente la defensa)
    public void defender() 
    {
        defenza += 5; // Aumenta la defensa en 5 puntos temporalmente
        System.out.println(nombre + " adopta una posición defensiva. Defensa aumentada.");
    }
    // Método para subir de nivel y mejorar las estadísticas
    public void subirNivel() 
    {
        precio++; // Incrementa el nivel del personaje
        salud += 20; // Incrementa la salud en 20
        fuerza += 5; // Incrementa la fuerza en 5
        defenza += 3; // Incrementa la defensa en 3
        System.out.println(nombre + " vale " + precio + ". ¡V-Bucks!");
    }
    // Método para mostrar el estado actual del personaje
    public void mostrarEstado() 
    {
        System.out.println("*************************************************");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Skin", "Nivel", "Salud", "Fuerza", "Defensa", "Precio");
        System.out.println("*************************************************");
        System.out.printf("%-10s %-10d %-10d %-10d %-10d %-10d\n", nombre, precio, salud, fuerza, defenza, precio);
        System.out.println("*************************************************");
    }
  
}

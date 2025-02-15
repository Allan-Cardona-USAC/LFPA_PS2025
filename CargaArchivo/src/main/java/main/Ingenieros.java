
package main;
/**
 *
 * @author allan
 */

public class Ingenieros {
    // Atributos
    
    private String nombre;
    private int salud;
    private int ataque;
    private int defensa;
    
    //Constructor de la clase Jugadores
    public Ingenieros(String nombre, int salud, int ataque, int defensa) 
    {
        this.nombre = nombre;
        this.salud = salud;    
        this.ataque = ataque;    
        this.defensa = defensa;    
    }
   

    public String getNombre() 
    {
        return nombre;
    }
    public int getAtaque() 
    {
        return ataque;
    }
    public int getDefensa() 
    {
        return defensa;
    }
    public int getSalud() 
    {
        return salud;
    }
    
    
}


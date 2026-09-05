package guia3.punto7;
import java.lang.reflect.Array;
import java.util.*;
public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String n){
        this.nombre=n;
    }

    public double indiceAtaque() {
        double suma=0;
        int i;
        for(i=0; i < jugadores.size(); i++)
            suma += jugadores.get(i).indiceAtaque();
        return suma;
    }

    public double indiceDefensa() {
        double suma=0;
        int i;
        for(i=0; i < jugadores.size(); i++)
            suma += jugadores.get(i).indiceDefensa();
        return suma;
    }
    public String agregaDelantero(String nombre,  double velocidad, double potencia){
        if(velocidad > 1 || velocidad <0)
            return "Imposible agregar jugador con velocidad de " + velocidad;
        else
            if(potencia > 1 || potencia <0)
                return "Imposible agregar jugador con potencia de " + potencia;
            else {
                jugadores.add(new Delantero(nombre, velocidad, potencia));
                return "Jugador " + nombre + " agregado correctamente";
            }
    }
    
    public String agregaDefensa(String nombre,  double velocidad, double potencia){
        if(velocidad > 1 || velocidad <0)
            return "Imposible agregar jugador con velocidad de " + velocidad;
        else
            if(potencia > 1 || potencia <0)
                return "Imposible agregar jugador con potencia de " + potencia;
            else {
                jugadores.add(new Defensa(nombre, velocidad, potencia));
                return "Jugador " + nombre + " agregado correctamente";
            }
    }
    public String agregaArquero(String nombre,  double velocidad, double potencia){
        if(velocidad > 1 || velocidad <0)
            return "Imposible agregar jugador con velocidad de " + velocidad;
        else
            if(potencia > 1 || potencia <0)
                return "Imposible agregar jugador con potencia de " + potencia;
            else {
                jugadores.add(new Arquero(nombre, velocidad, potencia));
                return "Jugador " + nombre + " agregado correctamente";
            }
    }
    public void eliminarJugador(Jugador j){
        int i=0;
        while(i < jugadores.size() && jugadores.get(i) != j)
            i++;
        if(i < jugadores.size())
            jugadores.remove(j);
    }
    public Iterator<Jugador> getJugadores(){
        return jugadores.iterator();
    }

}

package guia2.punto8;
import java.util.*;
public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;
    private int cantGanados, cantEmpatados, cantPerdidos, golesFavor, golesContra;

    public Equipo(String nombre){
        this.jugadores = new ArrayList<Jugador>();
        this.nombre = nombre;
        this.cantGanados = 0;
        this.cantEmpatados = 0;
        this.cantPerdidos = 0;
        this.golesFavor = 0;
        this.golesContra = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantGanados() {
        return cantGanados;
    }

    public void setCantGanados(int cantGanados) {
        this.cantGanados = cantGanados;
    }

    public int getCantEmpatados() {
        return cantEmpatados;
    }

    public void setCantEmpatados(int cantEmpatados) {
        this.cantEmpatados = cantEmpatados;
    }

    public int getCantPerdidos() {
        return cantPerdidos;
    }

    public void setCantPerdidos(int cantPerdidos) {
        this.cantPerdidos = cantPerdidos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int cantJugados(){
        return cantEmpatados + cantGanados + cantPerdidos;
    }

    public int getPuntos(){
        return cantEmpatados + 3*cantGanados;
    }

    public Jugador goleador(){
        int i;
        Jugador maximo = new Jugador("", "", 0, 0);
        for(i=0; i< jugadores.size(); i++){
            if(jugadores.get(i).getGoles() > maximo.getGoles())
                maximo = jugadores.get(i);
        }
        return maximo;
    }

}

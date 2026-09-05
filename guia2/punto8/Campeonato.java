package guia2.punto8;
import java.util.*;
public class Campeonato {
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;

    public Campeonato(){
        equipos = new ArrayList<Equipo>();
        partidos = new ArrayList<Partido>();
    }

    public Equipo compPuntos(Equipo e1, Equipo e2){
        if(e1.getPuntos() > e2.getPuntos() || e1.getGolesFavor() > e2.getGolesFavor() || e1.getGolesContra() < e2.getGolesContra())
            return e1;
        else
            if(e1.getPuntos() < e2.getPuntos() || e1.getGolesFavor() < e2.getGolesFavor() || e1.getGolesContra() > e2.getGolesContra())
                return e2;
            else
                return e1;
    }

    public Jugador compGoleador(Equipo e1, Equipo e2){
        return (e1.goleador().getGoles() > e2.goleador().getGoles())? e1.goleador():e2.goleador();
    }
}

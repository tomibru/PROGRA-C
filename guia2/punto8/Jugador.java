package guia2.punto8;

public class Jugador {
    private String nombre, fechaNacimiento;
    private int dorsal, posicion, partidosJugados, goles;

    public Jugador(String nombre, String fn, int dorsal, int posicion){
        this.nombre = nombre;
        this.fechaNacimiento = fn;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.partidosJugados = 0;
        this.goles = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public float golesXpartido(){
        return this.getGoles() / this.getPartidosJugados();
    }

    public Jugador compGoles(Jugador j1, Jugador j2){
        return (j1.getGoles() > j2.getGoles()) ? j1 : j2; 

    }
}
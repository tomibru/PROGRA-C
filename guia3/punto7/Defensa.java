package guia3.punto7;

public class Defensa extends Jugador{
    public Defensa(String nombre, double velocidad, double potencia) {
        super(nombre, velocidad, potencia);
    }
    public double indiceDefensa() {
        return this.getVelocidad()* this.getVelocidad();
    }
    public double indiceAtaque() {
        return this.getPotencia()* this.getPotencia();
    }
    @Override
    public String toString() {
        return "Defensor " + super.toString();
    }
}

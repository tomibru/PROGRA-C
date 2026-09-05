package guia3.punto7;

public class Delantero extends Jugador{
    public Delantero(String nombre, double velocidad, double potencia) {
        super(nombre, velocidad, potencia);
    }
    public double indiceDefensa() {
        return this.getVelocidad()* 0.5;
    }
    public double indiceAtaque() {
        return this.getPotencia()* this.getVelocidad();
    }
     @Override
    public String toString() {
        return "Delantero " + super.toString();
    }
}
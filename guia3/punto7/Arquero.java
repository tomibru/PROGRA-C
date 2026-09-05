package guia3.punto7;

public class Arquero extends Jugador{
    private double efectividad;

    public Arquero(String nombre, double velocidad, double potencia) {
        super(nombre, velocidad, potencia);
        this.efectividad = 0.5;
    }
    public void setEfectividad(double efectividad) {
        this.efectividad = efectividad;
    }

    public double indiceDefensa(){
        return this.efectividad;
    }
    public double indiceAtaque(){
        return 0.1 * this.getVelocidad() * this.getPotencia();
    }
    @Override
    public String toString() {
        return "Arquero " + super.toString() + " | Efectividad: " + this.efectividad;
    }
}

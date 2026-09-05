package guia3.punto7;

public abstract class Jugador {
    private String nombre;
    private double velocidad, potencia;

    public Jugador(String n, double v, double p){
        this.nombre=n;
        this.potencia=p;
        this.velocidad=v;
    }
    public String getNombre() {
        return nombre;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public abstract double indiceDefensa();
    public abstract double indiceAtaque();

    @Override
    public String toString() {
        return "Nombre: " + nombre + 
               " | Velocidad: " + velocidad + 
               " | Potencia: " + potencia + 
               " | Ind. Ataque: " + indiceAtaque() + 
               " | Ind. Defensa: " + indiceDefensa();
    }
}

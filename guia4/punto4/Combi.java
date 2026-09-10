package punto4;

public class Combi extends Vehiculo {
    private int plazas;

    public Combi(String p, int plazas){
        super(p);
        this.plazas = plazas;
    }

    @Override 
    public double getPrecioreal(int dias){
        return dias*this.precioBase + plazas * 0.02 * this.precioBase;
    }

    
}

package punto4;

public class Camion extends Vehiculo {

    public Camion(String p){
        super(p);
    }
    
    @Override 
    public double getPrecioreal(int dias){
        return dias * this.precioBase + 0.4 * this.precioBase;
    }
}

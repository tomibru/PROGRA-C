package punto4;

public class Camioneta extends Vehiculo {
    private double PMA;

    public Camioneta(String p,double PMA){
        super(p);
        this.PMA = PMA;
    }
    
    @Override 
    public double getPrecioreal(int dias){
        return dias*(this.precioBase + 0.2 * PMA * this.precioBase);
    }
}

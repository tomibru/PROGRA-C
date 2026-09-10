package punto4;

public class Auto extends Vehiculo {
    private int plazas;

    public Auto(String p, int plazas){
        super(p);
        this.plazas = plazas;
    }
    
    @Override 
    public double getPrecioreal(int dias){
        return dias*(this.precioBase + plazas * 0.015 * this.precioBase);
    }

}

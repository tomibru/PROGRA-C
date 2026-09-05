import java.util.*;

public class Corriente extends Cuenta{
    private double tope;

    public Corriente(String t, double tope){
        super(t);
        this.tope = tope;
    }
    public void modificarTope(double t){
        this.tope = t;
    }

    @Override
    public boolean extraer(double importe){
        if(this.getSaldo() + this.getTope() >= importe){
            this.saldo -= importe;
            return true;
        }else
            return false;
    }
}
import java.util.*;

public class Universitaria extends Cuenta{
    private double acumDiario;
    private static double maximoDiario=1000;

    public Universitaria(String titular){
        super(t);
        this.acumDiario=0;
    }

    public void reiniciar(){
        this.acumDiario=0;
    }
    public double getAcumDiario(){
        return this.acumDiario;
    }

    @Override
    public boolean extraer(double importe){
        if((this.getAcumDiario() + importe <= maximoDiario) && (this.getSaldo >= importe)){
            this.saldo -= importe;
            this.acumDiario+= importe;
            return true;
        }else
            return false;
    }

}
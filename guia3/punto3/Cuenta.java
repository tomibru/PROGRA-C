import java.util.*;

public abstract class Cuenta{
    protected String titular;
    protected double saldo;

    public Cuenta(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public abstract boolean extraer(double importe);

    public void depositar(double importe){
        if(importe > 0)
            this.saldo += importe;
    }

}
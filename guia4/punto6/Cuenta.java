package punto6;
import java.util.*;

public abstract class Cuenta{
    protected String titular;
    protected double saldo;

    public String getTitular(){
        return this.titular;
    }
    /**
     * Incrementa el saldo del objeto
     * Pre: El monto debe ser > 0
     * Post: El saldo del objeto se incrementara
     * @param monto Cantidad de dinero a depositar
     */
    public void Deposito(double monto){
        this.saldo+= monto;
    }

    public double extraer(double monto){

        validaExtraccion();
    }
    public void validaExtraccion(){

    }
}